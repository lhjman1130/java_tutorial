package p0414;

public class Test8 {
	private int a; // private:Ŭ���� �������� ���
	int b; // default:��Ű�� �������� ���
	public int c; // public:��Ű�� �ۿ����� ���

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
		System.out.println("Ŭ���� �������� ȣ��");
	}

	void test2() {			// default
		System.out.println("��Ű�� �������� ȣ��");
	}

	public void test3() {	// public
		System.out.println("��Ű�� �ۿ����� ȣ��");
	}
}
