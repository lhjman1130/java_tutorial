package p0414ver1;
class Test4{
	String name;       //멤버변수
	int age;
	
	Test4(String n, int a){            //타입이 없고, 클래스랑 이름이 같다. 생성자. 
		name = n;						//void 라도 써야된다. 
		age = a; 						//멤버변수 초기화 해준다.(기존의 셋인포 역할과 동일)
	}									// 파라미터 두개 받는다. 
	Test4(){                 //"디폴트 생성자" 이걸 써주는 게 좋다. 초기화 역할.
		
	}
	
	void printInfo(){
		System.out.println("name :"+name);
		System.out.println("age :"+ age);
		
	}
}


public class Test4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Test4 t = new Test4();   //선언과 생성 동시에 했는데, 에러.
		Test4 t2 = new Test4();           //위에서 클래스 안에서 Test4(){} 이걸 넣어줘야 
		t2.printInfo();						// 맘이 편하다. 
		
		Test4 t = new Test4("lee", 30);  
		t.printInfo();            //생성자 딱 하나 만들었고, 파파미터는 안넣어줘서.에러
		//지금까지는 Test3 t = new Test(); 해주면 컴파일러가 알아서 생성자를 . 디폴트 생성자를
		 // 알아서 만들어줬었다.  디폴트 생성자 모양이 어떻게 생겼나ㅑ면?
		  // Test4(){}; 이런걸 만들어줬었다. 파라미터가 없는 객체로 생성자를 만들었어야 되었다. 
		  // 근데 생성자를 하나라도 만들면. 디폴트 생성자를 안만들어준다. 
		 // 그럴 때 파라미터 없는 객체 생성자 만들면 디폴트 안만들어 준다. 
		 // 애도 메서드니까 오버로딩 가능함.
	}

}
