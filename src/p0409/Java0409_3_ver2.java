package p0409;

import java.util.Scanner;

public class Java0409_3_ver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String[] name = new String[3];
		int[][] score = new int[3][5]; // ��ȣ, ��,��,��, ����
		float[] avg = new float[3];

		int i, j;
		///////////////// �̸� �Է�
		for (i = 0; i < name.length; i++) {
			System.out.print(i + "�� �л��� ������ �Է��ϼ��� :");
			name[i] = sc.next();
		}

		for (i = 0; i < name.length; i++) {

			for (j = 0; j < 5; j++) {
				switch (j) {

				case 0:
					System.out.print(name[i] + "�л��� ��ȣ�� �Է��ϼ��� :");
					score[i][j] = sc.nextInt();

				case 1:

					System.out.print(name[i] + "�л��� ����" + "������ �Է��ϼ��� :");
					score[i][j] = sc.nextInt();

				case 2:
					System.out.print(name[i] + "�л��� ����" + "������ �Է��ϼ��� :");
					score[i][j] = sc.nextInt();

				case 3:

					System.out.print(name[i] + "�л��� ����" + "������ �Է��ϼ��� :");
					score[i][j] = sc.nextInt();

				case 4:

					score[i][j] = score[i][1] + score[i][2] + score[i][3];
					// ���� �Է�

				default:
				}
			}
		}

		for (i = 0; i < name.length; i++) {

			avg[i] = (score[i][4] / 3);
			// ���� �Է�

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
