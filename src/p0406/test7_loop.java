package p0406;

import java.util.Scanner;

public class test7_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for문 ---for(초기값;조건;증감수식)
		int i;


		/*  1번째 시도
		  
		  for (i=1; i<100; i=i+2){
			System.out.println(i);    
		}*/
		
		for(i=1; i<100; i++){
			if (i%2==1){
				System.out.print(i +"\t");
			}
		}
	}

}























/*	Scanner sc = new Scanner(System.in);



System.out.print("j는 몇?");
j = sc.nextInt();
for (i = 1; i <= j; i++) {
	System.out.println(i);            
	
}            */