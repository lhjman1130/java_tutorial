package p0413.address;

//데이터 저장소(배열) 처리 클래스
//데이터베이스 엑세스 오브젝트 (db에 접근하는걸 처리하는 )
public class Dao {
	// 배열 처리를 전담하는 클래스.
	Member[] dates = new Member[10];
	// 멤버 타입의 배열
	// 멤버 객체는 방 만든다고 해도 안만들어진다. 외부에 만들어 질 뿐이지.
	// 이제 카운트가 필요하다.
	int cnt; // 추가한 데이터가 몇개인지를 체크.
	// 지역변수는 값을 안주면 쓰레기값, 멤버변수는 값을 안줘도 기본값을 가짐.
	// 숫자타입은 0, 객체 타입은 null, boolean : false

	void insert(Member m) { // 배열에 멤버 객체 하나 추가
		dates[cnt] = m;
		cnt++;
		
		System.out.print("입력하시오.");

	}

	int getIdx(String name) { // 이름으로 배열에서 검색해서 그 위치를 반환
		for(int i=0; i<cnt; i++){                   //데이터 개수와 방의 개수가 같은지는 모른다.
			if(name.equals(dates[i].name)){
				return i;    // 리턴은 무조건 현재의 함수가 종료.
			}
		}
		return -1;
	}

	Member select(String name) { // 이름으로 배열에서 검색해서 그 객체를 반환
									// 못찾으면 null을 반홚자.
		int idx = getIdx(name);
		if(idx<0){
			return null;
		}
		return dates[idx];
	}

	void update(Member m) { // 파라메터에 수정할 이름과 새 전화번호, 주소를 담아서 오면 그 값으로 변경
    //이름으로 위치를 찾아서 새 값으로 바꾸면 된다. 
		int idx = getIdx(m.name);
		if(idx<0){
			System.out.println("없는 이름");
			return;
		}
		dates[idx].tel = m.tel;        //새 전화번호
		dates[idx].address = m.address;  //새 주소
		//dates[idx] = m;  윗줄이랑 이것중 하나 하면 된다. 
		
		
		
	}

	void delete(String name) {// 이름으로 배열에서 찾아서 삭제. 삭제할 위치 뒤에 있는 값들을 앞으로 한칸씩
								// 이동 .하고 cnt--
		int idx = getIdx(name);
		if(idx <0){
			System.out.println("없는 이름");
			return;
		}
		for(int i=idx; i<cnt - 1 ; i++){
			dates[idx] = dates[idx +1];
		}	
		cnt--;
		
	}

	void printAll(){
		for (int i = 0; i<cnt ;i++){
			
			dates[i].printInfo();
		}
	}
	

}
