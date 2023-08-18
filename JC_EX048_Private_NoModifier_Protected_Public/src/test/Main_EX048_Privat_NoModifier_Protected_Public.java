/*
 * Phạm vi hoạt động của từ khóa trước biến trong java:
 * - Private chỉ được gọi trong chính class của nó
 * - No modifier gọi được trong chính class và package của nó
 * - Protected gọi được trong chính class, package, subclass 
 * (subclass là những class kế thừa, nó có thể nằm bên trong hoặc bên ngoài package) của nó
 * - Public gọi được ở mọi nơi
 */
package test;
import code.Information;
public class Main_EX048_Privat_NoModifier_Protected_Public {
	private Information inf;
	public void method () {
//		this.inf.a = 1 không thể truy cập được
//		this.inf.b = 2 không thể truy cập được
//		this.inf.c = 3 không thể truy cập được
		this.inf.d = 4; // có thể truy cập được
	}
}
