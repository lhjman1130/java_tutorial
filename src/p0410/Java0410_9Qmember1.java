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
	}*/   ////�α����� ���� �޼���� ����� �� ���� �ð���
	
	
	
}
public class Java0410_9Qmember1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);

		//////////ȸ������
		System.out.println("<<<<<ȸ������>>>>>");
		String id, name, ee, pp;

		System.out.print("���̵� �Է��ϼ���.");
		id = sc.next();
		System.out.println();

		System.out.println("�̸��� �Է��ϼ���.");
		System.out.println();
		name = sc.next();

		System.out.println("�̸����� �Է��ϼ���.");
		System.out.println();
		ee = sc.next();

		System.out.println("����� �Է��ϼ���.");
		pp = sc.next();
		System.out.println();
		
		Member p1 = new Member();
		p1.setInfo(id,  name , ee, pp);
		p1.printInfo();
		
		
		/////////
		System.out.println("�α����ϼ���");
		
		while (true){
			System.out.print("id :");
			id = sc.next();
			
			System.out.print("pwd :");
			pp = sc.next();
			
		}
		
		
		
		
		
		
		
		
		
		
		System.out.println("id: ");
		
		
		
		
		System.out.println("���̵� �ٽ� �Է����ּ���.");
		
		System.out.println("��й�ȣ�� �ٽ� �Է����ּ���.");
		System.out.println("�α��εǾ����ϴ�. ����� ������");
		System.out.println("��������");
		System.out.println("������ ȸ������ ���");
		
		
		
	}

}
