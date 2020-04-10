package p0406;

import java.util.Scanner;

public class Test0408_6_Q {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//선생님 코드
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
				score[4] += score[i];  //총점계산
				
			}
		}
		avg = (float) score[4] / 3; //평균계산
		
		System.out.println("name: " + name);
		for ( i=0 ; i < score.length; i++){
			System.out.println(str[i] + ":");
			System.out.println(score[i] );
		}
		System.out.println("average : " + avg);
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
/*내가 한 코드
		String name;
		int[] score = new int[4];    //점수입력 변수
		int i;
		int sum ;                    //총점
		float avg ;					//평균
		System.out.println("이름:");
		name = sc.next();
		System.out.println("번호:");
		score[0] = sc.nextInt();
		System.out.println("국어:");
		score[1] = sc.nextInt();
		System.out.println("영어:");
		score[2] = sc.nextInt();
		System.out.println("수학:");
		score[3] = sc.nextInt();
		
									
		for(i=0; i<4; i++){
			
			System.out.println(score[i]);
		}
		
		
	/*	for(i=1; i<4; i++){*/
	/*		
			sum = sum + score[i] ;
		}
		
		avg = (sum / 3);
		
		
		
		
		System.out.println("총점은" + sum + "입니다.");*/
		//System.out.println("평균은" + avg + "입니다.");
		
		
	
		
		
		
		
		
		
		
		
	}
	
}
