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
		System.out.println("�޴�");
		System.out.println("");
		System.out.println("======================\n");
		System.out.println("");
	
	while(true){
		System.out.println();
		System.out.println("\t  \t�޴��� �����ϼ���.");
		System.out.println("|1.���| |2. �˻�| |3. ����| |4.����| |5. ��ü���| |6.����|");
		Menu = scan.next();			
		
		if("6".equals(Menu)){		
			System.out.println("�ý����� ���� �Ǿ����ϴ�.");
			System.exit(0);
		}
		
		if("2".equals(Menu)){				
			System.out.println("||");
			Major = scan.next();
			
			if ("1".equals(Major)) {		//
				String name;		
				int student_num, grade;	
				
					for(int i=1; i<4; i++){		
				System.out.println(i+"��° �л��� "+"�̸��� �Է��ϼ���");
				System.out.print(">>");
				name = scan.next();		
				
				System.out.println(i+"��° �л��� "+"�й��� �Է��ϼ���");
				System.out.print(">>");
				student_num = scan.nextInt();
				
				System.out.println(i+"��° �л��� "+"�г��� �Է��ϼ���");
				System.out.print(">>");
				grade = scan.nextInt();
				SC_Array[i] = new Student_class(name, student_num, grade); //�迭�� ���ʴ�� �̸�, �й�, �г��� ������.
				
					}
			
				continue; //�̾ ���
				}
			
												////////////////��ǻ�� ����Ʈ������//////////////
			else if ("2".equals(Major)){				//���� ��ȣ�а� ���� �ϹǷ� ���� ���� ����.
				
				String name;
				int student_num, grade;
				
			for(int k=1; k<4; k++){
					System.out.println(k+"��° �л��� "+"�̸��� �Է��ϼ���");
					System.out.print(">>");
					name = scan.next();
					
					System.out.println(k+"��° �л��� "+"�й��� �Է��ϼ���");
					System.out.print(">>");
					student_num = scan.nextInt();
					
					System.out.println(k+"��° �л��� "+"�г��� �Է��ϼ���");
					System.out.print(">>");
					grade = scan.nextInt();
					SC_Array_2[k] = new Student_class_2(name, student_num, grade);
				}
			}
				
				else{
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��Ͻʽÿ�.");
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