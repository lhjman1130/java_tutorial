package homework1.warehouse;

import java.util.Scanner;

public class whService {
	private Dao dao;

	public whService() {
		dao = new Dao();
	}

	public void addProduct(Scanner sc) {
		// ��ǰ�� �̸�, ����, ������ �Է¹޾Ƽ� Product��ü�� ��´�
		// dao.insert(p)
	}

	public void getProductByNum(Scanner sc) {
		// ��ǰ��ȣ �Է¹޾� �˻��ؼ� ���
	}

	public void getProductByName(Scanner sc) {
		// ��ǰ�� �Է¹޾� �˻��ؼ� ���
	}

	public void editProduct(Scanner sc) {
		// ������ ��ǰ�� ��ȣ�� �� ������ �Է¹޾� Product ��ü�� ��Ƽ�
		// dao.updatePrice(p)
	}

	public void in_out(Scanner sc) {
		// ������� ��ǰ��ȣ�� ����� ������ �Է¹޾Ƽ�
		// dao.updateAmount()ȣ��
	}

	public void delProduct(Scanner sc) {
		// ������ ��ǰ ��ȣ�� �Է¹޾Ƽ�
		// dao.delete()ȣ��
	}

	public void printAll() {
		// dao.selectAll()ȣ���ؼ� ��ȯ�� �迭�� ������ ��� ��ü ���
	}

	public Product[] getAll() {// �ֹ����� ����ϵ��� ��ü ��ǰ��� ��ȯ
		return dao.selectAll();
	}
}
