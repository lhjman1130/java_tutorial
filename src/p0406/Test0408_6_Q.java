package p0406;

import java.util.Scanner;

public class Test0408_6_Q {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//������ �ڵ�
		String name ; 
		String[] str= {"num", "kor", "eng", "math", "total"};
		int[] score = new int[5];
		float avg;
		int i;
		
		
		System.out.println("name : ");
		name = sc.next();
		for (i =0; i<4; i++){
			System.out.println(str[i] + ":");
			score[i] = sc.nextInt();
			if (i != 0){
				score[4] += score[i];  //�������
				
			}
		}
		avg = (float) score[4] / 3; //��հ��
		
		System.out.println("name: " + name);
		for ( i=0 ; i < score.length; i++){
			System.out.println(str[i] + ":");
			System.out.println(score[i] );
		}
		System.out.println("average : " + avg);
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
/*���� �� �ڵ�
		String name;
		int[] score = new int[4];    //�����Է� ����
		int i;
		int sum ;                    //����
		float avg ;					//���
		System.out.println("�̸�:");
		name = sc.next();
		System.out.println("��ȣ:");
		score[0] = sc.nextInt();
		System.out.println("����:");
		score[1] = sc.nextInt();
		System.out.println("����:");
		score[2] = sc.nextInt();
		System.out.println("����:");
		score[3] = sc.nextInt();
		
									
		for(i=0; i<4; i++){
			
			System.out.println(score[i]);
		}
		
		
	/*	for(i=1; i<4; i++){*/
	/*		
			sum = sum + score[i] ;
		}
		
		avg = (sum / 3);
		
		
		
		
		System.out.println("������" + sum + "�Դϴ�.");*/
		//System.out.println("�����" + avg + "�Դϴ�.");
		
		
	
		
		
		
		
		
		
		
		
	}
	
}
