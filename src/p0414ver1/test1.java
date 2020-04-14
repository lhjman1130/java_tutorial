package p0414ver1;


//멤버변수는 0을 처음에 가진다. 

class StaticTest{
	int a; //일반 멤버변수 --->heap 에 할당.
	static int b; //스테틱 멤버변수. --->static이 쓰여있으면  static에 할당.
					//같은 객체이지만 다른 곳에 저장된다. 
				//메모리 하나만 할당 받아서 모든 객체가 공용으로 사용. 
				//초기화는 한번만 실행.
	void addNum(){    //메서드. a,b 1씩 증가시킴. 처음에 초기화니까 0이었겠고.
		a++;
		b++;
			}
	void printNum(){
		System.out.println("a:"+ a);
		System.out.println("b:"+ b);
		
	}

}
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticTest st1 = new StaticTest();   //객체 생성.
		st1.addNum();
		st1.printNum();
		
		StaticTest st2 = new StaticTest();
		st2.addNum();
		st2.printNum();
		
		StaticTest st3 = new StaticTest();
		st3.addNum();
		st3.printNum();
		
		System.out.println(StaticTest.b);
		System.out.println(st2.b);             //워닝이 뜬다.
		System.out.println(st3.b);
		
	//	System.out.println(StaticTest.a);
		
	}

}
