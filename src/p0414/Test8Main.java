package p0414;

public class Test8Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test8 t = new Test8();
		System.out.println("�����ڿ��� �Ҵ��� ��");
		t.printMem();

		System.out.println("main���� �Ҵ��� ��");
		// t.a = 10;//private
		t.b = 20;// default
		t.c = 30;// public

		//t.test1();// private
		t.test2();// default
		t.test3();// public

	}

}
