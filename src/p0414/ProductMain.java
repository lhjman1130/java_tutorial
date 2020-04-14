package p0414;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = { "億辦條", "馬濠條", "堅掘葆條" };
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
