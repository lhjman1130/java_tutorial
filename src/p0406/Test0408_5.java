package p0406;

//�迭�� �̿��ؼ� ���հ� ��� ���ϱ�.
import java.util.Scanner;

public class Test0408_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		int i, sum = 0, result = 0, max = 0, min = 0;

		for (i = 0; i < arr.length; i++) {
			
			do {
				System.out.println("�Է� :");
				arr[i] = sc.nextInt();
				System.out.println(i + "���濡 " + arr[i] +"�� �Է� ");
			} while (arr[i] < 0);

			// if(arr[i]<0){
			// System.out.println("�߸� �Է��޽��ϴ�.");
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
			sum += arr[i]; // ������ �ڵ�

		}
		// result = sum / i;
		float avg = (float) sum / arr.length;

		System.out.println("������ " + sum);
		// System.out.println("����� " + result );
		System.out.println("����� " + avg);
		System.out.println("�ִ��� " + max);
		System.out.println("�ּڰ��� " + min);
		// ã����� ���� ã��.
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
				System.out.println(i + "��° �濡 �ֽ��ϴ�.");
				// break;
			}
			// if(i == arr.length){
			// System.out.println("�����ϴ�.");
			// }
			//
		}
		if (cnt == 0) { // ���� ����
			System.out.println("�����ϴ�."); // ����
		}

		//
		// for(i=0 ; i < arr.length ; i++){
		// System.out.println(arr[i] + "\t");
		//
		// }
	}
	// �迭����� ���հ� ����� ���
}
