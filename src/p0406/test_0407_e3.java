package p0406;

import java.util.Scanner;

public class test_0407_e3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1, num2, result=0;
		boolean flag = true;
		
		
		
		
		String a="";
		
		System.out.println("정수 2개 입력 :");
		num1 = sc.nextInt();
		System.out.print(num1 + ",");
		num2 = sc.nextInt();
		
		System.out.print("어떤 연산을 처리할래?");
		a = sc.next();
		
		switch(a){
		case "+":
			result = num1 + num2;
			break;
		case "-":
			System.out.print(num1 + a + num2 + "=" + (num1-num2));
			break;

		case "*":
			System.out.print(num1 + a + num2 + "=" + (num1*num2));
			break;

		case "/":
			if(num2==0){
				System.out.println("0으로나눌수없음");
				flag = false; //연산이 수행되지 않았음을 표시.
				//true면 정상적으로 처리 된게 맞다.
			//	System.out.println(flag);
				break;
			}
			System.out.print(num1 + a + num2 + "=" + (num1/num2));
			
			break;
			
		default:
			return;
		}
		if (flag)   //flag가 참일 대만 실행.
			System.out.println(num1 + a + num2 + "=" + result);
	}

}
