package p0414ver1;

//멤버변수가 초기화 되는 과정
//실행문은 꼭 메서드 안에 넣어야된다. 초보자들 자주 실수
class Test6 {
	// (1) 멤버변수 기본값 할당.
	int a = 1; // 멤버 변수 선언시 값. 값 안주면 기본값. 할당해주는 단게
	// 위가 네번째로 실행
	static int b = 2; // static 멤버 변수는 이탤릭 체
	// 위가 첫번째 실행.
	// (2) 초기화 블록에 의한 초기화
	// 일반 벰버 초기화 블록 :
	// 아래가 다섯번째로 실행.
	{
		System.out.println("일반 멤버 초기화 블록===========");
		System.out.println("a :" + a);
		System.out.println("b :" + b);

		a = 10;
	}
	// 아래가 두번째 실행.
	static {
		System.out.println("Static 멤버 초기화 블록========");
		// System.out.println("a :"+ a);
		System.out.println("b :" + b);
		b = 20;
	}

	// (3) 생성자에 의해 초기화. 이게 마지막이니까 이 값이 최종값.
	Test6() { // 여섯번째 실행.
		System.out.println("생성자=============");
		System.out.println("a :" + a);
		System.out.println("b :" + b);

		a = 30;
		b = 40;
	}

	void printMem() {
		System.out.println("a :" + a);
		System.out.println("b :" + b);

	}

}

public class Test6Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Test6 타입의 객체 t 생성. 무조건 new 필요
		Test6 t = new Test6();

		// Picachu p = new Picachu();
		// 현재 패키지에서 찾는다. 즉, 0414에서 찾고,
		// 클래스 풀네임을 패키지까지 적어줘야.
		// picachu.Picachu p = new picachu.Picachu();

		t.printMem();
		Picachu p = new Picachu();

	}

}
