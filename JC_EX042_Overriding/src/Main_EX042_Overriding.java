/*
 * Overriding (phuơng thức ghi đè) được sử dụng trong trường hợp lớp con kế thừa từ lớp cha 
 * và muốn định nghĩa phương thức đã có mặt tại phương thức cha
 * Lý do: một lớp cha thường có thể có nhiều lớp con kế thừa, 
 * tuy nhiên phương thức ở lớp cha có thể phù hợp với lớp con này nhưng khong phù hợp với lớp con khác, 
 * do đó lớp con cần ghi đè phương thức đó cho phù hợp.
 * Quy tắc:
 * + Lớp con và lớp cha có mối quan hệ kế thừa
 * + Phương thức trong lớp con phải có tên giống với lớp cha
 * + Phương thức trong lớp con phải có tham số giống với lớp cha
 */
public class Main_EX042_Overriding {
	public static void main(String[] args) {
		Animal anm = new Animal("Name Animal");
		Dog dg = new Dog();
		Cat ct = new Cat();
		Bird bd = new Bird();	
		
		anm.eating();
		anm.makingSound();
		anm.sleeping();
		
		dg.eating();
		dg.makingSound();
		dg.sleeping();
		
		ct.eating();
		ct.makingSound();
		ct.sleeping();
		
		bd.eating();
		bd.makingSound();
		bd.sleeping();
	}

	
	
}
