package p0413.pacachu;

import java.util.Scanner;

public class Menu_pica {
	Pica p = new Pica();
	
	void run(Scanner sc){
		
		Scanner sc = new Scanner(System.in);
		
		
		int menu;
		boolean flag = true;
		String str = "1. Eat  2.Sleep 3. Play  4.Workout  5. CheckStatus  6.Exit";
		while(flag){
			System.out.println(str);
			menu = sc.println(str);
			
			switch(menu);
			case 1:
				p.��Ա�();
				break;
			case 2:
				p.���ڱ�();
				break;
			case 3:
				p.���();
				break;
			case 1:
				p.��ϱ�();
				break;
			case 1:
				p.levelCheck();
				break;
			case 1:
				p.��Ա�();
				break;
				
		}
	}
}
