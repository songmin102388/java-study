package Awt;

import java.awt.Choice;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.Toolkit;

class Ex08_sub extends Frame{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	private Label lb = new Label("생년월일 : ", Label.RIGHT);
	private Label lb1 = new Label("년 ", Label.LEFT);
	private Label lb2 = new Label("월 ", Label.LEFT);
	private Label lb3 = new Label("일 ", Label.LEFT);
	
	private Choice choice = new Choice();
	private Choice choice1 = new Choice();
	private Choice choice2 = new Choice();
	
	public Ex08_sub() {
		this.init();
		this.start();
		this.win();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException ee) {
		}
		choice.select("2009");
		choice1.select("10");
		choice2.select("23");
		choice2.requestFocus();
	}
	
	private void win() {
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos,ypos);
		this.setVisible(true);
	}
	
	private void start() {
		
	}
	
	private void init() {
		this.setSize(300,200);
		for(int i = 2026; i >= 1970; i--) {
			choice.add(String.valueOf(i));
		}
		for(int i = 1; i <= 12; i++) {
			choice1.add(String.valueOf(i));
		}
		for(int i = 1; i <= 31; i++) {
			choice2.add(String.valueOf(i));
		}
		
		
		GridBagLayout gridbag =  new GridBagLayout();
		GridBagConstraints  gc = new GridBagConstraints();
		this.setLayout(gridbag);
		
		gridbag.setConstraints(lb, gc);
		this.add(lb);
		gridbag.setConstraints(choice, gc);
		this.add(choice);
		gridbag.setConstraints(lb1, gc);
		this.add(lb1);
		gridbag.setConstraints(choice1, gc);
		this.add(choice1);
		gridbag.setConstraints(lb2, gc);
		this.add(lb2);
		gridbag.setConstraints(choice2, gc);
		this.add(choice2);
		gridbag.setConstraints(lb3, gc);
		this.add(lb3);
		
	}
}






public class Ex08 {
	public static void main(String[] args) {
		Ex08_sub ro = new Ex08_sub();

	}

}
