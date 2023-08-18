package code;

public class Example {
	private Information inf;
	public void method () {
//		this.inf.a không thể truy cập được
		this.inf.b = 2; //có thể truy cập được
		this.inf.c = 3; //có thể truy cập được
		this.inf.d = 4; //có thể truy cập được
	}
}
