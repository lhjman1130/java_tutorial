package p0406;

import java.util.Scanner;

public class test_0407_e3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1, num2, result=0;
		boolean flag = true;
		
		
		
		
		String a="";
		
		System.out.println("���� 2�� �Է� :");
		num1 = sc.nextInt();
		System.out.print(num1 + ",");
		num2 = sc.nextInt();
		
		System.out.print("� ������ ó���ҷ�?");
		a = sc.next();
		
		switch(a){
		case "+":
			result = num1 + num2;
			break;
		case "-":
			System.out.print(num1 + a + num2 + "=" + (num1-num2));
			break;

		case "*":
			System.out.print(num1 + a + num2 + "=" + (num1*num2));
			break;

		case "/":
			if(num2==0){
				System.out.println("0���γ���������");
				flag = false; //������ ������� �ʾ����� ǥ��.
				//true�� ���������� ó�� �Ȱ� �´�.
			//	System.out.println(flag);
				break;
			}
			System.out.print(num1 + a + num2 + "=" + (num1/num2));
			
			break;
			
		default:
			return;
		}
		if (flag)   //flag�� ���� �븸 ����.
			System.out.println(num1 + a + num2 + "=" + result);
	}

}
