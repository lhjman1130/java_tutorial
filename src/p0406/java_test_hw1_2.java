package p0406;
//문제 2번
import java.util.Scanner;

public class java_test_hw1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num, i, j;

		System.out.println("입력 :");
		num = sc.nextInt();

		for (j = 1; j <= num; j++) {
			for (i = 1; i <= num; i++) {
				if(i<=num-j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
