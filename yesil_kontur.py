import cv2
import numpy as np

# Kamerayı başlat (0: varsayılan kamera)
cap = cv2.VideoCapture(0)

while True:
    # Kameradan oku
    ret, frame = cap.read()
    if not ret:
        break

    # Griye çevir
    gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)

    # Gürültüyü azaltmak için Gaussian Blur 
    gray_blurred = cv2.GaussianBlur(gray, (15, 15), 0)

    # Gri görüntüde daireleri tespit et
    circles = cv2.HoughCircles(
        gray_blurred, 
        cv2.HOUGH_GRADIENT, dp=1.2, minDist=50,  # minDist: Daireler arasındaki minimum mesafe
        param1=50,  # Canny kenar algılama eşiği
        param2=30,  # Daire tespiti eşiği (yüksek değeri, gereksiz yuvarlakları engellemece)
        minRadius=20,  # Minimum çap
        maxRadius=100  # Maksimum çap
    )

    # Daireler varsa
    if circles is not None:
        # Daireleri yuvarlak şekilde çiz
        circles = np.round(circles[0, :]).astype("int")
        for (x, y, r) in circles:
            # Çevresini çiz (yeşil)
            cv2.circle(frame, (x, y), r, (0, 255, 0), 4)  # Yeşil çerçeve yap

    # Sonucu göster
    cv2.imshow("Kameradan Yuvarlak Tespiti", frame)

    # q tuşuna basılırsa çık döngü finittoooo
    if cv2.waitKey(1) & 0xFF == ord('q'):
        break

# Kamerayı ve pencereleri kapat
cap.release()
cv2.destroyAllWindows()

