package address;

import java.util.Scanner;

//service:����Ͻ� �������� Ŭ����. ��ɱ���Ŭ����
public class Service {

	// �������
	Dao dao;

	// Ŭ������ �̸��� ������ �Լ��� �Լ�Ÿ���� ����.
	// ���: ��ü �ʱ�ȭ
	// ����� ȣ���� �� ����, ��ü �����ÿ��� ȣ��
	// Ŭ���� ���ǽ� �ۼ����� ������ �����Ϸ��� �ڵ����� �������.
	// Ŭ������(){}���� �������.Service(){}

	Service() {// ������
		dao = new Dao();// ������ �۾��� ���ؼ� �ʿ�
	}

	// �߰�: ����� ����� �̸�(�ߺ�Ȯ��),��ȭ,�ּ��Է�->VO(Member) ��ü�� ��´�.->Dao �迭�� ������ ��ü�� ��´�
	void addMember(Scanner sc) {
		String name = "", tel = "", address = "";
		do {
			System.out.print("name:");
			name = sc.next();
		} while (dao.getIdx(name) >= 0);// name �ߺ�üũ
		System.out.print("tel:");
		tel = sc.next();
		System.out.print("address:");
		address = sc.next();

		Member m = new Member();// Member():������=>��ü �ʱ�ȭ
		m.setInfo(name, tel, address);// �Է¹��� name, tel, address�� ��ü m�� ����
		dao.insert(m);
	}

	// �˻�->�̸��Է�->�迭�� ã��->��ü���
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

	// ����:�̸�,����ȭ,���ּ� �Է�.
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

	// ����
	void delMember(Scanner sc) {
		System.out.print("del name:");
		String name = sc.next();
		dao.delete(name);
	}

	// ��ü���
	void printAll() {
		dao.printAll();
	}
}
