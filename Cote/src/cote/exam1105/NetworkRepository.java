package cote.exam1105;

public class NetworkRepository implements MemoRepository{

	@Override
	public void addMemo(String id, String body) {
		System.out.println("원격 서버에 메모 추가");
		
	}

	@Override
	public void getMemo() {
		System.out.println("원격 서버에 메모 조회");
		
	}

	@Override
	public void deleteMemo(String id) {
		System.out.println("원격 서버에 메모 삭제");		
	}

	@Override
	public void updateMemo(String id, String body) {
		System.out.println("원격 서버에 메모 업데이트");
		
	}

}
