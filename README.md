## OOP_NO1_Term3_2025_K17_Group5

# Group5

Member:

Nguyễn Văn An
Github id: Ansociuu

Phan Văn Phát
Github id: dodorafust

Trịnh Thị Lan Nhi
Github id: lannhi07

Nguyễn Lệ Thu
Github id: nglthu


- Nhật kí tạm thời: 
  + 9/5: họp online để thống nhất và mô phỏng dự án. Thảo luận bài tập 1.
  + 10/5: làm được 1/3 bài tập 1 và tiếp tục phần còn lại. Dự kiến 12h trưa mai hoàn thành bài tập.
Câu 1: Tiêu đề của bài tập lớn cuối kỳ: Hệ thống mua bán hàng trực tuyến shopbee.

I. Đối tượng người dùng (user):
I.Miêu tả thông tin của người dùng:
Mã người dùng
Tên người dùng
Giới tính
Ngày sinh
Số điện thoại
Email
Địa chỉ
Mật khẩu
Loại người dùng (Khách hàng/Nhà cung cấp)
Phương thức hoạt động liên quan đến đối tượng người dùng:
Đăng kí tài khoản, đăng nhập (bằng sdt, email)
Hiển thị thông sinh người dùng
Mua sản phẩm, thanh toán (khách hàng)
Đăng bán sản phẩm (nhà cung cấp)

II. Đối tượng sản phẩm (product):
Miêu tả thông tin của sản phẩm:
Mã sản phẩm
Mã người bán (nhà cung cấp)
Tên sản phẩm
Giá sản phẩm
Số lượng sản phẩm
Mô tả sản phẩm
Phương thức hoạt động liên quan đến đối tượng sản phẩm:
Hiển thị thông tin sản phẩm
Cập nhật số lượng sản phẩm (sau khi mua bán)

III. Đối tượng đơn hàng (order):
Miêu tả thông tin của đơn hàng:
Mã đơn hàng
Mã người dùng (khách hàng)
Danh sách sản phẩm (tên, số lượng, giá)
Tổng tiền
Ngày đặt hàng
Trạng thái đơn hàng (chờ xác nhận, đang giao, đã nhận, đã hủy)
Phương thức hoạt động liên quan đến đối tượng đơn hàng:
Tạo đơn hàng mới (khi khách hàng mua)
Hiển thị thông tin đơn hàng
Cập nhật trạng thái đơn hàng
Tính tổng số tiền

IV. Đối tượng thanh toán (payment):
Miêu tả thông tin của thanh toán:
Mã thanh toán
Mã đơn hàng
Số tiền thanh toán
Phương thức thanh toán (tiền mặt, ví điện tử)
Trạng thái thanh toán (đã thanh toán, chưa thanh toán)
Ngày thanh toán
Phương thức hoạt động liên quan đến đối tượng thanh toán:
Thực hiện thanh toán
Hiển thị thông tin thanh toán
Cập nhật phương thức thanh toán
Cập nhật trạng thái thanh toán



Cấu trúc folder

### 📁 Cấu trúc thư mục Project

```plaintext
shopee-clone/
├── src/
│   ├── model/           # Chứa các class đối tượng (User, Product, Order,...)
│   ├── service/         # Xử lý logic hệ thống (mua hàng, thanh toán,...)
│   └── main/            # File chạy chính App.java
├── test/                # Chứa các class kiểm thử (UserTest, ProductTest,...)
├── README.md            # File mô tả dự án
└── .gitignore           # Các file không cần đẩy lên Git
```




