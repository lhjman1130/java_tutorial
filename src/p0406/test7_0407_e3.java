package p0406;

import java.util.Scanner;

public class test7_0407_e3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j,  result=0;
		Scanner sc=new Scanner(System.in);
	
	
		System.out.println("몇까지 더할래? : ");
		j = sc.nextInt();

		for(i=1;i<=j;i++){
			if(i==j){
				System.out.println(i + "=");
			}else{
			System.out.println(i + "+" );
			//result = result + i;
			result+=i;
			}
		}
		
		
		
		
	/*	for(i=1;i<=100;i++){
			if(i==100){
				System.out.println(i + "=");
			}else{
			System.out.println(i + "+");
			result = result + i;
			}
		}
		*/
		System.out.println(result);
	}

}
