package p0406;

public class test0408_4_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] arr = new float[3];
		float[] arr2 = { 2.34f, 5.67f };
		
		//char 
		char[] arr3 ={'h', 'e', 'l', 'l', 'o'};
		char[] arr4 = new char[6];
		arr4[0]='a';
		arr4[1]='a';
		arr4[2]='a';
		arr4[3]='b';
		//str ¹è¿­
		String[] arr5 ={"ab", "bc"};
		String[] arr6 = new String[3];
		arr6[0]="abbb";
		arr6[1]="cccc";
		
		arr[0] = 34.56f;
		arr[1] = 23.34f;

		int i;

		for (i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);

		}
		for (i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "]=" + arr2[i]);

		}
		for(i = 0 ; i < arr3.length; i++) {
			System.out.println("arr3[" + i + "]=" + arr3[i]);
		}
		for(i = 0 ; i < arr4.length; i++) {
			System.out.println("arr4[" + i + "]=" + arr4[i]);
		}
		for(i = 0 ; i < arr5.length; i++) {
			System.out.println("arr5[" + i + "]=" + arr5[i]);
		}
		for(i = 0 ; i < arr6.length; i++) {
			System.out.println("arr6[" + i + "]=" + arr6[i]);
		}
	}
}
