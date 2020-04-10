package p0406;

import java.util.Scanner;

public class test0408_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	
	int num;
	String str = "";
	
	while(true){        		//무한루프
		System.out.println("출력숫자 입력");
		num = sc.nextInt();
		System.out.println("입력값" + num);
		System.out.println("멈추려면 stop 입력" );
		str = sc.next();
		if(str.startsWith("stop")){
			break;    //루프를 빠져나옴.
		}
		
	}
	}

}
