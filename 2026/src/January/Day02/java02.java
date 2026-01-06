package January.Day02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;


class java02_sub extends Frame{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	private Label lb = new Label("Test");
	private Label lb1 = new Label("Test1");
	
	public java02_sub() {
		// this.init();
		// this.init2();
		this.init3();
		this.start();
		this.win();
		
		
	}
	
	private void start() {
		
	}
	
	
	private void init() {
		this.setSize(250, 200);
		this.setBackground(Color.magenta);
		FlowLayout flow = new FlowLayout();
		this.setLayout(flow);
		lb.setBackground(getBackground());
		lb.setForeground(Color.white);
		this.add(lb);
		
		BorderLayout border = new BorderLayout();
		this.setLayout(border);
		lb.setBackground(Color.yellow);
		lb.setBackground(Color.magenta);
		GridLayout grid = new GridLayout(1,2,5,5);
		Panel p = new Panel();
		p.setLayout(grid);
		p.add(lb);
		p.add(lb1);
		this.add("South",p);
	}
	
	
	private void init2() {
		this.setSize(250,200);
		Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
		Cursor cursor1 = new Cursor(Cursor.WAIT_CURSOR);
		this.setCursor(cursor);
		FlowLayout flow  = new FlowLayout();
		this.setLayout(flow);
		lb.setCursor(cursor1);
		lb.setBackground(Color.yellow);
		this.add(lb);
	}
	
	private void init3() {
		this.setSize(250,200);
		Font font = new Font("SansSerif", Font.BOLD, 20);
		FlowLayout flow = new FlowLayout();
		this.setLayout(flow);
		lb.setFont(font);
		lb.setBackground(Color.yellow);
		this.add(lb);
		
	}
	
	
	
	
	
	
	
	
	
	
	private void win() {
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos =  (int) (dimen.getWidth() / 2 - dimen1.getWidth() /2);
		ypos =  (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos,ypos);
		this.setVisible(true);
		
		
	}
	
	
	
	
}










public class java02 {
	public static void main(String[] args) {
		java02_sub ro = new java02_sub();
		
	}

}
