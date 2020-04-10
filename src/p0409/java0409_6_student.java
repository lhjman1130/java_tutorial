package p0409;

import java.util.Scanner;

class Student { 				// 학생 정보를 받는 클래스 
	String name;
	int	num, kor, eng, math;
	float sum, avg;
	
	//자주 사용하는 코드를 메서드로 만들면 더 좋지.
	
	void setInfo(int n, int k, int e, int m){
		num= n ;
		kor = k ;
		eng = e ;
		math = m ;
		sum = kor + eng + math;
		avg = (float) sum / 3;
	}
	void printInfo(){
		System.out.print("name : " + name);
		System.out.print("num : " + num);
		System.out.print("kor : " + kor);
		System.out.print("eng : " + eng);
		System.out.print("math : " + math);
		System.out.print("total : " + sum);
		System.out.print("average : " + avg);
		
	}
}


public class java0409_6_student {
	
	static void input(Student s, Scanner sc){
		System.out.print("name : ");
		String name = sc.next();
		System.out.print("num : ");
		int num = sc.nextInt();
		System.out.print("kor : ");
		int kor = sc.nextInt();
		System.out.print("eng : ");
		int eng = sc.nextInt();
		System.out.print("math : ");
		int math = sc.nextInt();
		
		s.setInfo(name, num, kor, eng, math);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Student s1 = new Student();

		input(s1, sc);
		
		
		Scanner sc = new Scanner(System.in);

		Student s2 = new Student();

		input(s2, sc);
		
		

		Scanner sc = new Scanner(System.in);

		Student s1 = new Student();

		input(s1, sc);
	}

}
