package p0410;
//service : 비즈니스로직 구현한 클래스 ..기능구현 클래스
// DAO : DB 처리 클래스.
// 캡슐화 하는 클래스 (DTO 또는 VO(value object)라고 부른다. )
class Product{     //클래스 안의 함수를 메서드라고 부른다.
	int num, price, quantity;            //멤버변수들...
	String name;

	// 파라메터 변수와 멤버 변수가 같으면 에러는 안나지만,
	// 변수는 액티브 스택에서 찾는다. (지금 실행되고 있는 스........
	void setInfo(int n,  String na, int p, int q) {

		// this.num = num; // num = num 이렇게는 잘 안씀. this.를 붙이면 멤버변수...다음에
		num = n;
		name = na;
		price = p;
		quantity = q;

	}
	// 외부구현하는 클래스를 '서비스'라 부른다.
	// 객체생성 이유는 정보를 담기위해서.

	void printInfo() {

		System.out.println("num:" + num);
		System.out.println("name:" + name);
		System.out.println("price:" + price);
		System.out.println("quantity:" + quantity);
	}
}
//제품 정보 담을 수 있는 클래스라는 커푸집을 만든거.

public class Java0410_7reviewClass1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		p1.setInfo(1,  "새adf우깡", 1000, 20000);
		Product p2 = new Product();
		p2.setInfo(2,  "새agag우깡", 100000, 2000);
		Product p3 = new Product();
		p3.setInfo(3,  "새ahcv우깡", 1000000, 200);
		p1.printInfo();
		p2.printInfo();
		p3.printInfo();
		
	}

}
