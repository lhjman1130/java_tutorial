package p0406;
//  insert sort(��������) 
public class Test0408_8_insertSort {

	public static void main(String[] args) {
		
		int[] a = {3, 7, 2, 5, 1};
		
		int i, j, tmp; 
		
		System.out.print("������");
		for(i=0; i< a.length; i++){
			System.out.print(a[i] + "\t");
		}
		
		System.out.println();

		
		
////////////////////selection ����

		for (i = 0; i < a.length - 1; i++) {
			// i�� ���ĵ� ���� �ε����� ��Ÿ����. 
			int min = i; 
			// min�� �ּڰ��� ��ġ. �ʱⰪ���� i �Ҵ�.
			// j �� �ּڰ��� ã�� ���� ���� ����.
			for (j = i + 1; j < a.length; j++) {
				if (a[min] > a[j]) {
					min = j;
				}
				// �Ʒ� ���� ������ �ǹ���.
				if (min != i) {
					tmp = a[min];
					a[min] = a[i];
					a[i] = tmp;
				}
			}

		}

		System.out.print("������");
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}

		System.out.println();
		
		
		
/////////////////////////////////////////////���� ���� ��.	
		
		
		
		
///////////////// insert sort ���� ���� ////////////
/*		for (i = 1; i < a.length; i++) {
			tmp = a[i];
			j = i-1 ;
			while ( j >=0 && a[j] >tmp ){
				a[j+1] = a[j];
				j--;
			}
			j++;
			a[j] = tmp;
			
				
		}
		
		System.out.print("������");
		for(i=0; i< a.length; i++){
			System.out.print(a[i] + "\t");
		}
		
		System.out.println();
*/
		
//////////////////////////////////�������� ��		
		
	
		
		
		
		
		
	
	/*	
		//////////////////���� ó���� �ߴ� �ڵ�
		// TODO Auto-generated method stub
		int[] a = {3, 7, 2, 5, 1};
		int i, j, tmp;
		System.out.print("������");
		for(i=0; i< a.length; i++){
			System.out.print(a[i] + "\t");
		}
		
		System.out.println();

		// ���� ��
		for (i = 1; i < a.length; i++) { // tmp�� ���� �� ����.

			for (j = i - 1; j > 0; j--) {

				tmp = a[i];

				while (j >= 0 && a[j] > tmp) {
					a[j + 1] = a[j];

				}
				
			}
			
			
		}
		for (i = 0; i < a.length; i++) {
			System.out.print("2��" + a[i] + "\t");
		}
		*/
		
			
	}

}
