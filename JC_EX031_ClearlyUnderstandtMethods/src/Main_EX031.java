public class Main_EX031 {
	public static void main(String[] args) {
		HoaDon hd1 = new HoaDon("Trung Nguyen", 100, 3.5);
		HoaDon hd2 = new HoaDon ("Vinna", 500, 1.5);
		
		System.out.println(hd1);
		System.out.println("Total amount of " + hd1.tenLoaiCafe() + " coffee bill is "+ hd1.tongTienCafe());
		System.out.println("Total amount of " + hd2.tenLoaiCafe() + " coffee bill is "+ hd2.tongTienCafe());
		
		System.out.println("The total weight of " + hd1.tenLoaiCafe() + " coffee package is more than 2kg is: " + hd1.kiemTraKhoiLuongCafeCoLonHonKhoiLuongDaDua(2));
		System.out.println("The total weight of " + hd2.tenLoaiCafe() + " coffee package is more than 2kg is: " + hd2.kiemTraKhoiLuongCafeCoLonHonKhoiLuongDaDua(2));
		
		System.out.println("Total amount of " + hd1.tenLoaiCafe() + " coffee bill is more than 500 is: "+ hd1.tongTienCafeLonHon500());
		System.out.println("Total amount of " + hd2.tenLoaiCafe() + " coffee bill is more than 500 is: "+ hd2.tongTienCafeLonHon500());
	
		System.out.println("Total amount of the reduced " + hd1.tenLoaiCafe() + " coffee bill is "+ hd1.tinhGiamGiaXChoHoaDonLonHon500(10));
		System.out.println("Total amount of the reduced " + hd2.tenLoaiCafe() + " coffee bill is "+ hd2.tinhGiamGiaXChoHoaDonLonHon500(10));
		
		System.out.println("Total amount remaining to be paid after the reduction of the " + hd1.tenLoaiCafe() + " coffee bill is: " + hd1.giaSauKhiGiam(10));
		System.out.println("Total amount remaining to be paid after the reduction of the " + hd2.tenLoaiCafe() + " coffee bill is: " + hd2.giaSauKhiGiam(10));
	}
}
