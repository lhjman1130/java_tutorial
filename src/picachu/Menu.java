package picachu;

import java.util.Scanner;

public class Menu {
	Picachu p = new Picachu();
	
	void run(Scanner sc){
		int menu;
		boolean flag = true;
		String str = "1.��Ա� 2.���ڱ� 3.��� 4.��ϱ� 5.����Ȯ�� 6.����";
		p.setInfo();
		while(flag){
			System.out.println(str);
			menu = sc.nextInt();
			switch(menu){
			case 1:
				p.��Ա�();
				break;
			case 2:
				p.���ڱ�();
				break;
			case 3:
				flag = p.���();
				break;
			case 4:
				flag = p.��ϱ�();
				break;
			case 5:
				p.printInfo();
				break;
			case 6:
				flag = false;
			}
		}
	}
}
