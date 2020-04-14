package homework1;

import java.util.Scanner;

import homework1.order.OrderMenu;
import homework1.order.OrderService;
import homework1.warehouse.whMenu;
import homework1.warehouse.whService;

public class Menu {
	private whMenu menu1;
	private OrderMenu menu2;
	private whService wh_service;
	private OrderService o_service;

	public Menu() {
		wh_service = new whService();
		o_service = new OrderService();

		menu1 = new whMenu(wh_service);
		// menu2 = new OrderMenu(o_service, wh_service);
	}

	public void run(Scanner sc) {
		boolean flag = true;
		int menu = 0;
		String str = "1.���� 2.������ 3.����";
		while (flag) {
			System.out.println(str);
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				menu1.run(sc);
				break;
			case 2:
				//menu2.run(sc);
				break;
			case 3:
				flag = false;
			}
		}
	}
}
