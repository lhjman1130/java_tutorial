package p0414;

class Test9 {
	private int age;
	private String name;

	public Test9() {
	}

	public Test9(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public void setAge(int age) {// setter:set+����̸�:�ܺο��� private ��������� �� �Ҵ�.
									// �Լ�Ÿ���� void. private ��������� ������ Ÿ���� �Ķ����
									// 1���� ���´�. public �̾�� ��
		this.age = age;
	}

	public int getAge() {//getter:get+����̸�:�ܺο��� private ����������� �޾ư� �� �ְ�. �Լ�Ÿ���� ����� Ÿ�԰� ����. �Ķ���� ����.public �̾�� ��
		return age;
	}

	public void setName(String name) {// setter
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

public class Test9Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test9 t1 = new Test9();

		t1.setAge(12); // t1.age = 12;
		t1.setName("aaa");// t1.name = "asdf";
		
		System.out.println(t1.getAge());
		System.out.println(t1.getName());
		
		Test9 t2 = new Test9(23, "bbb");
		System.out.println(t2.getAge());
		System.out.println(t2.getName());
		
		System.out.println(t2);
	}

}
