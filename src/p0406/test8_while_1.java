package p0406;

import java.util.Scanner;

//while���� Ƚ���� �������� �ʾ��� ��,
//for���� Ƚ���� ������ ���.
//Ƚ�����ٴ� ������ ������ ���.
//���� ��. 

public class test8_while_1 {
	public static void main(String[] args) {
	/*	
		int i=1, num;
		while(i<5){
			System.out.println(i);
			i++;
		}
		Scanner sc = new Scanner(System.in);
		while(i!=0){
			System.out.print("����� ���� �Է�");
			num = sc.nextInt();
			System.out.print("�Է°�;"+ num);
			System.out.print("�ݺ� ���߷��� 0 �Է�:");
			i = sc.nextInt();
					
		}
		*/
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է��ϼ���.:");
		num = sc.nextInt();
		while(num<0 || num>100){
			System.out.println("�ٽ� �Է��ϼ���.:");
			num = sc.nextInt();
		}
		 if(num>=90){   //�̰� �� ���� �ڵ�.
			System.out.println("A");
			}else if(num>=80){
				System.out.println("B");
			}else if(num>=70){
				System.out.println("C");
			}else if(num>=60){
				System.out.println("D");
			}else {
				System.out.println("F");
			}
		 System.out.println("***********");
		System.out.println("����� ������ " + num + "�� �Դϴ�.");
		
		
		
		
	}
}
