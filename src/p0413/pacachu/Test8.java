package p0413.pacachu;

public class Test8 {
	private int a;   //Ŭ���� �������� ����
	int b; 		//��Ű�� �������� 
	public int c; // ��Ű�� �ۿ����� ��� ����.
	
	public Test8(){            //������. Ŭ���� �̸��� ���� �޼���
		a=1;
		b=2;
		c=3;
		
	}
	
	public void printMem(){
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("c:" + c);
		
	}
	
	private void test1(){
		System.out.println("Ŭ���� �������� ȣ��" );
		
	}
	void test2(){
		System.out.println("��Ű�� �������� ȣ��" );
	}
	public void test3(){
		System.out.println("��Ű�� �ۿ����� ȣ��" );
	}
}
