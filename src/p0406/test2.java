package p0406;

public class test2 {

	public static void main(String[] args) {
		//ToDO auto-generated method stub
		//자동형변환, 강제 형변환
		System.out.println(5/2);
		System.out.println(5.0/(double)2); //타입이 다르면 연산을 할 수 가 없다. 
		//그럴 때, 자동 형변환이 일어남. 작은 타입에서 큰타입으로 간다. 크기가 같아서 정수보다 실수가 더 크다  
		//지금의 경우는 2가 5.0인 실수를 따라 바뀐다.
		
		//(double) d = 5/2 ; //소수점 계산 안된다. 왜냐면 나누기가 먼저라서...
		double d =(double)5/2; //이렇게 괄호써서 해주는게 형변환.지금이 강제 형변환
		System.out.println(d);
		
		
		//숫자 리터럴(실제상수값) 
		
		float f = 3.14f;  //여기서는 f는 실수 상수의 타입을 float으로 지정하는 키워드.
		                  //원래는 double이지만 float으로 쓰겠다. 
		long ㅣ = 2000l; //정수 상수의 타입을 long으로 지정.
		
		int a = 10;  // 10진수
		int b = 0x3af2; //16진수
		int c = 0b100101; //2진수
		int e = 0123;//8진수
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(e);
		//문자리터럴
		char x = 'a'; //a라는 문자의 유니코드 97이 저장되는 것. stack에 저장
		String z = "abc"; //근데 문자열은 상수에 저장됨.
		
		System.out.println("aaa\tbbb");
		System.out.println("aaa\nbbb");
		System.out.println("aa\"ab\"bb");  //\"는 역슬러시 큰따옴표 하면 
		
		
	}
}
