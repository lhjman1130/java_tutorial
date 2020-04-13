package picachu;

import java.util.Scanner;

public class Menu {
	Picachu p = new Picachu();
	
	void run(Scanner sc){
		int menu;
		boolean flag = true;
		String str = "1.밥먹기 2.잠자기 3.놀기 4.운동하기 5.정보확인 6.종료";
		p.setInfo();
		while(flag){
			System.out.println(str);
			menu = sc.nextInt();
			switch(menu){
			case 1:
				p.밥먹기();
				break;
			case 2:
				p.잠자기();
				break;
			case 3:
				flag = p.놀기();
				break;
			case 4:
				flag = p.운동하기();
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
