package p0413;
class Fibo{
	int fibo(int x){
		if(x<2){
			return 1;
			
		}else{
			return fibo(x-1)+fibo(x-2);
		}
	}
}


public class fibo_reflex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facto f = new Facto();
		int num = f.facto(4);
		System.out.println("num:" + num);
		
		
		for(int i =1 ; i<=80; i++){
			
			System.out.print(f.fibo(i) + "\t");
			
		}

	}

}
