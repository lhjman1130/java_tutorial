package p0410;

import java.util.Scanner;

class Member2 {
	String id;
	String pwd;
	String name;
	String email;

	void setInfo(String i, String p, String n, String e) {
		id = i;
		pwd = p;
		name = n;
		email = e;
	}

	void printInfo() {
		System.out.println("id:" + id);
		System.out.println("pwd:" + pwd);
		System.out.println("name:" + name);
		System.out.println("email:" + email);
	}
}

public class MemberMain_teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("회원가입");
		// 객체 생성한 수 id, pwd,name, email입력받아서 객체에 담음
		Member2 m = new Member2();
		Scanner sc = new Scanner(System.in);
		System.out.print("id:");
		String id = sc.next();
		System.out.print("pwd:");
		String pwd = sc.next();
		System.out.print("name:");
		String name = sc.next();
		System.out.print("email:");
		String email = sc.next();
		m.setInfo(id, pwd, name, email);

		System.out.println("로그인");
		// 루프
		// id, pwd입력받아서 위 객체에 저장된 id, pwd와 비교(id.equals(id2)). 둘 다 일치해야 로그인 성공
		while (true) {
			System.out.print("id:");
			id = sc.next();
			System.out.print("pwd:");
			pwd = sc.next();
			if(id.equals(m.id) && pwd.equals(m.pwd)){
				System.out.println("로그인 성공");
				break;
			}
			System.out.println("로그인 실패. 다시 로그인");
		}

		System.out.println("회원정보출력");
		// printInfo()호출
		m.printInfo();

		System.out.println("정보 수정");
		// 새pwd 입력받아 수정
		System.out.print("new pwd:");
		pwd = sc.next();
		m.pwd = pwd;

		System.out.println("수정된 회원정보출력");
		m.printInfo();
	}

}
