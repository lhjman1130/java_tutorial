package p0409;

import java.util.Scanner;

public class Java_hw_fibo_ver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		int b = 1;

		Scanner sc = new Scanner(System.in);
		int i = 0, num, sum;

		System.out.print("항 개수 입력 : ");
		num = sc.nextInt();

		for (i = 0; i <= num - 1; i++) {
			System.out.print(a);

			sum = a + b;
			a = b;
			b = sum;

			if (i == num - 1) {
				System.out.print("끝");
			} else {
				System.out.print(",");
			}
			// System.out.print("arr["+ i + "]= " + arr[i]);
			// System.out.println();
		}
		sc.close();
	}

}
