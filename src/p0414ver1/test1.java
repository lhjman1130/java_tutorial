package p0414ver1;


//��������� 0�� ó���� ������. 

class StaticTest{
	int a; //�Ϲ� ������� --->heap �� �Ҵ�.
	static int b; //����ƽ �������. --->static�� ����������  static�� �Ҵ�.
					//���� ��ü������ �ٸ� ���� ����ȴ�. 
				//�޸� �ϳ��� �Ҵ� �޾Ƽ� ��� ��ü�� �������� ���. 
				//�ʱ�ȭ�� �ѹ��� ����.
	void addNum(){    //�޼���. a,b 1�� ������Ŵ. ó���� �ʱ�ȭ�ϱ� 0�̾��ڰ�.
		a++;
		b++;
			}
	void printNum(){
		System.out.println("a:"+ a);
		System.out.println("b:"+ b);
		
	}

}
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticTest st1 = new StaticTest();   //��ü ����.
		st1.addNum();
		st1.printNum();
		
		StaticTest st2 = new StaticTest();
		st2.addNum();
		st2.printNum();
		
		StaticTest st3 = new StaticTest();
		st3.addNum();
		st3.printNum();
		
		System.out.println(StaticTest.b);
		System.out.println(st2.b);             //������ ���.
		System.out.println(st3.b);
		
	//	System.out.println(StaticTest.a);
		
	}

}
