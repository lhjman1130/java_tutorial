package p0406;
//소수 골라내기.
import java.util.Scanner;

public class test7_teachers_answer2 {
	public static void main(String[] args) {

		int i, j, cnt;

		for (i = 2; i <= 100; i++) {
			cnt = 0; // 약수 개수 카운팅 변수

			for (j = 2; j < i - 1; j++) {
				if (i % j == 0) {
					cnt++; // 약수의 개수를 카운트 할 용도
				}
				//System.out.print(cnt);
			}
			if (cnt == 0) {
				System.out.println(i + "\t");
			}
		}

	}
}
