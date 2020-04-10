package p0410;

import java.util.Scanner;

//캐릭터 스테이터스 입력 하고 출력하는 클래스 제작
//클래스 선언
class Status{
	String name;
	int hp, mp, exp;
	
	void setSta(String n, int h, int m, int e ){
		name = n;
		hp = h;
		mp = m;
		exp = e;
		
	}
	void printSta(){
		System.out.print("name :" + name +"\t");
		System.out.print("hp :" + hp +"\t");
		System.out.print("mp :" + mp +"\t");
		System.out.print("exp :" + exp +"\t");
		System.out.println();
	}
}
public class Java0410_8exMyself {
	
	public static void main(String[] args) {
		
		String name;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("이름을 입력하세요.");
		name = sc.next();
		System.out.println("이름을 입력하세요.");
		name = sc.next();
		System.out.println("이름을 입력하세요.");
		name = sc.next();
		System.out.println("이름을 입력하세요.");
		name = sc.next();
		System.out.println("이름을 입력하세요.");
		name = sc.next();
		
	}
		
	}
	
	
	

