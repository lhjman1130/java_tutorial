package p0406;

import java.util.Scanner;

// Ŭ���� ������ ���� ���� ���ڰ� �빮�ڿ��� �Ѵ�. 
public class java_test_hw1_3_$2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i, j, num ;
		
		System.out.print("�Է� : ");
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
