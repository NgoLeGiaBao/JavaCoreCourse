package model;

import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

public class Town implements Serializable{
	private int IDTown;
	private String nameTown;
	public Town(int IDTown, String nameTown) {
		this.IDTown = IDTown;
		this.nameTown = nameTown;
	}
	public int getIDTown() {
		return IDTown;
	}
	public void setIDTown(int iDTown) {
		IDTown = iDTown;
	}
	public String getNameTown() {
		return nameTown;
	}
	public void setNameTown(String nameTown) {
		this.nameTown = nameTown;
	}
	public static ArrayList<Town> listTowns () {
		int i = 0;
		ArrayList<Town> arrListTown = new ArrayList<>();
		String [] arrTown = new String[] {"","An Giang", "Bà Rịa-Vũng Tàu", "Bạc Liêu", "Bắc Giang", "Bắc Kạn", "Bắc Ninh", "Bến Tre", "Bình Dương", "Bình Định", "Bình Phước", "Bình Thuận", "Cà Mau", "Cao Bằng", "Cần Thơ", "Đà Nẵng", "Đắk Lắk", "Đắk Nông", "Điện Biên", "Đồng Nai", "Đồng Tháp", "Gia Lai", "Hà Giang", "Hà Nam", "Hà Nội", "Hà Tĩnh", "Hải Dương", "Hải Phòng", "Hậu Giang", "Hòa Bình", "Hưng Yên", "Khánh Hòa", "Kiên Giang", "Kon Tum", "Lai Châu", "Lạng Sơn", "Lào Cai", "Lâm Đồng", "Long An", "Nam Định", "Nghệ An", "Ninh Bình", "Ninh Thuận", "Phú Thọ", "Phú Yên", "Quảng Bình", "Quảng Nam", "Quảng Ngãi", "Quảng Ninh", "Quảng Trị", "Sóc Trăng", "Sơn La", "Tây Ninh", "Thái Bình", "Thái Nguyên", "Thanh Hóa", "Thừa Thiên Huế", "Tiền Giang", "TP Hồ Chí Minh", "Trà Vinh", "Tuyên Quang", "Vĩnh Long", "Vĩnh Phúc", "Yên Bái"};
		for(String town : arrTown) {
			Town t = new Town(i++, town);
			arrListTown.add(t);
		}
		return arrListTown;
	}
	public static Town getTownBasedOnID (int id) {
		return Town.listTowns().get(id);
	}
	public static Town getTownBasedOnName (String name) {
		for (Town town : Town.listTowns()) {
			if (town.getNameTown().equals(name)) {
				return town;
			}
		}
		return null;
	}
	public String toString () {
		return this.getIDTown() + "/" + this.getNameTown();
	}
}
