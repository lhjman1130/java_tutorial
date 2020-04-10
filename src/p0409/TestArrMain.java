package p0409;

class TestArr { // 이녀석은 크기가 고정이다. 

	int[] arr = new int[5]; // 이렇게 생성하거나, 함수 안에서 생성해도 됨. //멤버변수 arr
							// 클래스는 여러개 만들 수 있다. 메인은 한개!

	void setArr() { // set 은 메서드 값 할당
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;

		}
	}

	void PrintArr() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}

	}
}

class TestArr2 { //기능 위주의 클래스, 배열 요소를 처리하는 기능을 제공.

	int[] arr; // 멤버변수만 stack 사용

	void setArr(int[] a) { // 메서드는 사용 안함.
		arr = a;

	} //언제든지 배열을 따른 걸로 바꿔 줄 수 있다. 

	void PrintArr() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
       
	// arr 요소의 합 반환, 
	int sumArr(){                     //메서드이고, 합이니까 int 로 생성
		int sum = 0; //변수 썸 선언.
		for(int i = 0; i<arr.length; i++){
			sum +=arr[i];
			
		}
		return sum;
	}

	// arr 요소의 max min 반환
	int[] maxMinArr(){           //인트 배열로 반환해야 되니까 선언도 .. 
	//	int[] res = new int[2];
		int[] res = {arr[0], arr[0]}; //0:최대값, 1:최소값. 0번재 방으로 모두 초기화해서 넣어줌.
		for(int i=1; i<arr.length ; i++){
			if(res[0]<arr[i]){
				res[0] = arr[i];     //최대값을 구해서 res[0]에 할당.
			}
		}
		for(int i=1; i<arr.length ; i++){
			if(res[1]>arr[i]){
				res[1] = arr[i];     //최소값을 구해서 res[1]에 할당.
			}
			
		}
		return res;
	}
	
	
	
	// arr 요소 정렬. 정렬 방법은 맘대로.
//반환할 필요 없으니 void 로 생성
	void sortArr(){
		int i, j, tmp;
		for(i=0; i<arr.length-1; i++){
			for(j=0; j<arr.length-1; j++){
				if(arr[j] > arr[j+1]){
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}

}


	

///////////////////////////////////////////////////////////////////
public class TestArrMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestArr ta = new TestArr();
		ta.setArr();
		ta.PrintArr();

		int[] x = { 3, 8, 5, 7, 2, 4, 1, 6 };
		TestArr2 ta2 = new TestArr2();
		ta2.setArr(x);
		ta2.PrintArr();
		
		int sum = ta2.sumArr();
		
		
		System.out.println("sum : " + sum);
		int[] m = ta2.maxMinArr();
		System.out.println("max : " + m[0] + ",  "+ "min : " + m[1] );
		ta2.sortArr();
		ta2.PrintArr();
		System.out.println("================= " );
		
		int[] y = { 2, 9, 5, 7, 2, 4, 1, 6 };
		ta2.setArr(y);
		ta2.PrintArr();
		sum = ta2.sumArr();
		System.out.println("sum : " + sum);
		m = ta2.maxMinArr();
		System.out.println("max : " + m[0] + ",  "+ "min : " + m[1] );
		ta2.sortArr();
		ta2.PrintArr();
		// test arr 객체는 하나만 만들었다. 근데 데이터가 달라지면 값도 달라진다. 
		//그래서 얘는 캡슐화보다는 기능 위주의 클래스. 배열 요소를 처리하는 기능을 제공
	}

}
