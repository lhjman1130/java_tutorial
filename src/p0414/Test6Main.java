package p0414;

import p0413.picachu.Picachu;

class Test6 {
	//1. ������� �⺻�� �Ҵ�
	int a = 1;//4)
	static int b = 2;//1)
	
	//2. �ʱ�ȭ ��Ͽ� ���� �ʱ�ȭ
	//5)
	{//�Ϲ� ��� �ʱ�ȭ ���
		System.out.println("�Ϲ� ��� �ʱ�ȭ ���");
		System.out.println("a:" + a);
		System.out.println("b" + b);
		a = 10;
	}
	//2)
	static {//static ��� �ʱ�ȭ ���
		System.out.println("static ��� �ʱ�ȭ ���");
		// System.out.println("a:" + a);
		System.out.println("b" + b);
		b = 20;
	}

	//3. �����ڿ� ���� �ʱ�ȭ
	//6)
	Test6() {
		System.out.println("������");
		System.out.println("a:" + a);
		System.out.println("b" + b);
		a = 30;
		b = 40;
	}

	void printMem() {
		System.out.println("print �޼���");
		System.out.println("a:" + a);
		System.out.println("b:" + b);
	}
}

public class Test6Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test6 t = new Test6();//3)
		t.printMem();
		Picachu p = new Picachu();
		Test177 t2 = new Test177();
	}

}



















