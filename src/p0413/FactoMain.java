package p0413;
/////Àç±ÍÇÔ¼ö´Â ·çÇÁ·Î ¹Ù²Ü ¼ö ÀÕ´Ù.
class Facto{
	int facto(int x){
		if(x==1){
			return 1;
		}else{
			System.out.println(x + "* factor(" + (x-1)+")");
			return x*facto(x-1);
		}
	}
	
	int facto2(int x){
		int res  = 1;
		for(int i = x; i>0; i--){
			res *= i ;
			
		}
		return res;
	}
	int fibo(int x){
		if(x<2){
			return 1;
			
		}else{
			return fibo(x-1)+fibo(x-2);
		}
	}
	
}

public class FactoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facto f = new Facto();
		int num = f.facto(4);
		System.out.println("num:"+num);
		
		num = f.facto2(4);
		System.out.println("num:"+num);
		

		for(int i =1 ; i<=80; i++){
			
			System.out.print(f.fibo(i) + "\t");
			
		}
	}

}
