package p0406;
//�Ҽ� ��󳻱�.
import java.util.Scanner;

public class test7_teachers_answer2 {
	public static void main(String[] args) {

		int i, j, cnt;

		for (i = 2; i <= 100; i++) {
			cnt = 0; // ��� ���� ī���� ����

			for (j = 2; j < i - 1; j++) {
				if (i % j == 0) {
					cnt++; // ����� ������ ī��Ʈ �� �뵵
				}
				//System.out.print(cnt);
			}
			if (cnt == 0) {
				System.out.println(i + "\t");
			}
		}

	}
}
