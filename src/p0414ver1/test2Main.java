package p0414ver1;

class Test2 {
	int a; // �Ϲ� ��� ����
	static int b; // static �������( ���Ÿ� ü�� ǥ��)

	void test1() { /// �Ϲ� �������, ����ƽ ��� ���� �� ��� ����.
		System.out.println(a);
		System.out.println(b);
	}

	static void test2() { // static �޼���. ---�޼���� ������ stack �� ����
		// System.out.println(a); //�Ϲ� ������� ��� �Ұ�. ��ü ���� ������ ���� ����.
		System.out.println(b); // ����ƽ ��������� ��밡��.(�������� ��� ����)
	}

	void test3() { // �Ϲ� �޼��忡����
		test1(); // �Ϲ� �޼��嵵 ȣ�� �����ϰ�
		test2(); // ����ƽ �޼��嵵 ȣ�Ⱑ��.

	}

	static void test4() { // ����ƽ �޼��忡����.
		// test1(); // �Ϲ� �޼���� ȣ�� �Ұ���
		test2();

	}
}

public class test2Main {
//  1. static �޼����� ���.
	//    (1) ��ü ���� ���� statc ��� ������ �ٷ���� �� ��
	 	//(2) ��ü�� ������� ����� �ܵ����� �����ϰ��� �� ��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static ����� ��ü ���� ���� ��� �����ϰ� Ŭ���� �̸����� ����.
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
