package p0414;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = { "�����", "���ڱ�", "������" };
		Product[] prods = new Product[3];
		int i;
		for (i = 0; i < prods.length; i++) {
			prods[i] = new Product(names[i], (i + 1) * 1000, (i + 1) * 10);
		}

		for (i = 0; i < prods.length; i++) {
			System.out.println(prods[i]);
		}
	}

}
