package p0414ver1;

class Test04 {
	String name;
	int age;
	static int cnt; // ������ �ϳ��� ������ ��ü�� �ϳ� �����Ȱ�.
// �Ʒ� �ΰ��� �޼����� ���� . �������� ������ ����? ��ü �����Ǹ� �ڵ����� ȣ��ȴ�???
	Test04() {
		cnt++;
		System.out.println(cnt + "��° ��ü ������.");
	}

	Test04(String n, int a) { // �����ڴ� Ŭ������ �̸��� ���� �޼���.
		name = n;
		age = a;
		cnt++;
		System.out.println(cnt + "��° ��ü ������.");

	}

	void printInfo() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
	}
}

public class Test4Main_ex1 {

	public static void main(String[] args) {

		Test04 t2 = new Test04();          //��ü ����.
		t2.printInfo();                   // ����. 
		Test04 t = new Test04();
		t.printInfo();

	}
}
