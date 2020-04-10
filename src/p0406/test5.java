package p0406;
import java.util.Scanner;

//==으로 비교가능한것. int, float, char x = 'z', 
// so ==은 두 값이 같은지비교하는 것. 숫자,, 문자 가능....but 문자열은 안됨.객체파일도
public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc = new Scanner(system.in);
		String id="1234", id2="1234";
		//그래서 문자열 비교는 equals 메소드로 가능하다.  모든 
		if(id.equals(id2)){ 
			System.out.println("id일치");
			
		}else{
			System.out.println('id불일치');   
		
		}*/
		String id2 = "myid", pwd2 = "1234";
		String id="", pwd ="";
	

		Scanner sc = new Scanner(System.in);
		System.out.println("id : ");
		id = sc.next();
		if (id.equals(id2)) {
			System.out.println("password : ");
			pwd = sc.next();

			if (pwd.equals(pwd2)) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("아이디는 일치하지만, 비밀번호 오류");
			}

		} else {
			System.out.println("아이디 오류");
			return;
		}
		
		
	}

}
