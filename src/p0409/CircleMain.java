package p0409;
class Point{           //����Ʈ��� Ŭ������ ��ǥ1���� ��Ÿ��.
	int x;               //�������
	int y;
	
	void setXY(int a, int b){   //��ǥ�����ϴ�.
		x = a;              //ù��° �Ķ���� a�� x��ǥ ����.
		y = b;
	}
	
	void printXY(){                 //����ϴ� ��.
		System.out.print("("+ x + "," + y + ")");
	}
	
}

class Circle{
	//Point p;                 //Point p; �� ����� ��ü ���� �ȵ�.new�� ������ߵ�.
	Point p = new Point();
	
	int r;
	
	void setCircle(int x, int y, int z){
		p.setXY(x,  y);
		r = z;
	}
	
	void draw(){
		System.out.print("�߽��� : ");
		p.printXY();
		System.out.println("�� ������ : " + r + "�� �� �׸�");
		
	}
}


public class CircleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();   //��Ŭ ��ü ����
		c.setCircle(100, 200, 50);
		c.draw();
	}

}
