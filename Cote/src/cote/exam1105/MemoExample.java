package cote.exam1105;


public class MemoExample   {

	public static void main(String[] args) {
		MemoRepository repository;
		
		repository = new LocalRepository();
		repository.getMemo();
		
		repository = new NetworkRepository();
		repository.getMemo();
		

	}

}
