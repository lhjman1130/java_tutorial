package p0414ver1;

//��������� �ʱ�ȭ �Ǵ� ����
//���๮�� �� �޼��� �ȿ� �־�ߵȴ�. �ʺ��ڵ� ���� �Ǽ�
class Test6 {
	// (1) ������� �⺻�� �Ҵ�.
	int a = 1; // ��� ���� ����� ��. �� ���ָ� �⺻��. �Ҵ����ִ� �ܰ�
	// ���� �׹�°�� ����
	static int b = 2; // static ��� ������ ���Ÿ� ü
	// ���� ù��° ����.
	// (2) �ʱ�ȭ ��Ͽ� ���� �ʱ�ȭ
	// �Ϲ� ���� �ʱ�ȭ ��� :
	// �Ʒ��� �ټ���°�� ����.
	{
		System.out.println("�Ϲ� ��� �ʱ�ȭ ���===========");
		System.out.println("a :" + a);
		System.out.println("b :" + b);

		a = 10;
	}
	// �Ʒ��� �ι�° ����.
	static {
		System.out.println("Static ��� �ʱ�ȭ ���========");
		// System.out.println("a :"+ a);
		System.out.println("b :" + b);
		b = 20;
	}

	// (3) �����ڿ� ���� �ʱ�ȭ. �̰� �������̴ϱ� �� ���� ������.
	Test6() { // ������° ����.
		System.out.println("������=============");
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
		// Test6 Ÿ���� ��ü t ����. ������ new �ʿ�
		Test6 t = new Test6();

		// Picachu p = new Picachu();
		// ���� ��Ű������ ã�´�. ��, 0414���� ã��,
		// Ŭ���� Ǯ������ ��Ű������ �������.
		// picachu.Picachu p = new picachu.Picachu();

		t.printMem();
		Picachu p = new Picachu();

	}

}
