package homework1.order;

import homework1.warehouse.Product;

public class Order {
	private int num;//�ֹ���ȣ
	private int prod_num;//�ֹ���ǰ�� ��ȣ
	private int amount;//�ֹ�����
	private int total_price;//�����ݾ�: ��ǰprice*amount(�ֹ�����)
	private boolean pay_flag;// ��������:true(��������), false(����������.�⺻��)
	private static int cnt;

	public Order() {
	}

	public Order(Product p, int amount) {
		this.num = ++cnt;
		this.prod_num = p.getNum();
		this.amount = amount;
		this.total_price = p.getPrice() * amount;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getProd_num() {
		return prod_num;
	}

	public void setProd_num(int prod_num) {
		this.prod_num = prod_num;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getTotal_price() {
		return total_price;
	}

	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}

	public boolean isPay_flag() {
		return pay_flag;
	}

	public void setPay_flag(boolean pay_flag) {
		this.pay_flag = pay_flag;
	}

	@Override
	public String toString() {
		return "Order [num=" + num + ", prod_num=" + prod_num + ", amount=" + amount + ", total_price=" + total_price
				+ ", pay_flag=" + pay_flag + "]";
	}
	
}
