package p0410;
//service : ����Ͻ����� ������ Ŭ���� ..��ɱ��� Ŭ����
// DAO : DB ó�� Ŭ����.
// ĸ��ȭ �ϴ� Ŭ���� (DTO �Ǵ� VO(value object)��� �θ���. )
class Product{     //Ŭ���� ���� �Լ��� �޼����� �θ���.
	int num, price, quantity;            //���������...
	String name;

	// �Ķ���� ������ ��� ������ ������ ������ �ȳ�����,
	// ������ ��Ƽ�� ���ÿ��� ã�´�. (���� ����ǰ� �ִ� ��........
	void setInfo(int n,  String na, int p, int q) {

		// this.num = num; // num = num �̷��Դ� �� �Ⱦ�. this.�� ���̸� �������...������
		num = n;
		name = na;
		price = p;
		quantity = q;

	}
	// �ܺα����ϴ� Ŭ������ '����'�� �θ���.
	// ��ü���� ������ ������ ������ؼ�.

	void printInfo() {

		System.out.println("num:" + num);
		System.out.println("name:" + name);
		System.out.println("price:" + price);
		System.out.println("quantity:" + quantity);
	}
}
//��ǰ ���� ���� �� �ִ� Ŭ������� ĿǪ���� �����.

public class Java0410_7reviewClass1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		p1.setInfo(1,  "��adf���", 1000, 20000);
		Product p2 = new Product();
		p2.setInfo(2,  "��agag���", 100000, 2000);
		Product p3 = new Product();
		p3.setInfo(3,  "��ahcv���", 1000000, 200);
		p1.printInfo();
		p2.printInfo();
		p3.printInfo();
		
	}

}
