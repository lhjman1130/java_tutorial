package p0410;

public class Java0410_1reviewInsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//////////////// ���� 1. �������� (insert sort)

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
		int i, j, tmp;

		for (i = 1; i < a.length; i++) {
			tmp = a[i];
			j = i - 1;
			///////////// ���� ��, j�� ������ ������ �ȵǴϱ�.
			while (j >= 0 && a[j] > tmp) {
				a[j + 1] = a[j];
				j--;

			}
			j++;
			a[j] = tmp;
		}

		//////////////// ���� ���� ���� Ȯ��////////////

		System.out.println("after ����  ����");
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