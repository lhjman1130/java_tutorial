package p0414ver1;
// ������ this�Լ��� �� ���� ���� �ʴ�. this�� ���� ���� �ʴ�. 
class Test5{
	String name;
	String tel;
	String address;
	
	Test5(){       //t1 ������ �� ���ȴ�.
		this("aaa", "111");  //this �Լ� : �ٸ� ������ ȣ��. ����(������ �ȿ����� ��밡���ϰ�, 
							// ������ �ȿ����� 1�ٿ� ����(�ٸ� ���๮���� �ռ��߸� �Ѵ�.))
		System.out.println("����Ʈ ������");
	}
	
	Test5(String name, String tel){    //t2 ������ ��, ���ȴ�.
		this(name, tel, "���ѹα�");
		System.out.println("�Ķ� 2�� ������");
	}
	
	Test5(String name, String tel, String address){// t3 ������ ��, ���ȴ�.
		this.name = name;
		this.tel = tel;
		this.address = address;
		
		System.out.println("name :"+ name);
		System.out.println("tel"+ tel);
		System.out.println("address"+address);
	}
}
public class Test5Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ü ����
		Test5 t1 = new Test5(); //t1�� ����. �Ķ���� ���� ����Ʈ �����ڷ� 
		t1.address = "sfasfsadf";
		Test5 t2 = new Test5("bbb", "010-333-1111");
		Test5 t3 = new Test5("ccc", "010-2222-1311", "seoul si ");
	}

}
