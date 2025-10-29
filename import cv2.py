import cv2
import numpy as np

# Görseli yükle
#image_to_add = cv2.imread(r'C:\Users\MERHABA\Desktop\proje kod\WhatsApp Görsel 2025-04-28 saat 09.35.19_2d0d11b3.jpg')
image_to_add = cv2.imread(r'C:\Users\MERHABA\Desktop\proje kod\xyz.jpg')


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
        minDist=100,
        param1=80,
        param2=45,
        minRadius=20,
        maxRadius=900
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

                # Görseli dairenin ortasına yerleştir
                image_resized = cv2.resize(image_to_add, (r*2, r*2))  # Görseli dairenin boyutuna ayarla
                y_offset = y - r  # Görseli tam olarak dairenin merkezine yerleştir
                x_offset = x - r
                roi = output[y_offset:y_offset+image_resized.shape[0], x_offset:x_offset+image_resized.shape[1]]

                # Görseli yerleştir (kendi görüntüye)
               # mask = image_resized[:, :, 3]  # Görselin alfa kanalını al (şeffaflık)
               
                mask = image_resized[:, :]
                mask_inv = cv2.bitwise_not(mask)
                img_bg = cv2.bitwise_and(roi, roi, mask=mask_inv)
                img_fg = cv2.bitwise_and(image_resized, image_resized, mask=mask)
                dst = cv2.add(img_bg, img_fg)
                output[y_offset:y_offset+image_resized.shape[0], x_offset:x_offset+image_resized.shape[1]] = dst

    else:
        print("DAIRE YOK")

    cv2.imshow("FILTRELENMIS", output)

    if cv2.waitKey(1) & 0xFF == ord('q'):
        break

cap.release()
cv2.destroyAllWindows()
