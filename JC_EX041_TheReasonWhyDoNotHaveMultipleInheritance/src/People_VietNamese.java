
public class People_VietNamese extends People {

	public People_VietNamese(String name, int birthday, String national) {
		super(name, birthday, national);
	}
	
	public void sayingHello () {
		System.out.println(this.national + " saying hello is: XIN CHAO!");
	}
}
