package p0406;
//  insert sort(삽입정렬) 
public class Test0408_8_insertSort {

	public static void main(String[] args) {
		
		int[] a = {3, 7, 2, 5, 1};
		
		int i, j, tmp; 
		
		System.out.print("정렬전");
		for(i=0; i< a.length; i++){
			System.out.print(a[i] + "\t");
		}
		
		System.out.println();

		
		
////////////////////selection 정렬

		for (i = 0; i < a.length - 1; i++) {
			// i는 정렬될 방의 인덱스를 나타낸다. 
			int min = i; 
			// min은 최솟값의 위치. 초기값으로 i 할당.
			// j 는 최솟값을 찾기 위해 비교할 값을.
			for (j = i + 1; j < a.length; j++) {
				if (a[min] > a[j]) {
					min = j;
				}
				// 아랫 줄은 스왑을 의미함.
				if (min != i) {
					tmp = a[min];
					a[min] = a[i];
					a[i] = tmp;
				}
			}

		}

		System.out.print("정렬후");
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}

		System.out.println();
		
		
		
/////////////////////////////////////////////선택 정렬 끝.	
		
		
		
		
///////////////// insert sort 삽입 정렬 ////////////
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
		
		System.out.print("정렬후");
		for(i=0; i< a.length; i++){
			System.out.print(a[i] + "\t");
		}
		
		System.out.println();
*/
		
//////////////////////////////////삽입정렬 끝		
		
	
		
		
		
		
		
	
	/*	
		//////////////////내가 처음에 했던 코드
		// TODO Auto-generated method stub
		int[] a = {3, 7, 2, 5, 1};
		int i, j, tmp;
		System.out.print("정렬전");
		for(i=0; i< a.length; i++){
			System.out.print(a[i] + "\t");
		}
		
		System.out.println();

		// 정렬 후
		for (i = 1; i < a.length; i++) { // tmp에 넣을 것 선택.

			for (j = i - 1; j > 0; j--) {

				tmp = a[i];

				while (j >= 0 && a[j] > tmp) {
					a[j + 1] = a[j];

				}
				
			}
			
			
		}
		for (i = 0; i < a.length; i++) {
			System.out.print("2차" + a[i] + "\t");
		}
		*/
		
			
	}

}
