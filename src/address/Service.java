package address;

import java.util.Scanner;

//service:비즈니스 로직구현 클래스. 기능구현클래스
public class Service {

	// 멤버변수
	Dao dao;

	// 클래스와 이름이 동일한 함수로 함수타입이 없다.
	// 기능: 객체 초기화
	// 맘대로 호출할 수 없고, 객체 생성시에만 호출
	// 클래스 정의시 작성하지 않으면 컴파일러가 자동으로 만들어줌.
	// 클래스명(){}으로 만들어줌.Service(){}

	Service() {// 생성자
		dao = new Dao();// 데이터 작업을 위해서 필요
	}

	// 추가: 등록할 사람의 이름(중복확인),전화,주소입력->VO(Member) 객체에 담는다.->Dao 배열에 생성한 객체를 담는다
	void addMember(Scanner sc) {
		String name = "", tel = "", address = "";
		do {
			System.out.print("name:");
			name = sc.next();
		} while (dao.getIdx(name) >= 0);// name 중복체크
		System.out.print("tel:");
		tel = sc.next();
		System.out.print("address:");
		address = sc.next();

		Member m = new Member();// Member():생성자=>객체 초기화
		m.setInfo(name, tel, address);// 입력받은 name, tel, address를 객체 m에 저장
		dao.insert(m);
	}

	// 검색->이름입력->배열에 찾아->객체출력
	void printMember(Scanner sc) {
		System.out.print("search name:");
		String name = sc.next();
		Member m = dao.select(name);
		if (m == null) {
			System.out.println("not found");
		} else {
			m.printInfo();
		}
	}

	// 수정:이름,새전화,새주소 입력.
	void editMember(Scanner sc) {
		System.out.print("edit name:");
		String name = sc.next();
		System.out.print("new tel:");
		String tel = sc.next();
		System.out.print("new address:");
		String address = sc.next();
		
		Member m = new Member();
		m.setInfo(name, tel, address);
		
		dao.update(m);
	}

	// 삭제
	void delMember(Scanner sc) {
		System.out.print("del name:");
		String name = sc.next();
		dao.delete(name);
	}

	// 전체출력
	void printAll() {
		dao.printAll();
	}
}
