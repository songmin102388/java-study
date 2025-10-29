package cote.exam1029;

public class Button implements Clickable, Drawable{
	
	String label;
	
	public Button() {}
	public Button(String label) {
		this.label = label;
	}
	@Override
	public void click() {
		System.out.println("버튼이 클릭되었습니다.");
		
	}
	@Override
	public void draw() {
		if(label != null) {
			System.out.println("버튼을 그립니다.");
		}
		
	}

}
