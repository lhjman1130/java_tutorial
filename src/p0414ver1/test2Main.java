package p0414ver1;

class Test2 {
	int a; // 일반 멤버 변수
	static int b; // static 멤버변수( 이탤릭 체로 표현)

	void test1() { /// 일반 멤버변수, 스테틱 멤버 변수 다 사용 가능.
		System.out.println(a);
		System.out.println(b);
	}

	static void test2() { // static 메서드. ---메서드는 무조건 stack 에 저장
		// System.out.println(a); //일반 멤버변수 사용 불가. 객체 생성 전에는 없기 때문.
		System.out.println(b); // 스테틱 멤버변수만 사용가능.(지역변수 사용 가능)
	}

	void test3() { // 일반 메서드에서는
		test1(); // 일반 메서드도 호출 가능하고
		test2(); // 스태틱 메서드도 호출가능.

	}

	static void test4() { // 스태틱 메서드에서는.
		// test1(); // 일반 메서드는 호출 불가능
		test2();

	}
}

public class test2Main {
//  1. static 메서드의 사용.
	//    (1) 객체 생성 전에 statc 멤버 변수를 다루고자 할 때
	 	//(2) 객체와 상관없이 기능을 단독으로 제공하고자 할 때
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static 멤버는 객체 생성 전에 사용 가능하고 클래스 이름으로 접근.
		Test2.b = 30;
		Test2.test2();
		Test2.test4();
		
		Test2 t = new Test2();
		t.test1();
		Test2.test2();
		t.test3();
		Test2.test4();
		System.out.println(Math.PI);
		System.out.println(Math.abs(-10));

		
	}

}
