package p0406;

//����for��

public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, k, result;
		for (j = 0; j < 2; j++) {
			for (i = 0; i < 3; i++) {
				System.out.print("#");

			}
			System.out.println();
		}

	/*	System.out.println("1. ������ 2-9�� ���η� ���");
		
		
		i=1;
		j=1;
		
		for (j = 2; j <= 9; j++) {

			for (i = 1; i <= j; i++) {
				result = i * j ;
				System.out.println(j + "*" + i + "=" + result);
			}
		}
		
	 */   //1�� ����.��
		
		
		
		System.out.println("2. ������ 2-9�� ���η� ���");
		i=1;
		
		

		System.out.println("3. 1-100���̿� �Ҽ� ���");
		i = 1;
		j = 100;
		k = 1;
		result = 0;
		for (j = 1; i <= j; i++) {
			for (k = 1; k <= j; k++) {

				if (i % j == 0) {
					result = 0;
					// �Ҽ��� �ƴϴ�.
				} else {
					result = 1;
					// �Ҽ��̴�.
				}

			}
			System.out.println("�Ҽ�");

		}
		if (result == 0){
			System.out.println("�Ҽ�");
		}else {
			System.out.println("�Ҽ��ƴ�");
		}
	}
}
