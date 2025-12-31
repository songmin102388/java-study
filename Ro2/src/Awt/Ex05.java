package Awt;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.Toolkit;

class Ex05_sub extends Frame{
	private Dimension dimen,dimen1;
	private int xpos,ypos;
	private Label lb = new Label("Test");
	private Label lb0 = new Label("AAA");
	private Label lb1 = new Label("BBB");
	private Label lb2 = new Label("CCC");
	private Label lb3 = new Label("DDD");
	private Label lb4 = new Label("EEE");
	private Label lb5 = new Label("FFF");
	private Label lb6 = new Label("GGG");
	private Label lb7 = new Label("HHH");
	private Label lb8 = new Label("III");
	private Label lb9 = new Label("JJJ");
	
	
	public Ex05_sub() {
		super("프레임 연습");
		this.init();
		this.start();
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int)(dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int)(dimen.getHeight() / 2 - dimen1.getWidth() / 2);
		this.setLocation(xpos, ypos);
		this.setVisible(true);
		
		
	}


private void start() {
	
	
}

private void init() {
	this.pack();
	lb0.setBackground(Color.yellow);
	lb1.setBackground(Color.yellow);
	lb2.setBackground(Color.yellow);
	lb3.setBackground(Color.yellow);
	lb4.setBackground(Color.yellow);
	lb5.setBackground(Color.yellow);
	lb6.setBackground(Color.yellow);
	lb7.setBackground(Color.yellow);
	lb8.setBackground(Color.yellow);
	lb9.setBackground(Color.yellow);
	
	GridBagLayout gridbag=new GridBagLayout();
	GridBagConstraints gc = new GridBagConstraints();
	this.setLayout(gridbag);
	this.add(lb0);
	this.add(lb1);
	this.add(lb2);
	this.add(lb3);
	this.add(lb4);
	this.add(lb5);
	this.add(lb6);
	this.add(lb7);
	this.add(lb8);
	this.add(lb9);
}
}



public class Ex05 {

	public static void main(String[] args) {
		Ex05_sub ro =new Ex05_sub();
		
	}

}
