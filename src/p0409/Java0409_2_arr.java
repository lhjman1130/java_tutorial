package p0409;

import java.util.Scanner;
//이차원 배열의 초기화
public class Java0409_2_arr {


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

		int[][] arr = { {1, 2, 3}, {4, 5, 6}};
		String[][] arr2= new String[][]{{"asf", "sgdg"}, {"sdfsdf", "sdf"}};
		int i, j ;
			
		for(i=0; i<arr.length; i++){
			for(j=0; j<arr[i].length; j++){
				
				System.out.print(arr[i][j] + "\t");
			
			}
			System.out.println();
		}
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		
		
		
		
		
		for(i=0; i<arr2.length; i++){
			for(j=0; j<arr2[0].length; j++){
				
				System.out.print(arr2[i][j] + "\t");
			
			}
			System.out.println();
		}
		
		
		
	}
}
