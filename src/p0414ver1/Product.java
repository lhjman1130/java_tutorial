package p0414ver1;

//모든 멤버변수와 메서드에 접근제어자를 붙이고,

//private 멤버변수에 대해서 setter, getter를 만드시오.

public class Product {
	private int num;
	private String name; // 전역변수
	private int price;
	private int amount;
	private static int cnt; // 여기서 static을 안쓰면 num이 카운트 되지 않는다.
	// int cnt; //제품번호는 자동으로 할당.
	public Product() {
		
	}
	public Product( String name, int price, int amount) {		
		this.num =++cnt;
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	@Override
	public String toString() { //오브젝트클래스로부터 물려받아.
		//객체를 설명한다. 어떤클래스로부터(클래스 타입) 
		//참조값ㄷ
		return "Product [num=" + num + ", name=" + name + ", price=" + price + ", amount=" + amount + "]";
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

	
	
	
}
