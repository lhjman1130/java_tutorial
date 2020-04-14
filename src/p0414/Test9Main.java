package p0414;

class Test9 {
	private int age;
	private String name;

	public Test9() {
	}

	public Test9(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public void setAge(int age) {// setter:set+멤버이름:외부에서 private 멤버변수에 값 할당.
									// 함수타입은 void. private 멤버변수와 동일한 타입의 파라메터
									// 1개를 갖는다. public 이어야 함
		this.age = age;
	}

	public int getAge() {//getter:get+멤버이름:외부에서 private 멤버변수값에 받아갈 수 있게. 함수타입은 멤버의 타입과 동일. 파라메터 없음.public 이어야 함
		return age;
	}

	public void setName(String name) {// setter
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

public class Test9Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test9 t1 = new Test9();

		t1.setAge(12); // t1.age = 12;
		t1.setName("aaa");// t1.name = "asdf";
		
		System.out.println(t1.getAge());
		System.out.println(t1.getName());
		
		Test9 t2 = new Test9(23, "bbb");
		System.out.println(t2.getAge());
		System.out.println(t2.getName());
		
		System.out.println(t2);
	}

}
