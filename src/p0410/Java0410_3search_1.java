package p0410;

import java.util.Scanner;

public class Java0410_3search_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
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

		///////////////////////// ������ ����/////////////
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

		//////////////////// ���� Ž��///////////////////////
		int f, m, l, sch;

		l = a.length - 1;

		System.out.print("Ž���� ���� : ");
		sch = sc.nextInt();

		if(sch == a[m]){
			System.out.print("ã���ô� " + sch +"�� ���� " + m + "���濡 �ֽ��ϴ�." );
		}else if(sch < a[m]){
			l = m - 1;
		}
	}

}
