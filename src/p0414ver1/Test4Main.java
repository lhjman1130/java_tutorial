package p0414ver1;
class Test4{
	String name;       //�������
	int age;
	
	Test4(String n, int a){            //Ÿ���� ����, Ŭ������ �̸��� ����. ������. 
		name = n;						//void �� ��ߵȴ�. 
		age = a; 						//������� �ʱ�ȭ ���ش�.(������ ������ ���Ұ� ����)
	}									// �Ķ���� �ΰ� �޴´�. 
	Test4(){                 //"����Ʈ ������" �̰� ���ִ� �� ����. �ʱ�ȭ ����.
		
	}
	
	void printInfo(){
		System.out.println("name :"+name);
		System.out.println("age :"+ age);
		
	}
}


public class Test4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Test4 t = new Test4();   //����� ���� ���ÿ� �ߴµ�, ����.
		Test4 t2 = new Test4();           //������ Ŭ���� �ȿ��� Test4(){} �̰� �־���� 
		t2.printInfo();						// ���� ���ϴ�. 
		
		Test4 t = new Test4("lee", 30);  
		t.printInfo();            //������ �� �ϳ� �������, ���Ĺ��ʹ� �ȳ־��༭.����
		//���ݱ����� Test3 t = new Test(); ���ָ� �����Ϸ��� �˾Ƽ� �����ڸ� . ����Ʈ �����ڸ�
		 // �˾Ƽ� ����������.  ����Ʈ ������ ����� ��� ���峪����?
		  // Test4(){}; �̷��� ����������. �Ķ���Ͱ� ���� ��ü�� �����ڸ� �������� �Ǿ���. 
		  // �ٵ� �����ڸ� �ϳ��� �����. ����Ʈ �����ڸ� �ȸ�����ش�. 
		 // �׷� �� �Ķ���� ���� ��ü ������ ����� ����Ʈ �ȸ���� �ش�. 
		 // �ֵ� �޼���ϱ� �����ε� ������.
	}

}
