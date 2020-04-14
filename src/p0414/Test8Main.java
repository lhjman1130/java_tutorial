package p0414;

public class Test8Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test8 t = new Test8();
		System.out.println("생성자에서 할당한 값");
		t.printMem();

		System.out.println("main에서 할당한 값");
		// t.a = 10;//private
		t.b = 20;// default
		t.c = 30;// public

		//t.test1();// private
		t.test2();// default
		t.test3();// public

	}

}
