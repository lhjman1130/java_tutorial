package p0414;

class Test4 {
	String name;
	int age;
	static int cnt;

	Test4() {
		cnt++;
		System.out.println(cnt + "��° ��ü ������");
	}

	Test4(String n, int a) {// ������. setInfo()�� ������ ����
		name = n;
		age = a;
		cnt++;
		System.out.println(cnt + "��° ��ü ������");
	}

	void printInfo() {
		System.out.println("name:" + name);
		System.out.println("age:" + age);
	}
}

public class Test4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test4 t2 = new Test4();// Ŭ������ �����ڸ� �ȸ���� �����Ϸ��� ����Ʈ �����ڸ� �ڵ����� �������.
		t2.printInfo();

		Test4 t = new Test4("aaa", 12);
		t.printInfo();
	}

}
