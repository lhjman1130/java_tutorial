package p0406;

public class test0408_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {1, 4, 7, 8, 6};
int tmp, a, b, i, j, n ;
n = arr.length;
System.out.println(n);

for(i=1 ; i <= (n-1) ; i++){
	for( j=1 ; j < (n-1) ; j++ ){
		a = arr[i];
		b = arr[i+1];
			
		
		if(b<=a){
			 b = arr[i];
			 a = arr[i+1];
			 
		}
		arr[i] = a;
		arr[i+1] =b;
		
		System.out.println("arr" + i + "는" + a + "이다.");
		System.out.println("arr" + (i+1) + "는" + b + "이다.");
	}
}
























	}

}
