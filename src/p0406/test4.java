package p0406;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		Scanner sc;
		sc = new Scanner(System.in);
		
		
		System.out.print("입력해줘");
		int num = sc.nextInt();
		int x= 3;
		
		
		
		if(x==1){
			System.out.println("x는 1");
		}else if(x==2){
			System.out.println("x는 2");
		}else if(x==3){
			System.out.println("x는3");
		}else{
			System.out.println("이외의 값");
		}
	}

}
