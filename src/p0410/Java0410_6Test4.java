package p0410;

//////////�ﰢ�� �����.
import java.util.Scanner;

public class Java0410_6Test4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i, j, size, m;
		char ch;

		System.out.print("size = ");
		size = sc.nextInt();
		m = (size / 2) + 1;
		for (i = 0; i < m; i++) { // �� ��
			ch = ' ';
			for (j = 0; j <= m + i; j++) { // i �ٿ� ��µ�  ch����
				if (j == m - 1 - i) {
					ch = '*';

				}
				System.out.print(ch);
			}
			System.out.println();
			System.out.println();
		}

	}
}
