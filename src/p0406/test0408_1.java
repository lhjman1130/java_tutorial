package p0406;

import java.util.Scanner;

public class test0408_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	
	int num;
	String str = "";
	
	while(true){        		//���ѷ���
		System.out.println("��¼��� �Է�");
		num = sc.nextInt();
		System.out.println("�Է°�" + num);
		System.out.println("���߷��� stop �Է�" );
		str = sc.next();
		if(str.startsWith("stop")){
			break;    //������ ��������.
		}
		
	}
	}

}
