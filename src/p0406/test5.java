package p0406;
import java.util.Scanner;

//==���� �񱳰����Ѱ�. int, float, char x = 'z', 
// so ==�� �� ���� ���������ϴ� ��. ����,, ���� ����....but ���ڿ��� �ȵ�.��ü���ϵ�
public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc = new Scanner(system.in);
		String id="1234", id2="1234";
		//�׷��� ���ڿ� �񱳴� equals �޼ҵ�� �����ϴ�.  ��� 
		if(id.equals(id2)){ 
			System.out.println("id��ġ");
			
		}else{
			System.out.println('id����ġ');   
		
		}*/
		String id2 = "myid", pwd2 = "1234";
		String id="", pwd ="";
	

		Scanner sc = new Scanner(System.in);
		System.out.println("id : ");
		id = sc.next();
		if (id.equals(id2)) {
			System.out.println("password : ");
			pwd = sc.next();

			if (pwd.equals(pwd2)) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("���̵�� ��ġ������, ��й�ȣ ����");
			}

		} else {
			System.out.println("���̵� ����");
			return;
		}
		
		
	}

}
