package p0406;

import java.util.Scanner;

public class test_0407_e2 {
//0-100 점수 받아서 학점 출력
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.in 기본 시스템 입력을 해라. 즉, 키보드 

		System.out.print("점수를 넣어줘 : ");
		int num = sc.nextInt();
		
		if(num<0 || num>100){
			System.out.println("점수를 잘못 넣었어요.");
			return;
			
		}//else if(num>=90 && num<=100){
		else if(num>=90){   //이게 더 나은 코드.
		System.out.println("A");
		}else if(num>=80 && num<90){
			System.out.println("B");
		}else if(num>=70 && num<80){
			System.out.println("C");
		}else if(num>=60 && num<70){
			System.out.println("D");
		}else {
			System.out.println("F");
		}

	}
}

