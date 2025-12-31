package Awt;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;

class Ex04_Sub extends Frame{
	private Dimension dimen,dimen1;
	private int xpos, ypos;
	private Label lb = new Label("Test");
	public Ex04_Sub() {
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





public class Ex04 {

	public static void main(String[] args) {
		Ex04_Sub ro = new Ex04_Sub();

	}

}
