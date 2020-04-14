package p0414;

import java.util.Calendar;
import java.util.Date;

class Test10 {
	private String str;
	private static Test10 t = new Test10();// 클래스 내부에 static으로 객체 하나를 만들어서 제공.

	// 싱글톤: 생성자가 private. 객체를 밖에서 못 만들고 내부에서만 생성가능.
	private Test10() {
		str = "싱글톤 패턴";
	}

	// getInstance(): 내부에서 만든 싱글톤 객체를 외부에 리턴
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
		System.out.println((d.getMonth() + 1) + "월 " + d.getDate() + "일 " + d.getHours() + "시 " + d.getMinutes() + "분 "
				+ d.getSeconds() + "초");

	}

}
