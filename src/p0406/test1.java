package p0406;

import java.util.Scanner;

//모든 코드는 클래스 안에 있어야 한다. 자바 소스 확장자는 ~.java

/*  여러줄
 * 주석이
 * 된다.             */

public class test1 {

	// main함수. 프로그램의 시작과 끝.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력시 사용할 스캐너 장치를 하나 생성한 것.
		// main도 함수. 자바에서 메인함수는 시작과 끝.(딱 프로그램1개, 메인1개 있어야함)
		Scanner sc = new Scanner(System.in);
		//System.in 기본 시스템 입력을 해라. 즉, 키보드 

		System.out.print("번호:");
		int num = sc.nextInt();
		//num이라는 변수에 int 형태로 입력 받는다.

		System.out.print("이름 : ");
		String name = sc.next();
		//next는 받을 때 스페이스를 포함할 수 없다.  예를 들어, aaa bbb 이면, aaa만 읽는다. 스페이스 전.
		System.out.print("키 : ");
		float height = sc.nextFloat();
		
		System.out.print("주소 : ");
		sc.nextLine();
		//이거 쓰는 이유는..키 입력할 때, 버퍼에 남은 엔터를 지우려고, 
		//
		String address = sc.nextLine();//한 줄 엔터만날때까지
		//주소는 띄어쓰기 

		System.out.println("num : " + num);
		System.out.println("name: " + name);
		System.out.println("height :" + height);
		System.out.println("address : " + address);
		sc.close(); //워닝이 뜬거  없애주려면 이걸 적자.
			//Scanner sc;   타입이 스캐너, 변수명이 sc 
			//sc = new Scanner(System.in);        ㅇ 두줄을 한줄로 줄인것.
			//객체 생성하려면, 선언할 때, new를 꼭 붙여줘야한다. 객체를 만드려면, new를 적어야한다.
			//new는 힙에다가 메모리 할당하기위해.
			//클래스는 만들기에 따라 메모리가 달라짐. 디자인하기에 따라 달라서. 
		//system.IN은 표준입력......스트림에서 제공해주는 메소드를 이용해서 하려면 복잡한데
		// 그걸 스캐너(라는 클래스)가 대신 해준다.
		//근데,   ctrl + shift + o === 임포트 문이 자동 생성된다. 처음부터 선언하고 시작.
		//int는 기본(지역)변수....선언만해도 메모리 할당이 된다. 
		
	}

}	
		
		
		
	/*	try {

			int a = System.in.read();
			System.out.println(a);
		} catch (IOException e) {
			e.printStackTrace();

			// 자바는 유니코드를 써서, char이 2바이트 사용.
			// try catch는 프로그램이 중단되는 걸 막고(즉, 예외처리를 위해)
			// 예외처리는 중간에 뻗는 걸 막는다.

		}
		*/

