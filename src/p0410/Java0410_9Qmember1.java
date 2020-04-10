package p0410;

import java.util.Scanner;

class Member{
	String id, name,  email, pwd;
	
	
	
	void setInfo(String i, String n, String e, String p){
		id = i;
		name = n;
		email = e;
		pwd = p;	
		
	}
	void printInfo(){
		System.out.print("id :" + id +"\t");
		System.out.print("name :" + name +"\t");
		System.out.print("email :" + email +"\t");
		System.out.print("pwd :" + pwd +"\t");
		System.out.println();
	}
	/*String loginInfo(){
		
		Scanner sc = new Scanner(System.in);
		String id2, pwd2;
		
		System.out.print("id :");
		id2 = sc.next();
		
		System.out.print("pwd :");
		pwd2 = sc.next();
		
		return String id2, String pwd2;
	}*/   ////로그인을 따로 메서드로 만드는 건 다음 시간에
	
	
	
}
public class Java0410_9Qmember1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);

		//////////회원가입
		System.out.println("<<<<<회원가입>>>>>");
		String id, name, ee, pp;

		System.out.print("아이디를 입력하세요.");
		id = sc.next();
		System.out.println();

		System.out.println("이름을 입력하세요.");
		System.out.println();
		name = sc.next();

		System.out.println("이메일을 입력하세요.");
		System.out.println();
		ee = sc.next();

		System.out.println("비번을 입력하세요.");
		pp = sc.next();
		System.out.println();
		
		Member p1 = new Member();
		p1.setInfo(id,  name , ee, pp);
		p1.printInfo();
		
		
		/////////
		System.out.println("로그인하세요");
		
		while (true){
			System.out.print("id :");
			id = sc.next();
			
			System.out.print("pwd :");
			pp = sc.next();
			
		}
		
		
		
		
		
		
		
		
		
		
		System.out.println("id: ");
		
		
		
		
		System.out.println("아이디를 다시 입력해주세요.");
		
		System.out.println("비밀번호를 다시 입력해주세요.");
		System.out.println("로그인되었습니다. 당신의 정보는");
		System.out.println("정보수정");
		System.out.println("수정된 회원정보 출력");
		
		
		
	}

}
