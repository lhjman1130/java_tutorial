package p0406;

public class Test0408_9_binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        // 0  1  2  3  4 
		int[] a = {2, 7, 49, 70, 71};
		
		int mid, i; 
		int sch=70;
		int f=0, l=a.length-1 ;   //f�� ù����� �ε���(Ž�������� ù���)

		for (i = 0; i < a.length; i++) {

			System.out.println(i + "��° Ž��");
			System.out.println("���� f��"+ f);
			System.out.println("���� l��" + l);
			
			
			mid = (f + l) / 2; // �߰��� ã��.
			System.out.println("���� mid�� " + mid);
			if (a[mid] == sch) {
				System.out.println("got it!");
				System.out.println( i + "�� ã�Ƽ� " + mid + "��° ������ ã��");
				return;
				
			}else if (a[mid] < sch) {
				f = mid;

				
			} else {
				l = mid ;
				

			}
			
			
			
		}
		System.out.println("����");
	}

}
