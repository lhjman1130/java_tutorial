package p0414;

class Test5 {
	String name;
	String tel;
	String address;

	Test5() {//t1 �����Ҷ�
		this("aaa", "111");//�ٸ� ������ ȣ��. ������ �ȿ����� ��밡��. 1�ٿ� ���;� ��(�ٸ� ���๮���� �ռ��� ��)
		System.out.println("����Ʈ ������");
	}

	Test5(String name, String tel) {//t2 �����Ҷ�
		this(name, tel, "���ѹα�");
		System.out.println("�Ķ� 2�� ������");
	}

	Test5(String name, String tel, String address) {
		this.name = name;
		this.tel = tel;
		this.address = address;
		System.out.println("�Ķ� 3�� ������");
		System.out.println("name:" + name);
		System.out.println("tel:" + tel);
		System.out.println("address:" + address);
	}
}

public class Test5Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test5 t1 = new Test5();
		Test5 t2 = new Test5("bbb", "222");
		Test5 t3 = new Test5("ccc", "333", "���ʱ�");
	}

}
