package p0413.address;
//�ѻ���� �ּ� ����
//DTo �Ǵ� Vo��� �θ���. �̷� ���� �ϴ� �͵���.�� ��ü�� ������ ������ �� �ֵ��� ����� �� VO
//D������ A ���� O  �� �ִ�. 
//����� ������ִ� Ŭ������ ���񽺶�� �θ���. 
//���� D
public class Member {
	String name, tel, address;
	
	
	//�ܺο��� ������ �޾� ������� �ʱ�ȭ �޼���.
	void setInfo(String n, String t, String a){
		name = n;
		tel = t;
		address = a;
		
	}
	
	void printInfo(){
		System.out.println("Name" + name);
		System.out.println("Tel" + tel);
		System.out.println("Address" + address);
		
	}
}
