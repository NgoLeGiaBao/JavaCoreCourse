public class HoaDon {
	private String tenLoaiCafe;
	private double giaTien1KgCafe;
	private double khoiLuongCafe;
	
	public HoaDon (String tenLoaiCafe, double giaTien1KgCafe, double khoiLuong1KgCafe) {
		this.tenLoaiCafe = tenLoaiCafe;
		this.giaTien1KgCafe = giaTien1KgCafe;
		this.khoiLuongCafe = khoiLuong1KgCafe;
	}
	public double tongTienCafe () {
		return this.giaTien1KgCafe * this.khoiLuongCafe;
	}
	public String tenLoaiCafe () {
		return this.tenLoaiCafe;
	}
	public boolean kiemTraKhoiLuongCafeCoLonHonKhoiLuongDaDua (double khoiLuongSoSanh) {
		return this.khoiLuongCafe > khoiLuongSoSanh;
	}
	public boolean tongTienCafeLonHon500 () {
		return this.tongTienCafe() > 500;
	}
	public double tinhGiamGiaXChoHoaDonLonHon500 (int x) {
		return this.tongTienCafe() > 500 ? (x * this.tongTienCafe())/100 : 0;
	}
	public double giaSauKhiGiam (int x) {
		return this.tongTienCafe() - this.tinhGiamGiaXChoHoaDonLonHon500(x);
	}
}
