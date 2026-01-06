package January.Day01;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;

class AWT_Sub extends Frame{
	private Dimension dimen,dimen1;
	private int xpos, ypos;
	private Label lb= new Label("Test");
	public AWT_Sub() {
		super("프레임연습");
		this.init();
		this.start();
		this.setSize(300,200);;
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int)(dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int)(dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
		this.setVisible(true);
	}
	private void start() {
		
		
	}
	private void init() {
		this.setLayout(null);
		lb.setBackground(Color.yellow);
;		this.add(lb);
		lb.setBounds(100, 100, 80, 30);
	}
	
	


	}




public class java01 {

	public static void main(String[] args) {
		java01 zed = new java01();
		

	}

}
