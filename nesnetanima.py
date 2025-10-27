import cv2
import numpy as np

# Şekil tanımlama fonksiyonu
def get_shape(approx):
    if len(approx) == 3:
        return "Üçgen"
    elif len(approx) == 4:
        return "Kare/Dörtgen"
    elif len(approx) > 4:
        return "Daire"
    return "Bilinmiyor"

cap = cv2.VideoCapture(0)  # Kamerayı aç

while True:
    ret, frame = cap.read()
    if not ret:
        break
    
    gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)  # Gri tonlama
    blurred = cv2.GaussianBlur(gray, (5, 5), 0)  # Gri tonlamayı yumuşat

    # Kenar tespiti
    edges = cv2.Canny(blurred, 50, 150)

    # Konturları bul
    contours, _ = cv2.findContours(edges.copy(), cv2.RETR_TREE, cv2.CHAIN_APPROX_SIMPLE)

    for contour in contours:
        area = cv2.contourArea(contour)
        if area > 1000:  # Yalnızca büyük alanları kontrol et (balon vs.)
            # Konturun yaklaşık kenarlarını bul
            approx = cv2.approxPolyDP(contour, 0.02 * cv2.arcLength(contour, True), True)

            # Şekli tanı
            shape = get_shape(approx)
            
            # Şekli çiz
            x, y, w, h = cv2.boundingRect(approx)
            cv2.rectangle(frame, (x, y), (x + w, y + h), (0, 255, 0), 2)  # Dikdörtgen çiz
            cv2.putText(frame, shape, (x, y - 10), cv2.FONT_HERSHEY_SIMPLEX, 0.7, (0, 255, 0), 2)

    cv2.imshow("Frame", frame)

    if cv2.waitKey(1) & 0xFF == ord('q'):  # 'q' tuşu ile çık
        break

cap.release()
cv2.destroyAllWindows()


