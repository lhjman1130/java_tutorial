package p0410;

class MyArr{
	int[] arr;
	///////////
	void setArr(int[] a) {
		arr = a;
	}

	//////////
	boolean checkArr() {
		if (arr == null) {
			System.out.println("�迭�� ���� �����Ͻÿ�.");
			return false;
		}
		return true;
	}

	///////////
	void printArr() {
		int i;
		///
		if (!checkArr()) {
			return;
		}
		///
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();

	}

	////////////
	void insertSort(){
//		int j, i, tmp;
//		if(!checkArr()){
//			return;
//		}
//		for(i=1; i<arr.length; i++){
//			tmp = arr[i];
//			j = i -1;
//			while ( j >= 0 && ){
//				
//			}
//		}	
		
		
		
		int i, j, tmp;

		for (i = 1; i < arr.length; i++) {
			tmp = arr[i];
			j = i - 1;
			///////////// ���� ��, j�� ������ ������ �ȵǴϱ�.
			while (j >= 0 && arr[j] > tmp) {
				arr[j + 1] = arr[j];
				j--;

			}
			j++;
			arr[j] = tmp;
		}
	}

	//////////////////////
	void selectSort() {
		System.out.println("������ ���� ���� ����");
		int i, j, min, tmp;

		for (i = 0; i < arr.length - 1; i++) {
			min = i;

			for (j = i + 1; j < arr.length; j++) {
				if (arr[j] <= arr[min]) {
					min = j;
				}
				/// ����
			}
			if (min != i) {
				tmp = arr[min];
				arr[min] = arr[i];
				arr[i] = tmp;
			}
		}
	}
	/////////////���� Ž��
	void seqSearch(int num){
		if(!checkArr()){
			return;
		}
		int i;
		for(i=0 ; i<arr.length ; i++){
			if(num == arr[i]){
				System.out.println(i + "��° �濡 ����");
				break;
			}
			
		}
		if(i == arr.length){
			System.out.println("����.");
		}
	}
	/////////////���� Ž��void seqSearch(int num){	
	void binarySearch(int num){
		
		if (!checkArr()) {
			return;
		}
		selectSort();
		int f = 0, l=arr.length-1, m;
		while(f<=){
			m=(f+1) /2 ;
			if(arr[m] > num){
				l = m-i;
			}else if(arr[m]< num){
				f = m+1;
			}else{
				System.out.println(m+ "���� �濡 ����")
				break;
			}
			
		}
		if()
}

}



public class Java0410_4seach_clas_teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArr ma = new MyArr();
		int[] a = {8, 43,1, 5, 5, 1, 9};
		ma.setArr(a);
		ma.seqSearch(1);
		ma.seqSearch(3);
		ma.binarySearch(6);
		ma.binarySearch(6);
		ma.printArr();
		
	}

}
