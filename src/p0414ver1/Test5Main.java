package p0414ver1;
// 실제로 this함수를 쓸 일은 많지 않다. this는 많이 쓰진 않다. 
class Test5{
	String name;
	String tel;
	String address;
	
	Test5(){       //t1 생성할 때 사용된다.
		this("aaa", "111");  //this 함수 : 다른 생성자 호출. 주의(생성자 안에서만 사용가능하고, 
							// 생성자 안에서도 1줄에 나옴(다른 실행문보다 앞서야만 한다.))
		System.out.println("디폴트 생성자");
	}
	
	Test5(String name, String tel){    //t2 생성할 때, 사용된다.
		this(name, tel, "대한민국");
		System.out.println("파람 2개 생성자");
	}
	
	Test5(String name, String tel, String address){// t3 생성할 때, 사용된다.
		this.name = name;
		this.tel = tel;
		this.address = address;
		
		System.out.println("name :"+ name);
		System.out.println("tel"+ tel);
		System.out.println("address"+address);
	}
}
public class Test5Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체 생성
		Test5 t1 = new Test5(); //t1을 생성. 파라미터 없는 디폴트 생성자로 
		t1.address = "sfasfsadf";
		Test5 t2 = new Test5("bbb", "010-333-1111");
		Test5 t3 = new Test5("ccc", "010-2222-1311", "seoul si ");
	}

}
