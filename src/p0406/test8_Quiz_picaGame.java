package p0406;
// hp �� 0�� �Ǹ� ���
//exp�� ����ġ
// level�� 
//text ����� ����. �ӵ� ���� ���� ���簡 �־���. 
import java.util.Scanner;

public class test8_Quiz_picaGame {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		int hp = 30; // �����ġ
		int exp = 0; // ����ġ
		int level = 1; //exp�� 20���� ���� 1 ����
		
		/*
		 * ��Ա� : hp 5���� ���ڱ� : hp 10���� ��� : hp 8����, exp 10 ���� ( üũ : ���, ���� üũ)
		 * ��ϱ� : hp 15����, exp 15����.
		 * 
		 * �޴� 1.��Ա� 2.���ڱ� 3.��� 4.��ϱ� 5.����Ȯ�� (hp, exp, level ���) 6.����
		 */

		while (hp > 0) {
			System.out.println("�޴�");
			System.out.println("1.��Ա� 2.���ڱ� 3.��� 4.��ϱ� 5.����Ȯ�� (hp, exp, level ���) 6.����");
			num = sc.nextInt();
			switch (num) {
			case 1:
				hp = hp + 30;
				System.out.println("���� �԰�, hp�� 30 �����߽��ϴ�.");
				break;
			case 2:
				hp = hp + 10;
				System.out.println("���� �ڰ�, hp�� 10 �����߽��ϴ�.");
				break;
			case 3:
				hp = hp - 8;
				exp = exp + 10;
				System.out.println("��Ҵ���, hp�� 8����, exp�� 15 �����߽��ϴ�.");
				if(hp<=0){
					System.out.println("���.");
					return;
				}
				if(exp>=20){
					System.out.println("������");
					level += 1;
					exp-=20;
					System.out.println("�������� �Ǿ� level�� " + level + "�� �Ǿ����ϴ�.");
				}
				break;
			case 4:
				hp = hp - 15;
				exp = exp + 10;
				if(hp<=0){
					System.out.println("���.");
					return;
				}
				if(exp>=20){
					System.out.println("������");
					level += 1;
					exp-=20;
					System.out.println("�������� �Ǿ� level�� " + level + "�� �Ǿ����ϴ�.");
				}
				break;
			case 5:
				System.out.println("hp : " + hp);
				System.out.println("exp : " + exp);
				System.out.println("level : " + level);
				break;
			case 6:
				return;

			}
						
		} // while �� ��
		System.out.println("��ī�߰� �������ϴ�.");

	}
}
