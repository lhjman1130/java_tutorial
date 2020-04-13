package p0413.pacachu;

public class Pica{      // 다른 클래스는  상관 없지만 public은 꼭  파일명과 동일하게 만들어야 한다.
	                    //  
	String name;
	int hp;
	int exp;
	int level;

	void setInfo(){
		name = "피카추";
		hp = 30;
		exp = 0;
		level = 1;
		
	}
	
	void 밥먹기(){
		System.out.print("밥먹음");
		hp += 5;		
	}
	void 잠자기(){
		System.out.print("잠");
		hp += 10;		
	}
	boolean 놀기(){
		System.out.print("놀았다.");
		hp -= 8;
		exp += 10;
		levelCheck();
		return hpCheck();
	
	}
	boolean 운동하기(){            //live or death check
		System.out.print("운동했다");
		hp -= 15;
		exp+=20;
		levelCheck();
		return hp > 0 ;
		
		
	}
	void levelCheck(){
		if(exp>=20){
			level +=1;
			exp -=20;
			System.out.print("레벨업");
		}
	}
	void printInfo(){
		System.out.println(name + "\t 상태정보");
		System.out.println(hp + "\t hp");
		System.out.println(exp + "\t exp");
		System.out.println(level + "\t level");
		
	}
	boolean hpCheck(){
		if(hp<= 0){
			System.out.println("캐릭터 사망");
			return false;
		}
		return true;
	}
}

