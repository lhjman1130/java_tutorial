package p0414;

class Test2 {
	int a; // �Ϲ� ��� ����
	static int b; // static ��� ����

	void test1() { // �Ϲ� �޼���.�Ϲ� ��� ����, static ��� ���� ��� ��� ����
		System.out.println(a);
		System.out.println(b);
	}

	static void test2() { // static �޼���. �޼���� ������ stack�� �Ҵ�. ��ü ������ �������
		// System.out.println(a);//�Ϲ� ��� ���� ��� �Ұ�. ��ü ���� ������ ���� ������
		System.out.println(b);// static ��� ������ �������� ��� ����
	}

	void test3() { // �Ϲ� �޼���
		test1(); // �Ϲ� �޼��� ȣ�� ����
		test2(); // static �޼��� ȣ�� ����
	}

	static void test4() { // static �޼���
		// test1(); //�Ϲ� �޼��� ȣ�� �Ұ���
		test2(); // static �޼��� ȣ�� ����
	}
}

//static �޼����� ���
//1. ��ü ���� ���� static ��� ������ �ٷ���� �Ҷ�
//2. ��ü�� ������� ����� �ܵ����� �����ϰ��� �Ҷ�
public class Test2Main {
	public static void main(String[] args) {
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
