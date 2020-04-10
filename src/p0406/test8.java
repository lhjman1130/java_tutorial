package p0406;

//이중for문

public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, k, result;
		for (j = 0; j < 2; j++) {
			for (i = 0; i < 3; i++) {
				System.out.print("#");

			}
			System.out.println();
		}

	/*	System.out.println("1. 구구단 2-9단 세로로 출력");
		
		
		i=1;
		j=1;
		
		for (j = 2; j <= 9; j++) {

			for (i = 1; i <= j; i++) {
				result = i * j ;
				System.out.println(j + "*" + i + "=" + result);
			}
		}
		
	 */   //1번 문제.끝
		
		
		
		System.out.println("2. 구구단 2-9단 가로로 출력");
		i=1;
		
		

		System.out.println("3. 1-100사이에 소수 출력");
		i = 1;
		j = 100;
		k = 1;
		result = 0;
		for (j = 1; i <= j; i++) {
			for (k = 1; k <= j; k++) {

				if (i % j == 0) {
					result = 0;
					// 소수가 아니다.
				} else {
					result = 1;
					// 소수이다.
				}

			}
			System.out.println("소수");

		}
		if (result == 0){
			System.out.println("소수");
		}else {
			System.out.println("소수아님");
		}
	}
}
