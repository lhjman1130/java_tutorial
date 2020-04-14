package p0414;

import java.util.Calendar;
import java.util.Date;

class Test10 {
	private String str;
	private static Test10 t = new Test10();// Ŭ���� ���ο� static���� ��ü �ϳ��� ���� ����.

	// �̱���: �����ڰ� private. ��ü�� �ۿ��� �� ����� ���ο����� ��������.
	private Test10() {
		str = "�̱��� ����";
	}

	// getInstance(): ���ο��� ���� �̱��� ��ü�� �ܺο� ����
	public static Test10 getInstance() {
		return t;
	}

	public String getStr() {
		return str;
	}
}

public class Test10Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test10 t = Test10.getInstance();
		System.out.println(t.getStr());

		Calendar c = Calendar.getInstance();
		Date d = c.getTime();
		System.out.println((d.getMonth() + 1) + "�� " + d.getDate() + "�� " + d.getHours() + "�� " + d.getMinutes() + "�� "
				+ d.getSeconds() + "��");

	}

}
