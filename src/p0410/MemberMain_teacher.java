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
		System.out.println("ȸ������");
		// ��ü ������ �� id, pwd,name, email�Է¹޾Ƽ� ��ü�� ����
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

		System.out.println("�α���");
		// ����
		// id, pwd�Է¹޾Ƽ� �� ��ü�� ����� id, pwd�� ��(id.equals(id2)). �� �� ��ġ�ؾ� �α��� ����
		while (true) {
			System.out.print("id:");
			id = sc.next();
			System.out.print("pwd:");
			pwd = sc.next();
			if(id.equals(m.id) && pwd.equals(m.pwd)){
				System.out.println("�α��� ����");
				break;
			}
			System.out.println("�α��� ����. �ٽ� �α���");
		}

		System.out.println("ȸ���������");
		// printInfo()ȣ��
		m.printInfo();

		System.out.println("���� ����");
		// ��pwd �Է¹޾� ����
		System.out.print("new pwd:");
		pwd = sc.next();
		m.pwd = pwd;

		System.out.println("������ ȸ���������");
		m.printInfo();
	}

}
