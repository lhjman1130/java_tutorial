package p0410;

class Score {// 점수 정보 클래스
	int[] score;
	float avg;

	void setInfo(int kor, int eng, int math) {
		score = new int[4];// 국,영,수,총
		score[0] = kor;
		score[1] = eng;
		score[2] = math;
	}

	void mk() {
		for (int i = 0; i < 3; i++) {
			score[3] += score[i];
		}
		avg = (float) score[3] / 3;
	}

	void printScore() {
		System.out.println("점수 정보\nkor\teng\tmath\ttotal\tavg");
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + "\t");
		}
		System.out.println(avg);
	}
}

class Student2 {// 학생 정보 클래스
	int num;// 학번
	String name;// 이름
	String tel;// 전화번호
	Score s;// 점수

	void setInfo(int n, String nn, String t, int kor, int eng, int math) {
		num = n;
		name = nn;
		tel = t;
		s = new Score();
		s.setInfo(kor, eng, math);
		s.mk();
	}

	void printInfo() {
		System.out.println("학생 정보\nnum\tname\ttel");
		System.out.println(num + "\t" + name + "\t" + tel);
		s.printScore();
	}
}

public class Student2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s1 = new Student2();
		s1.setInfo(1, "aaa", "1111", 34, 45, 78);
		s1.printInfo();
		System.out.println("-------------------------");
		Student2 s2 = new Student2();
		s2.setInfo(2, "bbb", "2222", 67, 87, 89);
		s2.printInfo();
		System.out.println("-------------------------");
		Student2 s3 = new Student2();
		s3.setInfo(3, "ccc", "3333", 98, 87, 78);
		s3.printInfo();
	}

}
