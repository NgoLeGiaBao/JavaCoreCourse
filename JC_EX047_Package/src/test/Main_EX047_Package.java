/*
 * - Một gói thư viện là tập hợp các lớp, các giao tiếp, các kiểu liệt kê và chú thích
 * - Nó cung cấp chứ nâng bảo vệ quyển truy cập và quản lý không gian
 * - Thao tác trên gói có 2 kỹ thuật:
 * 		+ KT đặt tên
 * 		+ KT điều khiển truy xuất
 * - Một gói là một nhóm các lớp và giao tiếp có quan hệ với nhau được tổ chức như 1 đơn vị trong không gian tên
 * - Gói giúp phân hoạc không gian tên lớp, giao diện thành những vùng dễ quản lý hơn
 * - Một gói có thể có nhiều gói con
 * - Không được có hai thành viên trùng tên
 * - Java có 2 loại gói:
 * 		+ Gói được định nghĩa trước
 * 		+ Gói được định nghĩa bởi người dùng
 * - Định nghĩa một gói:
 * 		+ Để tạo 1 gói, ta đặt từ khóa package ngay phát biểu dầu tiên của tập tin nguồn
 * 		+ Nếu bỏ qua khai báo package --> lớp sẽ được đặt vào gói mặc định
 *			package packagename;
 * - Các bước định nghĩa gói
 * 		+ Bước 1: lựa chọn têngói
 * 			. Tên gói phải là chữ thường
 * 			. Tên gói không được bắt bằng java hoặc javax
 * 			. Không được bắt đầu bằng số hoặc dấu nối (-)
 * 		+ Bước 2: tạo thư mục cùng tên với
 * 			. Java sử dụng hệ thống thư mục để lưu trữ các gói --> các lớp được chứa trong thư mục cùng tên packagename
 * 		+ Bước 3: đưa tập tin nguồn (class) vào trong gói
 * 			. Thêm câu lệnh package vào dòng đầu tiên của mã nguồn
 * 			. Chỉ có duy nhất 1 câu lệnh package đối với mỗi tệp nguồn
 * 		+ Bước 4: biên dịch và chạy ứng dụng
 * 			. Khi biên dich phải đam rbảo sử dụng tên lớp đầy đủ bao gồm cả tên gói
 * 			. Dùng dấu chấm để phân biệt một package với package cha của nó
 * - Định nghĩa gói
 * 		+ Java xem gốc của cây phân cấp gọi được định nghĩa ở biến môi trường CLASSPATH
 * 			package packagename1 [.packagename2 [.packagename3]]
 * 		+ Ví dụ:
 * 			package java.awt.image
 * 			--> Được lưu trữ trong thư mục Java\awt\image với hệ điều hành Windows
 */
package test;
import code_a.Example;
public class Main_EX047_Package {
	public static void main(String[] args) {
		Example exp_1 = new Example(4, 5);
		System.out.println("Value of a is: " + exp_1.getA());
	
		// Khi muốn khai báo class giống tên nhau ở 2 package khác nhau lần thứ 2 thì làm theo dòng dưới
		code_b.Example exp_2 = new code_b.Example(1, 2, 3);
		System.out.println("Value of c is: " + exp_2.getC());
		
		code_c.Example exp_3 = new code_c.Example(9, 8, 7, 6);
		System.out.println("Value of d is: " + exp_3.getD());
	}
}
