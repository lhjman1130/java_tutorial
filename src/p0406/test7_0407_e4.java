package p0406;
//�Է¹޾Ƽ� ��� ���
import java.util.Scanner;
public class test7_0407_e4 {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ ����� ���ϰھ��? ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt(), j, result ;
		

		if (i >= 1) {
			for (j = 1; j <= i; j++) {
				result = i % j;
				if (result == 0) {
					System.out.println(j);
				}
			}
		}else{
			System.out.println("����� �����. ");
		}
		
		sc.close();

	}

}
