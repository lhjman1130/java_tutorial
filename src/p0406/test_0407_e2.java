package p0406;

import java.util.Scanner;

public class test_0407_e2 {
//0-100 ���� �޾Ƽ� ���� ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.in �⺻ �ý��� �Է��� �ض�. ��, Ű���� 

		System.out.print("������ �־��� : ");
		int num = sc.nextInt();
		
		if(num<0 || num>100){
			System.out.println("������ �߸� �־����.");
			return;
			
		}//else if(num>=90 && num<=100){
		else if(num>=90){   //�̰� �� ���� �ڵ�.
		System.out.println("A");
		}else if(num>=80 && num<90){
			System.out.println("B");
		}else if(num>=70 && num<80){
			System.out.println("C");
		}else if(num>=60 && num<70){
			System.out.println("D");
		}else {
			System.out.println("F");
		}

	}
}

