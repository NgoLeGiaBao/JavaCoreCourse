public class CachDatTenBien {
	public static void main(String[] args) {
		String thongBao = "Hôm nay là ngày 19/12/2022";
		String hoVaTen = "Ngô Lê Gia Bảo";
		String tenSach = "Lập trình hướng đối tượng";
		int $idSach = 1;
//		double 8GiaTien = 5; // Đây là một biến không hợp lệ
		
		System.out.println("Thông báo" + thongBao + "!");
		System.out.println("Họ và tên" + hoVaTen);
		System.out.println("Tên sách" + tenSach);
		
		tenSach = "Lập trình C";
		System.out.println("Tên sách" + tenSach);
	}
}
