package p0414ver1;

import p0413.pacachu.Test8;

public class Test8Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test8 t = new Test8();
		System.out.println("�����ڿ��� �Ҵ��� ��");
		t.printMem();
		//  t.test1(); �����̺��̾ ���� Ŭ���������� ����.
		System.out.println("main ���� �Ҵ��� ��");		
		//t.test2();
		
		t.b = 20;
		t.c = 30;
		t.test3();
		t.printMem();
	}

}
