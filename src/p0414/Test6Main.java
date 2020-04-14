package p0414;

import p0413.picachu.Picachu;

class Test6 {
	//1. 멤버변수 기본값 할당
	int a = 1;//4)
	static int b = 2;//1)
	
	//2. 초기화 블록에 의해 초기화
	//5)
	{//일반 멤버 초기화 블록
		System.out.println("일반 멤버 초기화 블록");
		System.out.println("a:" + a);
		System.out.println("b" + b);
		a = 10;
	}
	//2)
	static {//static 멤버 초기화 블록
		System.out.println("static 멤버 초기화 블록");
		// System.out.println("a:" + a);
		System.out.println("b" + b);
		b = 20;
	}

	//3. 생성자에 의해 초기화
	//6)
	Test6() {
		System.out.println("생성자");
		System.out.println("a:" + a);
		System.out.println("b" + b);
		a = 30;
		b = 40;
	}

	void printMem() {
		System.out.println("print 메서드");
		System.out.println("a:" + a);
		System.out.println("b:" + b);
	}
}

public class Test6Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test6 t = new Test6();//3)
		t.printMem();
		Picachu p = new Picachu();
		Test177 t2 = new Test177();
	}

}



















