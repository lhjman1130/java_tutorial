package p0414;

public class Test8 {
	private int a; // private:클래스 내에서만 사용
	int b; // default:패키지 내에서만 사용
	public int c; // public:패키지 밖에서도 사용

	public Test8() {
		a = 1;
		b = 2;
		c = 3;
	}

	public void printMem() {// public
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("c:" + c);
		test1();
	}

	private void test1() {	// private
		System.out.println("클래스 내에서만 호출");
	}

	void test2() {			// default
		System.out.println("패키지 내에서만 호출");
	}

	public void test3() {	// public
		System.out.println("패키지 밖에서도 호출");
	}
}
