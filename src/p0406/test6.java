package p0406;
//����ġ��. ������ �پ��� �� ���.
import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		String ch;
		
		System.out.print("id : ");
		ch = sc.next();
		
		// String ch="1";
		switch (ch) {
		case "1":
         			
			System.out.println("x�� 1");
			break;   //���� ����� ��������.
		case "2":
			System.out.println("x��2");
			break;
		case "3":
			System.out.println("x�� 3");
			break;
		default:    //��ġ�ϴ� case�� ������ �� ����
			System.out.println("x�� �̿��� ��");
			//����Ʈ�� ��� �ǰ�, �־ ��.
			
		}
	}

}
