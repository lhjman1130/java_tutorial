package p0414;

class Test4 {
	String name;
	int age;
	static int cnt;

	Test4() {
		cnt++;
		System.out.println(cnt + "번째 객체 생성됨");
	}

	Test4(String n, int a) {// 생성자. setInfo()와 동일한 역할
		name = n;
		age = a;
		cnt++;
		System.out.println(cnt + "번째 객체 생성됨");
	}

	void printInfo() {
		System.out.println("name:" + name);
		System.out.println("age:" + age);
	}
}

public class Test4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test4 t2 = new Test4();// 클래스에 생성자를 안만들면 컴파일러가 디폴트 생성자를 자동으로 만들어줌.
		t2.printInfo();

		Test4 t = new Test4("aaa", 12);
		t.printInfo();
	}

}
