package p0406;
//���� 1��.
import java.util.Scanner;

public class java_test_hw1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num, i, j ;
		
		System.out.println("�Է� :");
		num = sc.nextInt();
		
		for(j=1; j<=num; j++) {
			for(i=1; i<=j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
