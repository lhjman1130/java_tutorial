package p0406;

public class test0408_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for ( i=1; i< 11 ; i++){
			if(i%2 == 0){
				continue;    //뒤의 실행문을 건너 뛰고, 다음 루프 진행(제어문의 종류이다.)
			}
			System.out.println(i + "\t");
		}
	}

}
