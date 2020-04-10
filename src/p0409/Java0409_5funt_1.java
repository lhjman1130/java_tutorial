package p0409;

import java.util.Scanner;

public class Java0409_5funt_1 {
	static int f1(int num){
		int res;
		res = num * 3;
		return res;
	}
	
	static void f2(String name){
		System.out.println(name + "님 반갑습니다.");
	}
	
	static char f3(int idx){
		char[] arr= {'a', 'b', 'c'};
		if(idx <0 || idx >= arr.length){
			return (char) -1;             //컴퓨터에서 -1은 오작동을 의미한다. 
			
		}
		return arr[idx];
	}
	
	static float add(float a1, float b1){
		return a1+b1 ;
	}
	static float sub(float a1, float b1){
		return a1-b1 ;
	}
	static float mul(float a1, float b1){
		return a1*b1 ;
	}
	static float div(float a1, float b1){
		return a1/b1 ;
	}
	
	
	
////////객체 생성 없이 함수 호출하려면 static 붙이면 됨. 변수 할당.없이.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a1, b1 ;
		
		boolean flag = true;
		
		Scanner sc = new Scanner(System.in);
		
		int x = f1(3);
		f2("asdf");
		System.out.println("x:" + x);
		
		char y= f3(2);
		System.out.println("y:" +y);
		
		System.out.println("연산을 고르시오." );
		System.out.println("1.add   2.sub    3.mul    4.div " );
		int oper1 = sc.nextInt();
		
	switch(oper1){
		case 1:
			System.out.println("두 수를 입력하세요." );
			a1 = sc.nextInt();
			b1 = sc.nextInt();
			System.out.println(a1 + " + " +b1 +" = "+add(a1, b1));
			break;
		case 2:
			System.out.println("두 수를 입력하세요." );
			a1 = sc.nextInt();
			b1 = sc.nextInt();
			System.out.println(a1 + " - " +b1 +" = "+sub(a1, b1));
			break;
			
		case 3:
			System.out.println("두 수를 입력하세요." );
			a1 = sc.nextInt();
			b1 = sc.nextInt();
			System.out.print(a1 + " * " +b1 +" = "+mul(a1, b1));
			break;
			
		case 4:
			System.out.println("두 수를 입력하세요." );
			a1 = sc.nextInt();
			b1 = sc.nextInt();
			System.out.print(a1 + " / " +b1 +" = "+ div(a1, b1));
			break;
			/////return값은 단 하나만 반환 가능. 배열을 이용하면 가능은 하다. 
		default:
		flag = false;
				
			
	}
	
	if(flag){

		
	}else{
		System.out.print("잘못 입력");
	}
		
		
		
		
		
		sc.close();
		
	}
	

}
