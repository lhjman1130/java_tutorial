package p0406;

public class test2 {

	public static void main(String[] args) {
		//ToDO auto-generated method stub
		//�ڵ�����ȯ, ���� ����ȯ
		System.out.println(5/2);
		System.out.println(5.0/(double)2); //Ÿ���� �ٸ��� ������ �� �� �� ����. 
		//�׷� ��, �ڵ� ����ȯ�� �Ͼ. ���� Ÿ�Կ��� ūŸ������ ����. ũ�Ⱑ ���Ƽ� �������� �Ǽ��� �� ũ��  
		//������ ���� 2�� 5.0�� �Ǽ��� ���� �ٲ��.
		
		//(double) d = 5/2 ; //�Ҽ��� ��� �ȵȴ�. �ֳĸ� �����Ⱑ ������...
		double d =(double)5/2; //�̷��� ��ȣ�Ἥ ���ִ°� ����ȯ.������ ���� ����ȯ
		System.out.println(d);
		
		
		//���� ���ͷ�(���������) 
		
		float f = 3.14f;  //���⼭�� f�� �Ǽ� ����� Ÿ���� float���� �����ϴ� Ű����.
		                  //������ double������ float���� ���ڴ�. 
		long �� = 2000l; //���� ����� Ÿ���� long���� ����.
		
		int a = 10;  // 10����
		int b = 0x3af2; //16����
		int c = 0b100101; //2����
		int e = 0123;//8����
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(e);
		//���ڸ��ͷ�
		char x = 'a'; //a��� ������ �����ڵ� 97�� ����Ǵ� ��. stack�� ����
		String z = "abc"; //�ٵ� ���ڿ��� ����� �����.
		
		System.out.println("aaa\tbbb");
		System.out.println("aaa\nbbb");
		System.out.println("aa\"ab\"bb");  //\"�� �������� ū����ǥ �ϸ� 
		
		
	}
}
