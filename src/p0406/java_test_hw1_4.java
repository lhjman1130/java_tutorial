package p0406;
/////////占쏙옙占쏙옙占쏙옙 占쌓몌옙占쏙옙. 占쏙옙占쏙옙.
import java.util.Scanner;

public class java_test_hw1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int i, j, num;

		System.out.print("�엯�젰  : ");
		num = sc.nextInt();
		
		while(num%2==0) {
			System.out.print("���닔瑜� �엯�젰�빐二쇱꽭�슂.");
			System.out.print("�엯�젰  : ");
			num = sc.nextInt();	
		}
		for(i = 1; i<=num; i++) {
			if(i <=(num/2)) {
				//留덈쫫紐� 以묒븰 �쐞源뚯� 肄붾뵫
				//System.out.print(num/2);
				for(j=1 ; j<=(num/2)-i+1 ; j++) { //num媛� 5�씪怨� �븯硫� j�뒗 2源뚯� �몢踰� 諛� 
					System.out.print(" ");
					
				}
				for(j=1; j<=((2*i)-1) ; j++){
					System.out.print("*");
				}
				System.out.println();
				
				
			}else if(i == num/2 +1){
				for(j=1; j<= num ; j++){
					System.out.print("*");
				}
				System.out.println();

				//留덈쫫紐� �븘�옒 肄�
			} else {
				
				// num�씠 5�씪怨� �븯硫� i 媛� 3�씪�븣遺��꽣

				for (j = 1; j <= i-(num/2+1); j++) {//i=4, num=5
					
					System.out.print(" ");
				
				}
				for(j=1; j<=((2*num+1)-2*i) ; j++) {
				//	System.out.print("�옉");
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		
		
		
	/*	
		
		for (i = 1; i <= (num/2); i++) {
			// for (j = 1; j < num - i; j++) {
			for (j = 1; j < (num + 1) - i; j++) {
				System.out.print(" ");
			}
			j = 1;
			for (j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();


		}
		for (i = 1; i <= num ; i++) {
			System.out.print("*");
		}
		

		for (i = 1; i <= (num / 2) ; i++) {
			for (j = 1; j < ((2 * i) - 1 ) ; j++) {
				System.out.print(" ");
			}
			j = 1;
			for (j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		
		
		
		
		
	*/	
		
		
		
		
		
		
		
	}

}
