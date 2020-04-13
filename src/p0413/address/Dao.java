package p0413.address;

//������ �����(�迭) ó�� Ŭ����
//�����ͺ��̽� ������ ������Ʈ (db�� �����ϴ°� ó���ϴ� )
public class Dao {
	// �迭 ó���� �����ϴ� Ŭ����.
	Member[] dates = new Member[10];
	// ��� Ÿ���� �迭
	// ��� ��ü�� �� ����ٰ� �ص� �ȸ��������. �ܺο� ����� �� ������.
	// ���� ī��Ʈ�� �ʿ��ϴ�.
	int cnt; // �߰��� �����Ͱ� ������� üũ.
	// ���������� ���� ���ָ� �����Ⱚ, ��������� ���� ���൵ �⺻���� ����.
	// ����Ÿ���� 0, ��ü Ÿ���� null, boolean : false

	void insert(Member m) { // �迭�� ��� ��ü �ϳ� �߰�
		dates[cnt] = m;
		cnt++;
		
		System.out.print("�Է��Ͻÿ�.");

	}

	int getIdx(String name) { // �̸����� �迭���� �˻��ؼ� �� ��ġ�� ��ȯ
		for(int i=0; i<cnt; i++){                   //������ ������ ���� ������ �������� �𸥴�.
			if(name.equals(dates[i].name)){
				return i;    // ������ ������ ������ �Լ��� ����.
			}
		}
		return -1;
	}

	Member select(String name) { // �̸����� �迭���� �˻��ؼ� �� ��ü�� ��ȯ
									// ��ã���� null�� ���T��.
		int idx = getIdx(name);
		if(idx<0){
			return null;
		}
		return dates[idx];
	}

	void update(Member m) { // �Ķ���Ϳ� ������ �̸��� �� ��ȭ��ȣ, �ּҸ� ��Ƽ� ���� �� ������ ����
    //�̸����� ��ġ�� ã�Ƽ� �� ������ �ٲٸ� �ȴ�. 
		int idx = getIdx(m.name);
		if(idx<0){
			System.out.println("���� �̸�");
			return;
		}
		dates[idx].tel = m.tel;        //�� ��ȭ��ȣ
		dates[idx].address = m.address;  //�� �ּ�
		//dates[idx] = m;  �����̶� �̰��� �ϳ� �ϸ� �ȴ�. 
		
		
		
	}

	void delete(String name) {// �̸����� �迭���� ã�Ƽ� ����. ������ ��ġ �ڿ� �ִ� ������ ������ ��ĭ��
								// �̵� .�ϰ� cnt--
		int idx = getIdx(name);
		if(idx <0){
			System.out.println("���� �̸�");
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
