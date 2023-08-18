/* Gồm có 2 kiểu dữ liệu: 
 * Kiểu dữ liệu nguyên thủy: int, long, double, char...,
 * Kiểu dữ liệu đối tượng: Array, String, Double
 * Kiểu dữ liệu đối tượng viết hoa chữ cái đầu còn kiểu dữ liệu nguyên thủy thì không
 */
public class KieuDuLieu {
	public static void main(String[] args) {
		String tenSach = "Lập trình hướng đối tượng";
		int namXuatBan = 2022;
		double giaTien = 15.5;
		boolean trangThaiSach = true;
		char maKho = 'M';
		System.out.println("Tên sách" + tenSach);
		System.out.println("Năm xuất bản" + namXuatBan);
		System.out.println("Giá tiền" + giaTien);
		System.out.println("Trạng thái sách còn" + trangThaiSach);
		System.out.println("Mã kho sách " + maKho);
	}
}
