package p0410;

import java.util.Scanner;

class Student_class {

	String name, address;
	int num;
	

	Student_class(String na, int nu, String ad) {

		name = na;
		num = nu;
		address = ad;

	}

	int getStudnet_num() {
		return num;
	}

	String getName() {
		return name;
	}

	String getGrade() {
		return address;
	}
}
public class javaHomeW0410_stu {

	public static void main(String[] args) {
		
		String Menu;		
		
			
		Student_class [] SC_Array = new Student_class [4];		
	

		Scanner scan = new Scanner(System.in);
		
		System.out.println("======================");
		System.out.println("메뉴");
		System.out.println("");
		System.out.println("======================\n");
		System.out.println("");
	
	while(true){
		System.out.println();
		System.out.println("\t  \t메뉴를 선택하세요.");
		System.out.println("|1.등록| |2. 검색| |3. 수정| |4.삭제| |5. 전체출력| |6.종료|");
		Menu = scan.next();			
		
		if("6".equals(Menu)){		
			System.out.println("시스템이 종료 되었습니다.");
			System.exit(0);
		}
		
		if("2".equals(Menu)){				
			System.out.println("||");
			Major = scan.next();
			
			if ("1".equals(Major)) {		//
				String name;		
				int student_num, grade;	
				
					for(int i=1; i<4; i++){		
				System.out.println(i+"번째 학생의 "+"이름을 입력하세요");
				System.out.print(">>");
				name = scan.next();		
				
				System.out.println(i+"번째 학생의 "+"학번을 입력하세요");
				System.out.print(">>");
				student_num = scan.nextInt();
				
				System.out.println(i+"번째 학생의 "+"학년을 입력하세요");
				System.out.print(">>");
				grade = scan.nextInt();
				SC_Array[i] = new Student_class(name, student_num, grade); //배열에 차례대로 이름, 학번, 학년을 저장함.
				
					}
			
				continue; //이어서 계속
				}
			
												////////////////컴퓨터 소프트웨어학//////////////
			else if ("2".equals(Major)){				//위의 간호학과 동일 하므로 이하 설명 생략.
				
				String name;
				int student_num, grade;
				
			for(int k=1; k<4; k++){
					System.out.println(k+"번째 학생의 "+"이름을 입력하세요");
					System.out.print(">>");
					name = scan.next();
					
					System.out.println(k+"번째 학생의 "+"학번을 입력하세요");
					System.out.print(">>");
					student_num = scan.nextInt();
					
					System.out.println(k+"번째 학생의 "+"학년을 입력하세요");
					System.out.print(">>");
					grade = scan.nextInt();
					SC_Array_2[k] = new Student_class_2(name, student_num, grade);
				}
			}
				
				else{
				System.out.println("잘못입력하셨습니다. 다시 입력하십시오.");
				continue;
			}
		}
	
	
	
	
	
/*	
	
	
}
}
}
*/
		
		
	}
}