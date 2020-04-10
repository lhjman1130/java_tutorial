package p0409;

import java.util.Scanner;

public class Java0409_1_arr {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

		int[][] arr2 = new int[2][3];
		int i, j, num;
		for(i=0; i<2; i++){
			for(j=0; j<3; j++){
				
				System.out.print("ÀÔ·Â " + i +"ÁÙ" + j + "Ä­");
				num = sc.nextInt();
			     arr2[i][j]=num;
			     
			}
		}
	
			
		for(i=0; i<2; i++){
			for(j=0; j<3; j++){
				
				System.out.print(arr2[i][j] + "\t");
			
			}
			System.out.println();
		}
		
		System.out.println(arr2.length);
		System.out.println(arr2[0].length);
		System.out.println(arr2[1].length);
		System.out.println(arr2[2].length);
		
	}

}
