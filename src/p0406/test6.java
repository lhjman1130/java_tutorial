package p0406;
//스위치문. 조건이 다양할 때 사용.
import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		String ch;
		
		System.out.print("id : ");
		ch = sc.next();
		
		// String ch="1";
		switch (ch) {
		case "1":
         			
			System.out.println("x는 1");
			break;   //현재 블록을 빠져나감.
		case "2":
			System.out.println("x는2");
			break;
		case "3":
			System.out.println("x는 3");
			break;
		default:    //일치하는 case가 없ㅇ르 때 실행
			System.out.println("x는 이외의 값");
			//디폴트는 없어도 되고, 있어도 됨.
			
		}
	}

}
