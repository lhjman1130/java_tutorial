package p0406;
//���� 3��. �Ƕ�̵� �����.
import java.util.Scanner;

public class java_test_hw1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num, i, j, cnt;

		System.out.println("�Է� :");
		num = sc.nextInt();
		//cnt = num;
		for (j = 1; j <= num; j++) {  			//�ٹٲ�.
			
			
			for (i = 1; i <= cnt; i++) {                  //���ٿ� üũ
				if(i<=cnt-j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
					
					
				}
				System.out.print(cnt);                //cnt�� üũ
				cnt = cnt + 2;
				System.out.print(cnt);                //cnt�� üũ
			}
			System.out.print(cnt);                //cnt�� üũ
			System.out.println();
			
		}
	}

}
