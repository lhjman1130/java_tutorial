package p0406;

import java.util.Scanner;

public class test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		int score=0, num;
		
		System.out.print("score :");
		score = sc.nextInt();
		if ( score >100 || score <0){
			System.out.println("잘못된 점수, 프로그램 종료");
			return; //현재 함수 종료, 여기서는 메인, 프로그램 종료
		}else{
			if(score>=60){
				System.out.println("합격");
				
			}else{
				System.out.println("불합격");
			}
		}
		
		System.out.println("num :");
		num = sc.nextInt();
		if (num % 2 ==0){
			System.out.println("짝수");
	
		}else{
			System.out.println("홀수");
		}
		
		
		
		
		
		
		/*	
		System.out.print("점수를 넣으시오 : ");
		int num = sc.nextInt();
		
		if (num >=60 && num<=100){
			System.out.println("합격입니다.");
			
		}else {
			System.out.println("불합격");
			
		}
		

		System.out.print("다음 숫자를 넣으시오 : ");

		int numb = sc.nextInt();
		
		if (numb%2 == 0){
			System.out.println("짝수입니다.");
			
		}else{
			System.out.println("홀수입니다.");
		}
		*/
	}

}
