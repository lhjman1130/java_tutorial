package p0409;
//ĸ��ȭ , ��ü Ÿ���� ���� ���� �� ���� �� ����.
//Ÿ���� ������
//Ÿ���� �̸��� Person(int, float)
//Ŭ������ ����� �ִ� �Լ��� �޼ҵ�� �Ѵ�. 
//Ŭ������ ��� ������ �޼���� ����.
//���๮������ �޼��� �ۿ��� ���๮�� ������ �ȵȴ�. 
public class Person {
	//������� :  Ŭ���� �ȿ��� ��������ó�� ��� �Լ����� ��밡��.
	int age;
	String name;
	//�޼���
	void setInfo(int a, String n){   //�Ķ����, �������� ���� �Լ� �ȿ����� ��밡��.
		age = a;
		name = n;
//������� �������� ���ӿ� ���� �־��ִ� ����.
		
	}
	//System.out.println("age = "+ age); �̷� ���� ���� ������.
	void PrintInfo(){           //������ִ� ����.
		//System.out.println("age = "+ a); �̷� �͵� ����. ������  
		System.out.println("age = "+ age);
		System.out.println("name = "+ name);
	}


}

