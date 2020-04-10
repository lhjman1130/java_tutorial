package p0409;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1; //객체 선언.
		p1 = new Person(); //객체생성. new 하면 힙에 할당. 인트도, 스트링도 4바이트.
		                       ///person 은 생성자. 
		p1.setInfo(10,  "aaa");
		p1.PrintInfo();
		
		Person p2 = new Person();
		
		p2.setInfo(20, "bbb");
		p2.PrintInfo();
		
		Person p3 = p1 ; //참조값만 복사, 얕은 복사
		p3.PrintInfo();
		
		System.out.println("p1 : "+ p1);
		System.out.println("p2 : "+ p2);
		System.out.println("p3 : "+ p3);
	
		
		
		/*	p1.age = 10;
		p1.name = "aaa";
		
		System.out.println("p1.age");
		
		*/
	}

}
