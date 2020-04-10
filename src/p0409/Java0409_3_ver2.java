package p0409;

import java.util.Scanner;

public class Java0409_3_ver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String[] name = new String[3];
		int[][] score = new int[3][5]; // 번호, 국,영,수, 총점
		float[] avg = new float[3];

		int i, j;
		///////////////// 이름 입력
		for (i = 0; i < name.length; i++) {
			System.out.print(i + "번 학생의 성명을 입력하세요 :");
			name[i] = sc.next();
		}

		for (i = 0; i < name.length; i++) {

			for (j = 0; j < 5; j++) {
				switch (j) {

				case 0:
					System.out.print(name[i] + "학생의 번호을 입력하세요 :");
					score[i][j] = sc.nextInt();

				case 1:

					System.out.print(name[i] + "학생의 국어" + "성적을 입력하세요 :");
					score[i][j] = sc.nextInt();

				case 2:
					System.out.print(name[i] + "학생의 영어" + "성적을 입력하세요 :");
					score[i][j] = sc.nextInt();

				case 3:

					System.out.print(name[i] + "학생의 수학" + "성적을 입력하세요 :");
					score[i][j] = sc.nextInt();

				case 4:

					score[i][j] = score[i][1] + score[i][2] + score[i][3];
					// 총점 입력

				default:
				}
			}
		}

		for (i = 0; i < name.length; i++) {

			avg[i] = (score[i][4] / 3);
			// 총점 입력

		}

		for (i = 0; i < name.length; i++) {
			
			
			System.out.print(score[i][0] + "\t " + name[i] + "\t " + score[i][1] + "\t ");
			System.out.print("\t " + score[i][2] );
			System.out.print("\t "+ score[i][3] );
			System.out.print("\t " + score[i][4] );
			System.out.print("\t " + avg[i] );
			System.out.println();

		}

		sc.close();

	}
}
