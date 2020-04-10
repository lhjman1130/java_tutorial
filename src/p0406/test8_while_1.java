package p0406;

import java.util.Scanner;

//while문은 횟수가 정해지지 않았을 때,
//for문이 횟수가 정해진 경우.
//횟수보다는 조건이 정해진 경우.
//예를 들어서. 

public class test8_while_1 {
	public static void main(String[] args) {
	/*	
		int i=1, num;
		while(i<5){
			System.out.println(i);
			i++;
		}
		Scanner sc = new Scanner(System.in);
		while(i!=0){
			System.out.print("출력할 숫자 입력");
			num = sc.nextInt();
			System.out.print("입력값;"+ num);
			System.out.print("반복 멈추려면 0 입력:");
			i = sc.nextInt();
					
		}
		*/
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하세요.:");
		num = sc.nextInt();
		while(num<0 || num>100){
			System.out.println("다시 입력하세요.:");
			num = sc.nextInt();
		}
		 if(num>=90){   //이게 더 나은 코드.
			System.out.println("A");
			}else if(num>=80){
				System.out.println("B");
			}else if(num>=70){
				System.out.println("C");
			}else if(num>=60){
				System.out.println("D");
			}else {
				System.out.println("F");
			}
		 System.out.println("***********");
		System.out.println("당신의 점수는 " + num + "점 입니다.");
		
		
		
		
	}
}
