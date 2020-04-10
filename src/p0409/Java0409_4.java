package p0409;
////////////////////////////

public class Java0409_4 {
	public static void main(String[] args) {

		int[][] arr = { { 1, 2 }, { 3, 4, 5, 6 }, { 7, 8, 9 } };

		// c는 이게 안됨. 왜냐면 c는 전체를 저장하니까.

		int i, j ;

		for (i = 0; i < arr.length; i++) {
			
			for (j = 0 ; j < arr[i].length ; j++) {

				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
