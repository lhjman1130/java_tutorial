package p0409;

import java.util.Scanner;

public class Java0409_3 {

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
		/*
		 * System.out.println(i + "�� �л��� �����Է¿Ϸ�" ); }
		 */

		/*
		 * for (i = 0; i < name.length; i++) { System.out.print(i + "�� �л��� ������ "
		 * + name[i] + "�Դϴ�.");
		 * 
		 * }
		 */

		/////////////// ��ȣ�Է�
		for (i = 0; i < name.length; i++) {
			j = 0;
			System.out.print(name[i] + "�л��� ��ȣ�� �Է��ϼ��� :");
			score[i][j] = sc.nextInt();

			/////////////// ���� �Է�
		}
		for (i = 0; i < name.length; i++) {
			j = 1;
			System.out.print(name[i] + "�л��� ����" + "������ �Է��ϼ��� :");
			score[i][j] = sc.nextInt();

		}
		for (i = 0; i < name.length; i++) {
			j = 2;
			System.out.print(name[i] + "�л��� ����" + "������ �Է��ϼ��� :");
			score[i][j] = sc.nextInt();

		}
		for (i = 0; i < name.length; i++) {
			j = 3;
			System.out.print(name[i] + "�л��� ����" + "������ �Է��ϼ��� :");
			score[i][j] = sc.nextInt();

		}
		for (i = 0; i < name.length; i++) {
			j = 4;

			score[i][j] = score[i][1] + score[i][2] + score[i][3];
			// ���� �Է�

		}
		for (i = 0; i < name.length; i++) {

			avg[i] = (score[i][4] / 3);
			// ���� �Է�

		}
		// ����//////////////////////////////////////////////////
		int tmp;
		String tmp_s;
		float tmp_f;
		int[] tmp_arr;
		
		for ( i=0; i<name.length-1; i++){
			for (j=0;  j<name.length - 1 - i ; j++){
				if( score[j][4] < score[j+1][4]){
					//�̸���ȯ
					tmp_s = name[j];
					name[j] = name[j + 1];
					name[j+1] = tmp_s;
					
					//score ��� ĭ ��ȯ
					
					/*for(int k=0; k<score[j].length ; k++ ){
						tmp = score[j][k];
						score[j][k] = score[j+1][k];
						score[j +1][k] = tmp;
					}*/
					///////////////////��� ĭ ��ȯ 
					tmp_arr = score[j];
					score[j] = score[j+1];
					score[j+1] = tmp_arr;
					
					//avg ��ȯ
					tmp_f = avg[j];
					avg[j] = avg[j+1];
					avg[j+1] = tmp_f;
					
				}
			}
		}
		
		
		

		for (i = 0; i < name.length; i++) {
			System.out.print(score[i][0] + "�� " + name[i] + ":" + "\t" + score[i][1] + "\t");
			
			System.out.print(score[i][0] + "\t " + score[i][1] + "\t ");
			System.out.print("\t " + score[i][2] );
			System.out.print("\t "+ score[i][3] );
			System.out.print("\t " + score[i][4] );
			System.out.print("\t " + avg[i] );
			System.out.println();


		}

		/*
		 * 
		 * for(i=0; i<arr.length; i++){ for(j=0; j<arr[i].length; j++){
		 * 
		 * System.out.print(arr[i][j] + "\t");
		 * 
		 * } System.out.println(); }
		 * 
		 * 
		 * 
		 * 
		 */
		sc.close();

	}

}
