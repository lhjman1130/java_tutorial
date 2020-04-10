package p0410;

import java.util.Scanner;

public class Java0410_3search_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int[] a = new int[] { 9, 7, 3, 10, 6, 7 };

		// 현재 정렬 상태 확인////////////

		System.out.println("정렬전 상태");
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "]" + "\t");

		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");

		}
		System.out.println();

		///////////////////////// 선생님 버전/////////////
		System.out.println("선생님 버전 선택 정렬");
		int i, j, min, tmp;

		for (i = 0; i < a.length - 1; i++) {
			min = i;

			for (j = i + 1; j < a.length; j++) {
				if (a[j] <= a[min]) {
					min = j;
				}
				/// 스왑
			}
			if (min != i) {
				tmp = a[min];
				a[min] = a[i];
				a[i] = tmp;
			}
		}

		//// 정렬 후 상태//////////////////////////////////////

		System.out.println("정렬 후 상태");
		for (i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "]" + "\t");

		}
		System.out.println();
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");

		}
		System.out.println();

		//////////////////// 이진 탐색///////////////////////
		int f, m, l, sch;

		l = a.length - 1;

		System.out.print("탐색할 숫자 : ");
		sch = sc.nextInt();

		if(sch == a[m]){
			System.out.print("찾으시는 " + sch +"는 지금 " + m + "번방에 있습니다." );
		}else if(sch < a[m]){
			l = m - 1;
		}
	}

}
