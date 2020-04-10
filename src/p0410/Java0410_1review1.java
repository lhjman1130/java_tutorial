package p0410;

////////////////복습 1. 삽입정렬 (insert sort)
public class Java0410_1review1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] { 9, 7, 3, 10, 6, 7 };

		//////////////// 현재 정렬 상태 확인////////////

		System.out.println("정렬전 상태");
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] 방" + "\t");

		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");

		}
		System.out.println();

		/////////////////// 삽입 정렬 후./////////
		int i, j=0, tmp=0, k;

		for (i = 1; i < a.length; i++) {
			for (k = i; k >= 0; k--) {
				j = i - 1;
				tmp = a[i];
				if (a[k] >= tmp) {
					a[i] = a[k];
					a[k+1] = a[k];
					a[k] = tmp;
					

					// 자리바꿈.a[k]와 tmp.
					// 그리고 나서 k값은 하나 줄이고.
				}
				System.out.println("i가"+ i + ", K가 " + k + ", j가 "+ j + ". \t");
				System.out.print( "tmp 방에는 " + tmp + "\t");
				System.out.print(i + "방에는 " + a[i] + "\t");
				System.out.print(j + "방에는 " + a[j] + "\t");
				for(k=0; k<i; k++)
					System.out.print(k + "방에는 " + a[i] + "\t");
				System.out.println();
			}
			
			

		}

		System.out.println("정렬후 상태");

		for (i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] 방" + "\t");

		}
		System.out.println();
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");

		}
		System.out.println();

	}

}
