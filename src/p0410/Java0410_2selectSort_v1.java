package p0410;

public class Java0410_2selectSort_v1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[] { 9, 7, 3, 10, 6, 7 };

		// ���� ���� ���� Ȯ��////////////

		System.out.println("������ ����");
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "]" + "\t");

		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");

		}
		System.out.println();

		/////////////////// ���� ���� ����.////�� ����/////
//		int i, j, min, tmp;
//
//		for (i = 0; i < a.length; i++) {
//			min = a[i];
//
//			for (j = i + 1; j < a.length; j++) {
//				if (a[j] <= min) {
//					min = a[j];
//				}
//				/// ����
//
//			}
//			tmp = a[i];
//			a[i] = min;
//			min = tmp;
//		}

		/////////////////////////������ ����/////////////
		System.out.println("������ ���� ���� ����");
		int i, j, min, tmp;

		for (i = 0; i < a.length - 1; i++) {
			min = i;

			for (j = i + 1; j < a.length; j++) {
				if (a[j] <= a[min]) {
					min = j;
				}
				/// ����
			}
			if (min != i) {
				tmp = a[min];
				a[min] = a[i];
				a[i] = tmp;
			}
		}
		
		
		//// ���� �� ����//////////////////////////////////////

		System.out.println("���� �� ����");
		for (i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "]" + "\t");

		}
		System.out.println();
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");

		}
		System.out.println();

	}

}
