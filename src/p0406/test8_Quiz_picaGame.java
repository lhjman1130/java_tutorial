package p0406;
// hp 가 0이 되면 사망
//exp는 경험치
// level은 
//text 기반의 게임. 머드 게임 같은 종루가 있었다. 
import java.util.Scanner;

public class test8_Quiz_picaGame {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		int hp = 30; // 생명수치
		int exp = 0; // 경험치
		int level = 1; //exp가 20마다 레벨 1 증가
		
		/*
		 * 밥먹기 : hp 5증가 잠자기 : hp 10증가 놀기 : hp 8감소, exp 10 증가 ( 체크 : 사망, 레벨 체크)
		 * 운동하기 : hp 15감소, exp 15증가.
		 * 
		 * 메뉴 1.밥먹기 2.잠자기 3.놀기 4.운동하기 5.상태확인 (hp, exp, level 출력) 6.종료
		 */

		while (hp > 0) {
			System.out.println("메뉴");
			System.out.println("1.밥먹기 2.잠자기 3.놀기 4.운동하기 5.상태확인 (hp, exp, level 출력) 6.종료");
			num = sc.nextInt();
			switch (num) {
			case 1:
				hp = hp + 30;
				System.out.println("밥을 먹고, hp가 30 증가했습니다.");
				break;
			case 2:
				hp = hp + 10;
				System.out.println("잠을 자고, hp가 10 증가했습니다.");
				break;
			case 3:
				hp = hp - 8;
				exp = exp + 10;
				System.out.println("놀았더니, hp가 8감소, exp가 15 증가했습니다.");
				if(hp<=0){
					System.out.println("사망.");
					return;
				}
				if(exp>=20){
					System.out.println("레벨업");
					level += 1;
					exp-=20;
					System.out.println("레벨업이 되어 level이 " + level + "이 되었습니다.");
				}
				break;
			case 4:
				hp = hp - 15;
				exp = exp + 10;
				if(hp<=0){
					System.out.println("사망.");
					return;
				}
				if(exp>=20){
					System.out.println("레벨업");
					level += 1;
					exp-=20;
					System.out.println("레벨업이 되어 level이 " + level + "이 되었습니다.");
				}
				break;
			case 5:
				System.out.println("hp : " + hp);
				System.out.println("exp : " + exp);
				System.out.println("level : " + level);
				break;
			case 6:
				return;

			}
						
		} // while 문 끝
		System.out.println("피카추가 잠들었습니다.");

	}
}
