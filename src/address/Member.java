package address;
//DTO. VO(ĸ��ȭ)
//�� ����� �ּ� ����
public class Member {
	String name;
	String tel;
	String address;

	//�ܺο��� ������ �޾� ������� �ʱ�ȭ �޼���
	void setInfo(String n, String t, String a) {
		name = n;
		tel = t;
		address = a;
	}

	void printInfo() {
		System.out.println("name:" + name);
		System.out.println("tel:" + tel);
		System.out.println("address:" + address);
	}
}
