package p0413.address;

import java.util.Scanner;

//���񽺴� �� ���α׷����� ������ ����� �����ϴ� Ŭ����. ��ɱ��� Ŭ����
//����Ͻ� ���� ���� Ŭ����.

public class Service {
	Dao dao = new Dao(); // ������ �۾��� ���ؼ� �ʿ�.�������.
	//Dao dao;           //������ : Ŭ������ �̸��� ���� �Լ��� �Լ�Ÿ���� ����. 
	//Service(){                 ����� ��ü �ʱ�ȭ, ����� ȣ�� �Ұ�. ��ü �����ÿ��� ȣ��.
	//           Ŭ���� ���ǽ� �ۼ����� ������ �����Ϸ��� �ڵ����� �������.
	//              Ŭ������ (){}���� �������.
	//�ٸ� Ŭ������ ��ü�� �⺻Ÿ�� �ƴ϶� Ŭ���� Ÿ��.
	// Ŭ���� Ÿ���� �ݵ�� ���� ���;� ������... �⺻Ÿ���� �׳� �ص� ������, 

	// �߰�: ����� ����� �̸�(�ߺ�Ȯ��), ��ȭ, �ּ��Է� ---->vo(Member) ��ü�� ��´�. --> Dao �迭�� ����
	//                                                          �� ��ü�� ��´�. 
	
	void addMember(Scanner sc) {
		// Member m = new Member(); //������
		// do{
		// System.out.print("name :");
		// m.name = sc.next();
		// } while (dao.getIdx(m.name)>=0); //�ߺ�üũ

		Member m = new Member(); // ������
		String name = "", tel = "", address = "";

		do {
			System.out.print("name :");
			name = sc.next();
		} while (dao.getIdx(m.name) >= 0); // �ߺ�üũ
		System.out.print("tel: ");
		tel = sc.next();
		System.out.print("address:");
		address = sc.next();
		m.setInfo(name, tel, address); // �Է¹��� name, tel, address�� ��üm �� ����
		dao.insert(m);

	}

	// �˻�
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
	
	
	//����
	void editMember(Scanner sc){
		System.out.print("edit name");
		
		
		Member
	}
	//����
	
	void delMember(Scanner sc){
		
	}
	
	//��ü���
	void printAll(){
		
	}

}
