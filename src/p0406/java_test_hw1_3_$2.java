package p0406;

import java.util.Scanner;

// 클래스 선언할 때는 시작 문자가 대문자여야 한다. 
public class java_test_hw1_3_$2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i, j, num ;
		
		System.out.print("입력 : ");
		num = sc.nextInt();

		for (i = 1; i <= num; i++) {
			// for (j = 1; j < num - i; j++) {
			for (j = 1; j < (num+1)-i; j++) {
				System.out.print(" ");
			}
			j = 1;
			for (j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		sc.close();
	}
	
}
