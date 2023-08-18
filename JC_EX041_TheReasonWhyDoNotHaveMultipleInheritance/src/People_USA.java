
public class People_USA extends People {

	public People_USA(String name, int birthday, String national) {
		super(name, birthday, national);
	}
	public void sayingHello () {
		System.out.println(this.national + " saying hello is: HELLO!");
	}
}
