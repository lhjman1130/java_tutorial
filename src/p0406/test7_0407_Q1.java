package p0406;

import java.util.Scanner;


public class test7_0407_Q1 {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int i, j, result, a, b=4, c, size ;
		j=4;
		System.out.println("1������." + j + "�� ������");
		for(i=1; i<=j; i++){
			result = i*j;
			System.out.println(j + "*" + i + "=" + result);
			
		}
	
		
		//��ǥ �����.
		//�ﰢ�� �����.
		System.out.println("2������." + "�ﰢ������� ");
		/*
		for(a=1; a<=b; a++){
			
			for(c=1; c<=a ;c++){
			System.out.print("*");
			}
			System.out.println("");
			
		}
		*/
		
	
		String s = "*";
		System.out.println("size: ");
		size = sc.nextInt();
		System.out.println(size/2);
		i=0;
		if (i <= (size / 2)) {
		
			for (i = 1; i <= size; i++) {
				System.out.println(s);
				s += "**";
			}
		} else {
			System.out.print("���� �ƴ�");
			System.out.println(s);
	//		s -= "**";
		}
		
		
		
	}

}
