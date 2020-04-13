package address;

//데이터 저장소(배열) 처리 클래스
public class Dao {
	// 멤버 변수는 값을 안줘도 기본 값을 갖음. 숫자타입:0, 객체 타입:null, boolean:false
	Member[] datas = new Member[10];
	int cnt;// 추가한 Member 객체 수를 카운팅

	void insert(Member m) {// 배열에 멤버 객체 하나 추가. cnt++
		datas[cnt] = m;
		cnt++;
	}

	int getIdx(String name) {// 이름으로 배열에서 검색해서 그 위치를 반환. 찾으면 방번호, 없으면 -1반환
		for (int i = 0; i < cnt; i++) {
			if (name.equals(datas[i].name)) {
				return i;//현재함수 종료.
			}
		}
		return -1;
	}

	Member select(String name) {// 이름으로 배열에서 검색해서 그 객체를 반환
		int idx = getIdx(name);
		if (idx < 0) {
			return null;
		}
		return datas[idx];
	}
	
	void update(Member m) {// 파라메터에 수정할 이름과 새 전화번화, 주소를 담아서 오면 그 값으로 변경
		int idx = getIdx(m.name);
		if (idx < 0) {
			System.out.println("없는 이름");
			return;
		}
		datas[idx].tel = m.tel;// 새 전화번호
		datas[idx].address = m.address;// 새 주소
		// datas[idx]=m;
	}

	void delete(String name) {// 이름으로 배열에서 찾아서 삭제. 삭제할 위치 뒤에 있는 값들을 앞으로 한칸씩
								// 이동하고, cnt--;
		int idx = getIdx(name);
		if (idx < 0) {
			System.out.println("없는 이름");
			return;
		}
		for (int i = idx; i < cnt - 1; i++) {
			datas[idx] = datas[idx + 1];
		}
		cnt--;
	}

	void printAll() {
		for (int i = 0; i < cnt; i++) {
			datas[i].printInfo();
		}
	}
}
