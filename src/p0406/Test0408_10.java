package p0406;

////////�� �� �� �� �� /////////

public class Test0408_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3 }; //new ��� ������. �ʱ�ȭ�ؼ�
		int[] b;  // ������ �ȵȴ�. �ʱ�ȭ ����. �������� b�� ������� ����
		int i;
		
		//////////////////���� ���� ����
		//�������� ũ��� 4byte, ���� ��� ���� 4����Ʈ.
		//������ ���� ������ ������ ��.
		//���� �����͸� �����ϱ� ������ �ٸ��ʿ� ���� �� �� �ִ�. 
	//	b = a; //���� ����, ������ �ٸ� �༮�� ���ĵ� ������ �޴´�. 
		
				
		/////////////////////////////���� ���� ����
		System.out.println("�������� ����");
		
		b = new int[a.length]; //a�� ������ ũ��� �迭 ������
		for(i = 0 ; i < a.length ; i++){
			b[i] = a[i]; //�迭 �� �濡 a�� ������ �ε��� ��Ҹ� �Ҵ�
		}
		
		
		
		
		System.out.print("�迭 a���" + "\t");
		
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");

		}
		System.out.println();
		System.out.print("�迭b���" + "\t");
		for (i = 0; i < b.length; i++) {
			System.out.print(b[i] + "\t");

		}
		System.out.println();
		
		
		b[1] = 200;
		System.out.print("�迭 a���" + "\t");
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");

		}
		System.out.println();
		System.out.print("�迭 b���" + "\t");
		for (i = 0; i < b.length; i++) {
			System.out.print(b[i] + "\t");

		}
		
	}

}
