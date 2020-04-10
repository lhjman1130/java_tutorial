package p0410;

import java.util.Scanner;

class Score{
	int[] score;
	float avg;
	void setinfo(int kor, int eng, int math){
		score = new int[4] ; //
		score[0] = kor;
		score[1] = eng;
		score[2] = math;
	}
	void mk(){
		for (int i = 0; i<3 ; i++){
			score[3] += score[i];
			
		}
		avg = (float)score[3]/3;
	}
}

class Student2 {
	String name;
	int[] score;// 배열 생성 안함
	float avg;

	void setInfo(String n, int[] s) {
		name = n;
		score = s;
		for (int i = 1; i < 4; i++) {
			score[4] += score[i];
		}
		avg = (float) score[4] / 3;
	}

	void printInfo() {
		System.out.print(name + "/");
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + "/");
		}
		System.out.println(avg);
	}
}

public class StudentMain {

	static void input(Scanner sc, Student2 s) {
		int[] a = new int[5];
		String[] title = { "num:", "kor:", "eng:", "math:" };
		System.out.print("name:");
		String name = sc.next();
		for (int i = 0; i < 4; i++) {
			System.out.print(title[i]);
			a[i] = sc.nextInt();
		}
		s.setInfo(name, a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student2 s1 = new Student2();
		input(sc, s1);
		Student2 s2 = new Student2();
		input(sc, s2);
		Student2 s3 = new Student2();
		input(sc, s3);
		
		s1.printInfo();
		s2.printInfo();
		s3.printInfo();
	}

}
