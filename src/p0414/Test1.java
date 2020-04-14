package p0414;

class StaticTest {
	int a; // 일반 멤버 변수. heap에 할당
	static int b; // static 멤버 변수. static에 할당. 메모리 하나만 할당 받아 모든 객체가 공용으로 사용. 초기화
					// 한번만실행.

	void addNum() {
		a++;
		b++;
	}

	void printNum() {
		System.out.println("a:" + a);
		System.out.println("b:" + b);
	}

}

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticTest.b);
		StaticTest.b = 10;
		
		StaticTest st1 = new StaticTest();
		st1.addNum();
		st1.printNum();

		StaticTest st2 = new StaticTest();
		st2.addNum();
		st2.printNum();

		StaticTest st3 = new StaticTest();
		st3.addNum();
		st3.printNum();

		System.out.println(StaticTest.b);// 클래스 변수
		// System.out.println(StaticTest.a);
	}

}
