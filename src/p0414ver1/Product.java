package p0414ver1;

//��� ��������� �޼��忡 ���������ڸ� ���̰�,

//private ��������� ���ؼ� setter, getter�� ����ÿ�.

public class Product {
	private int num;
	private String name; // ��������
	private int price;
	private int amount;
	private static int cnt; // ���⼭ static�� �Ⱦ��� num�� ī��Ʈ ���� �ʴ´�.
	// int cnt; //��ǰ��ȣ�� �ڵ����� �Ҵ�.
	public Product() {
		
	}
	public Product( String name, int price, int amount) {		
		this.num =++cnt;
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	@Override
	public String toString() { //������ƮŬ�����κ��� �����޾�.
		//��ü�� �����Ѵ�. �Ŭ�����κ���(Ŭ���� Ÿ��) 
		//��������
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
