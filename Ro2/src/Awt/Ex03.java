package Awt;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class Ex03 {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.setSize(300,200);
		Dimension dimen = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension dimen1 = f.getSize();
		int xpos = (int)(dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		int ypos = (int)(dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		f.setLocation(xpos, ypos);
		f.setVisible(true);
		
		
	}

}
