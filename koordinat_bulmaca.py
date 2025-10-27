^import cv2
 import numpy as np

cap = cv2.VideoCapture(0)

while True:
    ret, frame = cap.read()
    if not ret:
        break

    gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
    blurred = cv2.GaussianBlur(gray, (9, 9), 2)

    circles = cv2.HoughCircles(
        blurred,
        cv2.HOUGH_GRADIENT,
        dp=1.2,
        minDist=100,       # yakın daireleri ayır
        param1=80,         # kenar bulma hassasiyeti
        param2=45,         # DAHA KATI filtre
        minRadius=1,      # küçük parazitleri alma
        maxRadius=100      # çok büyük şeyleri dışla
    )

    output = frame.copy()

    if circles is not None:
        circles = np.uint16(np.around(circles))
        for i in circles[0, :]:
            x, y, r = i
            if r > 15:  # min boyut kontrolü
                cv2.circle(output, (x, y), r, (0, 255, 0), 2)
                cv2.circle(output, (x, y), 2, (0, 0, 255), 3)
                cv2.putText(output, f"X:{x} Y:{y}", (x + 10, y - 10),
                            cv2.FONT_HERSHEY_SIMPLEX, 0.5, (255, 255, 255), 1)
                print(f"DAIRE TESPIT: X={x}, Y={y}, R={r}")
    else:
        print("DAIRE YOK")

    cv2.imshow("FILTRELENMIS", output)

    if cv2.waitKey(1) & 0xFF == ord('q'):
        break

cap.release()
cv2.destroyAllWindows() ^


