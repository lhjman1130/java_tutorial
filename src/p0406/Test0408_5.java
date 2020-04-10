package p0406;

//배열을 이용해서 총합과 평균 구하기.
import java.util.Scanner;

public class Test0408_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		int i, sum = 0, result = 0, max = 0, min = 0;

		for (i = 0; i < arr.length; i++) {
			
			do {
				System.out.println("입력 :");
				arr[i] = sc.nextInt();
				System.out.println(i + "번방에 " + arr[i] +"가 입력 ");
			} while (arr[i] < 0);

			// if(arr[i]<0){
			// System.out.println("잘못 입력햇습니다.");
			// return;
			//
			// }

		}

		max = arr[0];
		min = arr[0];

		for (i = 0; i < arr.length; i++) {
			if (max <= arr[i]) {

				max = arr[i];
			}
			if (min >= arr[i]) {
				min = arr[i];
			}
		}

		for (i = 0; i < arr.length; i++) {
			sum += arr[i]; // 선생님 코드

		}
		// result = sum / i;
		float avg = (float) sum / arr.length;

		System.out.println("총합은 " + sum);
		// System.out.println("평균은 " + result );
		System.out.println("평균은 " + avg);
		System.out.println("최댓값은 " + max);
		System.out.println("최솟값은 " + min);
		// 찾고싶은 숫자 찾기.
		//
		int search;
		System.out.println("search :");
		search = sc.nextInt();
		int cnt = 0;
		for (i = 0; i < arr.length; i++) {
			// System.out.println(search);
			// System.out.println(arr[i]);

			if (search == arr[i]) {
				cnt += 1;
				System.out.println(i + "번째 방에 있습니다.");
				// break;
			}
			// if(i == arr.length){
			// System.out.println("없습니다.");
			// }
			//
		}
		if (cnt == 0) { // 내가 만든
			System.out.println("없습니다."); // 문장
		}

		//
		// for(i=0 ; i < arr.length ; i++){
		// System.out.println(arr[i] + "\t");
		//
		// }
	}
	// 배열요소의 총합과 평균을 출력
}
