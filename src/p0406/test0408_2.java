package p0406;

public class test0408_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for ( i=1; i< 11 ; i++){
			if(i%2 == 0){
				continue;    //���� ���๮�� �ǳ� �ٰ�, ���� ���� ����(����� �����̴�.)
			}
			System.out.println(i + "\t");
		}
	}

}
