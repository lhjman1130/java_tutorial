package p0406;

////////참 조 값 복 사 /////////

public class Test0408_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3 }; //new 없어도 생성됨. 초기화해서
		int[] b;  // 생성이 안된다. 초기화 없음. 참조변수 b만 만들어진 상태
		int i;
		
		//////////////////얕은 복사 버전
		//참조변수 크기는 4byte, 형태 상관 없이 4바이트.
		//스택은 값이 없으면 쓰레기 값.
		//서로 데이터를 공유하기 때문에 다른쪽에 영향 줄 수 있다. 
	//	b = a; //얕은 복사, 단점은 다른 녀석을 고쳐도 영향을 받는다. 
		
				
		/////////////////////////////얕은 복사 버전
		System.out.println("깊은복사 버전");
		
		b = new int[a.length]; //a와 동일한 크기로 배열 생성ㅇ
		for(i = 0 ; i < a.length ; i++){
			b[i] = a[i]; //배열 각 방에 a와 동일한 인덱스 요소를 할당
		}
		
		
		
		
		System.out.print("배열 a요소" + "\t");
		
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");

		}
		System.out.println();
		System.out.print("배열b요소" + "\t");
		for (i = 0; i < b.length; i++) {
			System.out.print(b[i] + "\t");

		}
		System.out.println();
		
		
		b[1] = 200;
		System.out.print("배열 a요소" + "\t");
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");

		}
		System.out.println();
		System.out.print("배열 b요소" + "\t");
		for (i = 0; i < b.length; i++) {
			System.out.print(b[i] + "\t");

		}
		
	}

}
