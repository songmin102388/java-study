package cote.exam1105;

public class LocalRepository implements MemoRepository{

	@Override
	public void addMemo(String id, String body) {
		System.out.println("pc에 메모리 추가");
		
	}

	@Override
	public void getMemo() {
		System.out.println("pc에 메모리 조회");
		
	}

	@Override
	public void deleteMemo(String id) {
		System.out.println("pc에 메모리 삭제");
		
	}

	@Override
	public void updateMemo(String id, String body) {
		System.out.println("pc에 메모리 업데이트");
		
	}
	
	
}
