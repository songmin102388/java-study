package cote.exam1029;

public class ClickableExample {

	public static void main(String[] args) {
		Clickable c1 = new Image("a.jpg");
		Clickable c2 = new Button("OK");
		Drawable c3 = new Image("b.jpg");
		Drawable c4 = new Button("BLACKBROWNYELLOWWHITEWHAT");
		
		c1.click();
		c2.click();
		c3.draw();
		c4.draw();
		
		Image i;
		if(c1 instanceof Image)
			i = (Image) c1;

	}

}
