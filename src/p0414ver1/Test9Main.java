package p0414ver1;
class Test9{
	private int age;
	private String name;
	
	public Test9(){	
	}
	
	public Test9(int age, String name){	
		this.age = age;
		this.name = name;
	}
	
	public void setAge(int age){//setter: set  + 멤버이름
		this.age = age;					//외부에서private 멤버변수의 값 할당.
	}
	
	public int getAge(){
		return age;
		
	}

	
	public void setName(String name){
		this.name = name;
	}//setter
	
	public String getName(){
		return name;
	}
	
	
}


public class Test9Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test9 t1 = new Test9();
		
		t1.setAge(12) ;   //t1.age = 12
		t1.setName("aaa");  //t1.name = "
		
		System.out.println(t1.getAge());
		System.out.println(t1.getName());
		
		Test9 t2 = new Test9(23, "bbb");
		System.out.println(t2.getAge());
		System.out.println(t2.getName());
		
		System.out.println(t2);
		
		

	}

}
