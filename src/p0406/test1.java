package p0406;

import java.util.Scanner;

//��� �ڵ�� Ŭ���� �ȿ� �־�� �Ѵ�. �ڹ� �ҽ� Ȯ���ڴ� ~.java

/*  ������
 * �ּ���
 * �ȴ�.             */

public class test1 {

	// main�Լ�. ���α׷��� ���۰� ��.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �Է½� ����� ��ĳ�� ��ġ�� �ϳ� ������ ��.
		// main�� �Լ�. �ڹٿ��� �����Լ��� ���۰� ��.(�� ���α׷�1��, ����1�� �־����)
		Scanner sc = new Scanner(System.in);
		//System.in �⺻ �ý��� �Է��� �ض�. ��, Ű���� 

		System.out.print("��ȣ:");
		int num = sc.nextInt();
		//num�̶�� ������ int ���·� �Է� �޴´�.

		System.out.print("�̸� : ");
		String name = sc.next();
		//next�� ���� �� �����̽��� ������ �� ����.  ���� ���, aaa bbb �̸�, aaa�� �д´�. �����̽� ��.
		System.out.print("Ű : ");
		float height = sc.nextFloat();
		
		System.out.print("�ּ� : ");
		sc.nextLine();
		//�̰� ���� ������..Ű �Է��� ��, ���ۿ� ���� ���͸� �������, 
		//
		String address = sc.nextLine();//�� �� ���͸���������
		//�ּҴ� ���� 

		System.out.println("num : " + num);
		System.out.println("name: " + name);
		System.out.println("height :" + height);
		System.out.println("address : " + address);
		sc.close(); //������ ���  �����ַ��� �̰� ����.
			//Scanner sc;   Ÿ���� ��ĳ��, �������� sc 
			//sc = new Scanner(System.in);        �� ������ ���ٷ� ���ΰ�.
			//��ü �����Ϸ���, ������ ��, new�� �� �ٿ�����Ѵ�. ��ü�� �������, new�� ������Ѵ�.
			//new�� �����ٰ� �޸� �Ҵ��ϱ�����.
			//Ŭ������ ����⿡ ���� �޸𸮰� �޶���. �������ϱ⿡ ���� �޶�. 
		//system.IN�� ǥ���Է�......��Ʈ������ �������ִ� �޼ҵ带 �̿��ؼ� �Ϸ��� �����ѵ�
		// �װ� ��ĳ��(��� Ŭ����)�� ��� ���ش�.
		//�ٵ�,   ctrl + shift + o === ����Ʈ ���� �ڵ� �����ȴ�. ó������ �����ϰ� ����.
		//int�� �⺻(����)����....�����ص� �޸� �Ҵ��� �ȴ�. 
		
	}

}	
		
		
		
	/*	try {

			int a = System.in.read();
			System.out.println(a);
		} catch (IOException e) {
			e.printStackTrace();

			// �ڹٴ� �����ڵ带 �Ἥ, char�� 2����Ʈ ���.
			// try catch�� ���α׷��� �ߴܵǴ� �� ����(��, ����ó���� ����)
			// ����ó���� �߰��� ���� �� ���´�.

		}
		*/

