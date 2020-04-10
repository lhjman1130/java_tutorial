package p0409;
class Point{           //포인트라는 클래스는 좌표1개를 나타냄.
	int x;               //멤버변수
	int y;
	
	void setXY(int a, int b){   //좌표설정하는.
		x = a;              //첫번째 파라미터 a는 x좌표 설정.
		y = b;
	}
	
	void printXY(){                 //출력하는 것.
		System.out.print("("+ x + "," + y + ")");
	}
	
}

class Circle{
	//Point p;                 //Point p; 만 적어서는 객체 생성 안되.new를 적어줘야됨.
	Point p = new Point();
	
	int r;
	
	void setCircle(int x, int y, int z){
		p.setXY(x,  y);
		r = z;
	}
	
	void draw(){
		System.out.print("중심점 : ");
		p.printXY();
		System.out.println("에 반지름 : " + r + "로 원 그림");
		
	}
}


public class CircleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();   //서클 객체 생성
		c.setCircle(100, 200, 50);
		c.draw();
	}

}
