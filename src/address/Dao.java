package address;

//������ �����(�迭) ó�� Ŭ����
public class Dao {
	// ��� ������ ���� ���൵ �⺻ ���� ����. ����Ÿ��:0, ��ü Ÿ��:null, boolean:false
	Member[] datas = new Member[10];
	int cnt;// �߰��� Member ��ü ���� ī����

	void insert(Member m) {// �迭�� ��� ��ü �ϳ� �߰�. cnt++
		datas[cnt] = m;
		cnt++;
	}

	int getIdx(String name) {// �̸����� �迭���� �˻��ؼ� �� ��ġ�� ��ȯ. ã���� ���ȣ, ������ -1��ȯ
		for (int i = 0; i < cnt; i++) {
			if (name.equals(datas[i].name)) {
				return i;//�����Լ� ����.
			}
		}
		return -1;
	}

	Member select(String name) {// �̸����� �迭���� �˻��ؼ� �� ��ü�� ��ȯ
		int idx = getIdx(name);
		if (idx < 0) {
			return null;
		}
		return datas[idx];
	}
	
	void update(Member m) {// �Ķ���Ϳ� ������ �̸��� �� ��ȭ��ȭ, �ּҸ� ��Ƽ� ���� �� ������ ����
		int idx = getIdx(m.name);
		if (idx < 0) {
			System.out.println("���� �̸�");
			return;
		}
		datas[idx].tel = m.tel;// �� ��ȭ��ȣ
		datas[idx].address = m.address;// �� �ּ�
		// datas[idx]=m;
	}

	void delete(String name) {// �̸����� �迭���� ã�Ƽ� ����. ������ ��ġ �ڿ� �ִ� ������ ������ ��ĭ��
								// �̵��ϰ�, cnt--;
		int idx = getIdx(name);
		if (idx < 0) {
			System.out.println("���� �̸�");
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
