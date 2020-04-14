package p0414;

class Test5 {
	String name;
	String tel;
	String address;

	Test5() {//t1 생성할때
		this("aaa", "111");//다른 생성자 호출. 생성자 안에서만 사용가능. 1줄에 나와야 함(다른 실행문보다 앞서야 함)
		System.out.println("디폴트 생성자");
	}

	Test5(String name, String tel) {//t2 생성할때
		this(name, tel, "대한민국");
		System.out.println("파람 2개 생성자");
	}

	Test5(String name, String tel, String address) {
		this.name = name;
		this.tel = tel;
		this.address = address;
		System.out.println("파람 3개 생성자");
		System.out.println("name:" + name);
		System.out.println("tel:" + tel);
		System.out.println("address:" + address);
	}
}

public class Test5Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test5 t1 = new Test5();
		Test5 t2 = new Test5("bbb", "222");
		Test5 t3 = new Test5("ccc", "333", "서초구");
	}

}
