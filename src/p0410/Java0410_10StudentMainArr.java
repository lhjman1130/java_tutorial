package p0410;


class Student {
	String name;
	int[] score; // new�� ���ٴ� �� �迭 ���� ���ߴ�.
	float avg;

	void setInfo(String n, int[] s) {// �� �л��� ������ �Ķ���ͷ� �޾� ��������� �Ҵ�
		// �迭�� �������� ������ �´�.
		name = n;
		score = s;
		// for(int i=0 ; i<score.length ; i++){
		for (int i = 0; i < 4; i++) {

			score[4] += score[i];
		}
		avg = (float) score[4] / 3;

	}

	void printInfo() {// �� �л��� ���� ���
		System.out.println("name:" + name);
		System.out.println("num:" + num);
		System.out.println("kor:" + kor);
		System.out.println("eng:" + eng);
		System.out.println("math:" + math);
		System.out.println("total:" + total);
		System.out.println("avg:" + avg);
		System.out.println("=================");
	}
}

public class StudentMain_teacher {

	static void input(Student s, Scanner sc) {// Ű���� �Է��Լ�
		System.out.print("name:");
		String name = sc.next();
		System.out.print("num:");
		int num = sc.nextInt();
		System.out.print("kor:");
		int kor = sc.nextInt();
		System.out.print("eng:");
		int eng = sc.nextInt();
		System.out.print("math:");
		int math = sc.nextInt();
		s.setInfo(name, num, kor, eng, math);
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		input(s1, sc);
		Student s2 = new Student();
		input(s2, sc);
		Student s3 = new Student();
		input(s3, sc);
		s1.printInfo();
		s2.printInfo();
		s3.printInfo();
	}

