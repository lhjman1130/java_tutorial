package p0406;

import java.util.Scanner;

public class test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		int score=0, num;
		
		System.out.print("score :");
		score = sc.nextInt();
		if ( score >100 || score <0){
			System.out.println("�߸��� ����, ���α׷� ����");
			return; //���� �Լ� ����, ���⼭�� ����, ���α׷� ����
		}else{
			if(score>=60){
				System.out.println("�հ�");
				
			}else{
				System.out.println("���հ�");
			}
		}
		
		System.out.println("num :");
		num = sc.nextInt();
		if (num % 2 ==0){
			System.out.println("¦��");
	
		}else{
			System.out.println("Ȧ��");
		}
		
		
		
		
		
		
		/*	
		System.out.print("������ �����ÿ� : ");
		int num = sc.nextInt();
		
		if (num >=60 && num<=100){
			System.out.println("�հ��Դϴ�.");
			
		}else {
			System.out.println("���հ�");
			
		}
		

		System.out.print("���� ���ڸ� �����ÿ� : ");

		int numb = sc.nextInt();
		
		if (numb%2 == 0){
			System.out.println("¦���Դϴ�.");
			
		}else{
			System.out.println("Ȧ���Դϴ�.");
		}
		*/
	}

}
