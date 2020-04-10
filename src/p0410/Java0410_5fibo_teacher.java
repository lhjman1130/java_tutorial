package p0410;

public class Java0410_5fibo_teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] a = new long[80];
		int i;
		for (i = 0; i < a.length ; i++) {
			if (i <= 1) {
				a[i] = 1;
			} else {
				a[i] = a[i - 1] + a[i - 2];
			}
			for (i = 0; i < a.length; i++) {
				System.out.print(a[i] + "\t");
				if (i % 5 == 4) {
					System.out.println();
				}
			}

		}
//		long num1 = 1, num2 = 1, num3;
//		int i;
//		for(i=0 ; i < 80 ; i++){
//			if(i<=1){
//				System.out.print("1/t");
//			}else{
//			num3 = num1 + num2;
//			System.out.print(num3 + "\t");
//			}
//		}
		
		
		
	}

}
