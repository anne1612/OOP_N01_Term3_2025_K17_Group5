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

Câu 2: Phân tích 4 đối tượng bao gồm: user, product, order, payment

I. Đối tượng người dùng (user):
1. Miêu tả thông tin của người dùng:
Mã người dùng
Tên người dùng
Giới tính
Ngày sinh
Số điện thoại
Email
Địa chỉ
Mật khẩu
Loại người dùng (Khách hàng/Nhà cung cấp)
2. Phương thức hoạt động liên quan đến đối tượng người dùng:
Đăng kí tài khoản, đăng nhập (bằng sdt, email)
Hiển thị thông sinh người dùng
Mua sản phẩm, thanh toán (khách hàng)
Đăng bán sản phẩm (nhà cung cấp)

II. Đối tượng sản phẩm (product):
1. Miêu tả thông tin của sản phẩm:
Mã sản phẩm
Mã người bán (nhà cung cấp)
Tên sản phẩm
Giá sản phẩm
Số lượng sản phẩm
Mô tả sản phẩm
2. Phương thức hoạt động liên quan đến đối tượng sản phẩm:
Hiển thị thông tin sản phẩm
Cập nhật số lượng sản phẩm (sau khi mua bán)

III. Đối tượng đơn hàng (order):
1. Miêu tả thông tin của đơn hàng:
Mã đơn hàng
Mã người dùng (khách hàng)
Danh sách sản phẩm (tên, số lượng, giá)
Tổng tiền
Ngày đặt hàng
Trạng thái đơn hàng (chờ xác nhận, đang giao, đã nhận, đã hủy)
2. Phương thức hoạt động liên quan đến đối tượng đơn hàng:
Tạo đơn hàng mới (khi khách hàng mua)
Hiển thị thông tin đơn hàng
Cập nhật trạng thái đơn hàng
Tính tổng số tiền

IV. Đối tượng thanh toán (payment):
1. Miêu tả thông tin của thanh toán:
Mã thanh toán
Mã đơn hàng
Số tiền thanh toán
Phương thức thanh toán (tiền mặt, ví điện tử)
Trạng thái thanh toán (đã thanh toán, chưa thanh toán)
Ngày thanh toán
2. Phương thức hoạt động liên quan đến đối tượng thanh toán:
Thực hiện thanh toán
Hiển thị thông tin thanh toán
Cập nhật phương thức thanh toán
Cập nhật trạng thái thanh toán

Câu 3: Cấu trúc folder

### 📁 Cấu trúc thư mục Project

```plaintext
Project/
├── .vscode/
├── bin/
├── src/
│   ├── Customer.java
│   ├── Main.java
│   ├── Order.java
│   ├── Payment.java
│   ├── Product.java
│   ├── Seller.java
│   └── User.java
├── test/
│   ├── TestOrder.java
│   ├── TestPayment.java
│   ├── TestProduct.java
│   └── TestUser.java
├── README.md

```


Câu 4: Chúng em viết 7 class cho 4 đối tượng xác định được ở câu 2 (bao gồm main). 
- Với đối tượng user ta có: class user, class customer và class seller. Customer và seller kế thừa user. 
- Với đối tượng product ta có: class product 
- Với đối tượng order ta có: class order
- Với đối tượng payment ta có: class payment

(Các chức năng cơ bản tương tự câu 2)


Câu 5:

Để kiểm tra tính đúng đắn và ổn định của lớp user, customer và seller, chúng tôi thực hiện kiểm thử cho các chức năng chính sau:
  - Đăng kí, hiển thị thông tin, đăng nhập, mua (của customer) và bán (của seller)


- Để kiểm tra tính đúng đắn và ổn định của lớp Product, chúng tôi thực hiện kiểm thử cho các chức năng chính sau:

Tạo sản phẩm mới
Kiểm tra chức năng tạo mới sản phẩm, đảm bảo rằng các thông tin như mã sản phẩm, tên sản phẩm, giá, số lượng và mô tả được khởi tạo đúng.

Giảm số lượng sản phẩm hợp lệ
Kiểm tra chức năng giảm số lượng sản phẩm sau khi bán hàng. Đảm bảo rằng khi có giao dịch mua, số lượng sản phẩm trong kho được giảm chính xác và không vượt quá giới hạn.

Kiểm tra giảm số lượng sản phẩm không hợp lệ
Kiểm tra trường hợp người dùng cố gắng giảm số lượng sản phẩm vượt quá số lượng tồn kho. Hệ thống cần trả về thông báo lỗi và không cho phép giao dịch.

Cập nhật thông tin sản phẩm
Kiểm tra khả năng cập nhật thông tin của sản phẩm, bao gồm tên sản phẩm, giá, mô tả. Đảm bảo các thay đổi này được lưu lại và phản ánh chính xác trong hệ thống.
