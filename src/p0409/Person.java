package p0409;
//캡슐화 , 객체 타입은 값을 여러 개 담을 수 있음.
//타입을 정의함
//타입의 이름은 Person(int, float)
//클래스에 멤버로 있는 함수를 메소드라 한다. 
//클래스는 멤버 변수와 메서드로 구성.
//실행문에서는 메서드 밖에서 실행문을 적으며 안된다. 
public class Person {
	//멤버변수 :  클래스 안에서 전역변수처럼 모든 함수에서 사용가능.
	int age;
	String name;
	//메서드
	void setInfo(int a, String n){   //파라메터, 지역변수 현재 함수 안에서만 사용가능.
		age = a;
		name = n;
//멤버변수 에이지와 네임에 값을 넣어주는 역할.
		
	}
	//System.out.println("age = "+ age); 이런 곳에 쓰면 에러남.
	void PrintInfo(){           //출력해주는 역할.
		//System.out.println("age = "+ a); 이런 것도 에러. 변수는  
		System.out.println("age = "+ age);
		System.out.println("name = "+ name);
	}


}

