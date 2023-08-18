/*
 * Không có đa kế thừa trong lập trình Java
 * Hiểu đơn giản:
 * Một cha có thể có một hoăc nhiều con
 * Nhưng một con chỉ có duy nhất một cha
 */
public class Main_EX041 {
	public static void main(String[] args) {
		People_Poland ppl = new People_Poland("Richar Do", 1999, "Poland");
		People_USA pus = new People_USA("Tom Dean", 1992, "The United States");
		People_VietNamese pvn = new People_VietNamese("Gia Bao", 2004, "VietNamese");
		
		ppl.eating();
		ppl.drinking();
		ppl.sayingHello();
		
		pus.eating();
		pus.eating();
		pus.sayingHello();
		
		pvn.eating();
		pvn.drinking();
		pvn.sayingHello();
	}
}
