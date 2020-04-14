package p0414ver1;

class Test04 {
	String name;
	int age;
	static int cnt; // 생성자 하나가 있으면 객체가 하나 생성된거.
// 아래 두개의 메서드의 차이 . 생성자의 역할이 뭐지? 객체 생성되면 자동으로 호출된다???
	Test04() {
		cnt++;
		System.out.println(cnt + "번째 객체 생성함.");
	}

	Test04(String n, int a) { // 생성자는 클래스와 이름이 같은 메서드.
		name = n;
		age = a;
		cnt++;
		System.out.println(cnt + "번째 객체 생성함.");

	}

	void printInfo() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
	}
}

public class Test4Main_ex1 {

	public static void main(String[] args) {

		Test04 t2 = new Test04();          //객체 생성.
		t2.printInfo();                   // 실행. 
		Test04 t = new Test04();
		t.printInfo();

	}
}
