package p0413.pacachu;

public class Pica{      // �ٸ� Ŭ������  ��� ������ public�� ��  ���ϸ�� �����ϰ� ������ �Ѵ�.
	                    //  
	String name;
	int hp;
	int exp;
	int level;

	void setInfo(){
		name = "��ī��";
		hp = 30;
		exp = 0;
		level = 1;
		
	}
	
	void ��Ա�(){
		System.out.print("�����");
		hp += 5;		
	}
	void ���ڱ�(){
		System.out.print("��");
		hp += 10;		
	}
	boolean ���(){
		System.out.print("��Ҵ�.");
		hp -= 8;
		exp += 10;
		levelCheck();
		return hpCheck();
	
	}
	boolean ��ϱ�(){            //live or death check
		System.out.print("��ߴ�");
		hp -= 15;
		exp+=20;
		levelCheck();
		return hp > 0 ;
		
		
	}
	void levelCheck(){
		if(exp>=20){
			level +=1;
			exp -=20;
			System.out.print("������");
		}
	}
	void printInfo(){
		System.out.println(name + "\t ��������");
		System.out.println(hp + "\t hp");
		System.out.println(exp + "\t exp");
		System.out.println(level + "\t level");
		
	}
	boolean hpCheck(){
		if(hp<= 0){
			System.out.println("ĳ���� ���");
			return false;
		}
		return true;
	}
}

