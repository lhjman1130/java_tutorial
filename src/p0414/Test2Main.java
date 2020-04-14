package p0414;

class Test2 {
	int a; // 일반 멤버 변수
	static int b; // static 멤버 변수

	void test1() { // 일반 메서드.일반 멤버 변수, static 멤버 변수 모두 사용 가능
		System.out.println(a);
		System.out.println(b);
	}

	static void test2() { // static 메서드. 메서드는 무조건 stack에 할당. 객체 유무와 상관없음
		// System.out.println(a);//일반 멤버 변수 사용 불가. 객체 생성 전에는 없기 때문에
		System.out.println(b);// static 멤버 변수와 지역변수 사용 가능
	}

	void test3() { // 일반 메서드
		test1(); // 일반 메서드 호출 가능
		test2(); // static 메서드 호출 가능
	}

	static void test4() { // static 메서드
		// test1(); //일반 메서드 호출 불가능
		test2(); // static 메서드 호출 가능
	}
}

//static 메서드의 사용
//1. 객체 생성 전에 static 멤버 변수를 다루고자 할때
//2. 객체와 상관없이 기능을 단독으로 제공하고자 할때
public class Test2Main {
	public static void main(String[] args) {
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
