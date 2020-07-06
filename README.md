# AppQuanLiRap </br>
### File config </br>
- Thiết lập lại cấu hình database tại hàm load, file database.java
### Cấu trúc thư mục </br>
- Entity: Chứa class tạo đối tượng, làm cầu nối truyền data  </br>
- Controller: Nhiệm vụ duy nhất là load hàm từ model và đợi view gọi, xác nhận vài thứ cần xác nhận  </br>
- Model: Thằng này kết nối tới database đến gọi dữ liệu ra
- View: Thằng này hiển thị và xử lý event thực hiện trên giao diện, truyền dữ liệu và gọi đến Controller </br>
- Util: Thằng này viết là do lười, mấy hàm hay xài ném vào đây cho lẹ
### Hướng dẫn cài đặt </br>
1. Cài đặt git: https://git-scm.com/
2. Mở bash/terminal và gõ git clone https://github.com/leanhboi1999/AppQuanLiRap.git
3. Sau khi tải clone về, mở NetBean hoặc IDE java khác lên và Open project vừa tải về
4. Vào Oracle và tạo 1 user tên là quanlirap với mật khẩu là admin
5. Mở file DoAnFinal.sql trong project và copy code trong file *.sql (script đã đủ lệnh tạo bảng + khóa ngoại + insert)
6. Mở Oracle Developer lên paste code ở bước 5 vào và run
7. Vào thư mục Libs trong project để lấy tất cả các thư viện có đuôi *.jar và thực hiện Add Jar File trong các IDE không phải là Netbean (Với Netbean file Libs đã cấu hình sẵn)
8. Build và Run Application
9. Enjoy!
10. Thay đổi tài khoản và mật khẩu database tùy theo sở thích tại file database.java
