package p0410;

public class Java0410_1reviewInsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//////////////// 복습 1. 삽입정렬 (insert sort)

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
		int i, j, tmp;

		for (i = 1; i < a.length; i++) {
			tmp = a[i];
			j = i - 1;
			///////////// 비교할 때, j는 음수가 나오면 안되니까.
			while (j >= 0 && a[j] > tmp) {
				a[j + 1] = a[j];
				j--;

			}
			j++;
			a[j] = tmp;
		}

		//////////////// 현재 정렬 상태 확인////////////

		System.out.println("after 정렬  상태");
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