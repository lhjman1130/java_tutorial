package p0406;

public class Test0408_9_binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        // 0  1  2  3  4 
		int[] a = {2, 7, 49, 70, 71};
		
		int mid, i; 
		int sch=70;
		int f=0, l=a.length-1 ;   //f가 첫요소의 인덱스(탐색범위의 첫요소)

		for (i = 0; i < a.length; i++) {

			System.out.println(i + "번째 탐색");
			System.out.println("현재 f는"+ f);
			System.out.println("현재 l은" + l);
			
			
			mid = (f + l) / 2; // 중간값 찾기.
			System.out.println("현재 mid는 " + mid);
			if (a[mid] == sch) {
				System.out.println("got it!");
				System.out.println( i + "번 찾아서 " + mid + "번째 있음을 찾음");
				return;
				
			}else if (a[mid] < sch) {
				f = mid;

				
			} else {
				l = mid ;
				

			}
			
			
			
		}
		System.out.println("없음");
	}

}
