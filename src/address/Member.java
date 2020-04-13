package address;
//DTO. VO(캡슐화)
//한 사람의 주소 정보
public class Member {
	String name;
	String tel;
	String address;

	//외부에서 정보를 받아 멤버변수 초기화 메서드
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
