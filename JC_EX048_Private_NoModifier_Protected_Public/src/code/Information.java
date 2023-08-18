package code;
public class Information {
	private int a;
	int b;
	protected int c;
	public int d;
	
	public void method () {
		this.a = 1; // Có thể truy cập được
		this.b = 2; // Có thể truy cập được
		this.c = 3; // Có thể truy cập được
		this.d = 4; // Có thể truy cập được
	}
	
}
