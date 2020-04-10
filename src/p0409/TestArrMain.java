package p0409;

class TestArr { // �̳༮�� ũ�Ⱑ �����̴�. 

	int[] arr = new int[5]; // �̷��� �����ϰų�, �Լ� �ȿ��� �����ص� ��. //������� arr
							// Ŭ������ ������ ���� �� �ִ�. ������ �Ѱ�!

	void setArr() { // set �� �޼��� �� �Ҵ�
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

class TestArr2 { //��� ������ Ŭ����, �迭 ��Ҹ� ó���ϴ� ����� ����.

	int[] arr; // ��������� stack ���

	void setArr(int[] a) { // �޼���� ��� ����.
		arr = a;

	} //�������� �迭�� ���� �ɷ� �ٲ� �� �� �ִ�. 

	void PrintArr() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
       
	// arr ����� �� ��ȯ, 
	int sumArr(){                     //�޼����̰�, ���̴ϱ� int �� ����
		int sum = 0; //���� �� ����.
		for(int i = 0; i<arr.length; i++){
			sum +=arr[i];
			
		}
		return sum;
	}

	// arr ����� max min ��ȯ
	int[] maxMinArr(){           //��Ʈ �迭�� ��ȯ�ؾ� �Ǵϱ� ���� .. 
	//	int[] res = new int[2];
		int[] res = {arr[0], arr[0]}; //0:�ִ밪, 1:�ּҰ�. 0���� ������ ��� �ʱ�ȭ�ؼ� �־���.
		for(int i=1; i<arr.length ; i++){
			if(res[0]<arr[i]){
				res[0] = arr[i];     //�ִ밪�� ���ؼ� res[0]�� �Ҵ�.
			}
		}
		for(int i=1; i<arr.length ; i++){
			if(res[1]>arr[i]){
				res[1] = arr[i];     //�ּҰ��� ���ؼ� res[1]�� �Ҵ�.
			}
			
		}
		return res;
	}
	
	
	
	// arr ��� ����. ���� ����� �����.
//��ȯ�� �ʿ� ������ void �� ����
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
		// test arr ��ü�� �ϳ��� �������. �ٵ� �����Ͱ� �޶����� ���� �޶�����. 
		//�׷��� ��� ĸ��ȭ���ٴ� ��� ������ Ŭ����. �迭 ��Ҹ� ó���ϴ� ����� ����
	}

}
