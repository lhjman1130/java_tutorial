package p0410;

////////////////���� 1. �������� (insert sort)
public class Java0410_1review1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] { 9, 7, 3, 10, 6, 7 };

		//////////////// ���� ���� ���� Ȯ��////////////

		System.out.println("������ ����");
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] ��" + "\t");

		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");

		}
		System.out.println();

		/////////////////// ���� ���� ��./////////
		int i, j=0, tmp=0, k;

		for (i = 1; i < a.length; i++) {
			for (k = i; k >= 0; k--) {
				j = i - 1;
				tmp = a[i];
				if (a[k] >= tmp) {
					a[i] = a[k];
					a[k+1] = a[k];
					a[k] = tmp;
					

					// �ڸ��ٲ�.a[k]�� tmp.
					// �׸��� ���� k���� �ϳ� ���̰�.
				}
				System.out.println("i��"+ i + ", K�� " + k + ", j�� "+ j + ". \t");
				System.out.print( "tmp �濡�� " + tmp + "\t");
				System.out.print(i + "�濡�� " + a[i] + "\t");
				System.out.print(j + "�濡�� " + a[j] + "\t");
				for(k=0; k<i; k++)
					System.out.print(k + "�濡�� " + a[i] + "\t");
				System.out.println();
			}
			
			

		}

		System.out.println("������ ����");

		for (i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] ��" + "\t");

		}
		System.out.println();
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");

		}
		System.out.println();

	}

}
