package p0414ver1;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = {"새우", "감자", "고래밥"};
		Product[] prods = new Product[3];
		int i;
		for(i=0 ; i<prods.length; i++){
			prods[i] = new Product(names[i], (i+1) *1000, (i+1) *10);
			// new 가 꼭 있어야 하나 ? 위에서 이미 배열 3개 생성했는데?
		}
		for(i=0 ; i<prods.length; i++){
			System.out.println("");
			
		}
		
	}

}
