package p0413.address;
//한사람의 주소 정보
//DTo 또는 Vo라고 부른다. 이런 역할 하는 것들을.한 객체의 정보를 묶어줄 수 있도록 만드는 걸 VO
//D데이터 A 접근 O  도 있다. 
//기능을 만들어주는 클래스를 서비스라고 부른다. 
//먼저 D
public class Member {
	String name, tel, address;
	
	
	//외부에서 정보를 받아 멤버변수 초기화 메서드.
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
