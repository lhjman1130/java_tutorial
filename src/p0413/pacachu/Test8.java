package p0413.pacachu;

public class Test8 {
	private int a;   //클래스 내에서만 가능
	int b; 		//패키지 내에서만 
	public int c; // 패키지 밖에서도 사용 가능.
	
	public Test8(){            //생성자. 클래스 이름과 같은 메서드
		a=1;
		b=2;
		c=3;
		
	}
	
	public void printMem(){
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("c:" + c);
		
	}
	
	private void test1(){
		System.out.println("클래스 내에서만 호출" );
		
	}
	void test2(){
		System.out.println("패키지 내에서만 호출" );
	}
	public void test3(){
		System.out.println("패키지 밖에서도 호출" );
	}
}
