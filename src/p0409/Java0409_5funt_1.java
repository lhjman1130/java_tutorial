package p0409;

import java.util.Scanner;

public class Java0409_5funt_1 {
	static int f1(int num){
		int res;
		res = num * 3;
		return res;
	}
	
	static void f2(String name){
		System.out.println(name + "�� �ݰ����ϴ�.");
	}
	
	static char f3(int idx){
		char[] arr= {'a', 'b', 'c'};
		if(idx <0 || idx >= arr.length){
			return (char) -1;             //��ǻ�Ϳ��� -1�� ���۵��� �ǹ��Ѵ�. 
			
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
	
	
	
////////��ü ���� ���� �Լ� ȣ���Ϸ��� static ���̸� ��. ���� �Ҵ�.����.
	
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
		
		System.out.println("������ ���ÿ�." );
		System.out.println("1.add   2.sub    3.mul    4.div " );
		int oper1 = sc.nextInt();
		
	switch(oper1){
		case 1:
			System.out.println("�� ���� �Է��ϼ���." );
			a1 = sc.nextInt();
			b1 = sc.nextInt();
			System.out.println(a1 + " + " +b1 +" = "+add(a1, b1));
			break;
		case 2:
			System.out.println("�� ���� �Է��ϼ���." );
			a1 = sc.nextInt();
			b1 = sc.nextInt();
			System.out.println(a1 + " - " +b1 +" = "+sub(a1, b1));
			break;
			
		case 3:
			System.out.println("�� ���� �Է��ϼ���." );
			a1 = sc.nextInt();
			b1 = sc.nextInt();
			System.out.print(a1 + " * " +b1 +" = "+mul(a1, b1));
			break;
			
		case 4:
			System.out.println("�� ���� �Է��ϼ���." );
			a1 = sc.nextInt();
			b1 = sc.nextInt();
			System.out.print(a1 + " / " +b1 +" = "+ div(a1, b1));
			break;
			/////return���� �� �ϳ��� ��ȯ ����. �迭�� �̿��ϸ� ������ �ϴ�. 
		default:
		flag = false;
				
			
	}
	
	if(flag){

		
	}else{
		System.out.print("�߸� �Է�");
	}
		
		
		
		
		
		sc.close();
		
	}
	

}
