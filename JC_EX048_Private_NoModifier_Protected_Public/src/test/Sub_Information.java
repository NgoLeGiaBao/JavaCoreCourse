package test;

import code.Information;

public class Sub_Information extends Information {
	private Information inf;
	public void method () {
//		super.a không thể truy cập được
//		super.b không thể truy cập được
		super.c = 3; // có thể truy cập được
		super.d = 4; // có thể truy câp được
	}
}
