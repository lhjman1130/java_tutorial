package picachu;

public class Picachu {
	String name;
	int hp;
	int exp;
	int level;
	

	public Picachu() {
		name = "��ī��";
		hp = 30;
		exp = 0;
		level = 1;
	}

	void ��Ա�() {
		System.out.println("�����");
		hp += 5;
	}

	void ���ڱ�() {
		System.out.println("����");
		hp += 10;
	}

	boolean ���() {
		System.out.println("���");
		hp -= 8;
		exp += 10;
		levelCheck();
		return hpCheck();
	}

	boolean ��ϱ�() {
		System.out.println("���");
		hp -= 15;
		exp += 20;
		levelCheck();
		return hpCheck();
	}

	boolean hpCheck() {
		if (hp <= 0) {
			System.out.println("ĳ���� ���");
			return false;
		}
		return true;
	}

	void levelCheck() {
		if (exp >= 20) {
			level++;
			exp -= 20;
			System.out.println("������");
		}
	}

	void printInfo() {
		System.out.println(name + " ��������");
		System.out.println("hp:" + hp);
		System.out.println("exp:" + exp);
		System.out.println("level:" + level);
	}

}
