package p0413.address;

import java.util.Scanner;

//서비스는 이 프로그램에서 제공할 기능을 구현하는 클래스. 기능구현 클래스
//비즈니스 로직 구현 클래스.

public class Service {
	Dao dao = new Dao(); // 데이터 작업을 위해서 필요.멤버변수.
	//Dao dao;           //생성자 : 클래스와 이름이 같은 함수로 함수타입이 없다. 
	//Service(){                 기능은 객체 초기화, 맘대로 호출 불가. 객체 생성시에만 호출.
	//           클래스 정의시 작성하지 않으면 컴파일러가 자동으로 만들어줌.
	//              클래스명 (){}으로 만들어줌.
	//다른 클래스의 객체도 기본타입 아니라 클래스 타입.
	// 클래스 타입은 반드시 뉴가 나와야 생성됨... 기본타입은 그냥 해도 되지만, 

	// 추가: 등록할 사람의 이름(중복확인), 전화, 주소입력 ---->vo(Member) 객체에 담는다. --> Dao 배열에 생성
	//                                                          한 객체를 담는다. 
	
	void addMember(Scanner sc) {
		// Member m = new Member(); //구버전
		// do{
		// System.out.print("name :");
		// m.name = sc.next();
		// } while (dao.getIdx(m.name)>=0); //중복체크

		Member m = new Member(); // 구버전
		String name = "", tel = "", address = "";

		do {
			System.out.print("name :");
			name = sc.next();
		} while (dao.getIdx(m.name) >= 0); // 중복체크
		System.out.print("tel: ");
		tel = sc.next();
		System.out.print("address:");
		address = sc.next();
		m.setInfo(name, tel, address); // 입력받은 name, tel, address를 객체m 에 저장
		dao.insert(m);

	}

	// 검색
	void printMember(Scanner sc) {
		
		System.out.println("name" + name);
		String name = sc.next();
		Member m = dao.select(name);
		if(m==null)
			System.out.println("not found");
			else{
				m.printInfo();
		}
		
		
		
	}
	
	
	//수정
	void editMember(Scanner sc){
		System.out.print("edit name");
		
		
		Member
	}
	//삭제
	
	void delMember(Scanner sc){
		
	}
	
	//전체출력
	void printAll(){
		
	}

}
