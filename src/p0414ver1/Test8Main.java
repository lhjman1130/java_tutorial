package p0414ver1;

import p0413.pacachu.Test8;

public class Test8Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test8 t = new Test8();
		System.out.println("생성자에서 할당한 값");
		t.printMem();
		//  t.test1(); 프라이빗이어서 같은 클래스에서만 가능.
		System.out.println("main 에서 할당한 값");		
		//t.test2();
		
		t.b = 20;
		t.c = 30;
		t.test3();
		t.printMem();
	}

}
