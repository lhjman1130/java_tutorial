package p0409;

import java.util.Scanner;
////////////////�Ǻ���ġ ���� 1.�迭 �̿��ؼ�.
public class Java_hw_fibo_1 {
	public static void main(String[] args) {
		
		int[] arr = new int[80];
		
		arr[0]=1;
		arr[1]=1;
		

		Scanner sc = new Scanner(System.in);
		int i=0, num;

		System.out.print("�� ���� �Է� : ");
		num = sc.nextInt();

		for(i = 0; i<=num-1; i++){
			System.out.print(arr[i]);
			arr[i+2] = arr[i]+arr[i+1];
			
			if(i==num-1){
				System.out.print("��");
			}else{
			System.out.print(",");
			}
			//System.out.print("arr["+ i + "]= " + arr[i]);
			//System.out.println();
		}
		
		
		
	}
}
