package p0406;
//퀴즈 3번. 피라미드 만들기.
import java.util.Scanner;

public class java_test_hw1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num, i, j, cnt;

		System.out.println("입력 :");
		num = sc.nextInt();
		//cnt = num;
		for (j = 1; j <= num; j++) {  			//줄바꿈.
			
			
			for (i = 1; i <= cnt; i++) {                  //한줄에 체크
				if(i<=cnt-j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
					
					
				}
				System.out.print(cnt);                //cnt값 체크
				cnt = cnt + 2;
				System.out.print(cnt);                //cnt값 체크
			}
			System.out.print(cnt);                //cnt값 체크
			System.out.println();
			
		}
	}

}
