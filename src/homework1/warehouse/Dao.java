package homework1.warehouse;

public class Dao {
	private Product[] prods;
	private int cnt;
	
	public Dao(){
		prods = new Product[30];
	}
	
	public void insert(Product p){//��ǰ���
		
	}
	
	public int getProdIdx(int num){
		return -1;
	}
	
	public Product selectByNum(int num){//��ǰ��ȣ�ΰ˻�
		return null;
	}
	
	public Product[] selectByName(String name){//��ǰ�����ΰ˻�. �̸� �ߺ��ΰ�� ������ �˻��ǹǷ� �迭�� ��� ��ȯ
		return null;
	}
	
	public void updatePrice(Product p){//���ݺ���
		
	}
	
	public void updateAmount(int num, int a){//����� ó��
		
	}
	
	public void delete(int num){//��ǰ����
		
	}
	
	public Product[] selectAll(){//��ü�˻�
		Product[] p = new Product[cnt];
		System.arraycopy(prods, 0, p, 0, cnt);
		return p;
	}
}
