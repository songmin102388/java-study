package Awt;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.List;
import java.awt.Panel;
import java.awt.Toolkit;

class Ex00_sub extends Frame{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	private Button bt = new Button(">");
	private Button bt1 = new Button("<");
	private List list = new List(10, true);
	private List list1 = new List(10);
	
	
	public Ex00_sub() {
		this.init();
		this.start();
		this.win();
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
		for (int i = 0; i< 20; i++) {
			list.add("TEST " + (i + 1));
		}
		
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints gc = new GridBagConstraints();
		this.setLayout(gridbag);
		
		gc.insets = new Insets(0, 0,0,10);
		gridbag.setConstraints(list, gc);
		this.add(list);
		
		GridLayout grid = new GridLayout(2,1,0,20);
		Panel p = new Panel(grid);
	}
}




public class Ex00 {
	public static void main(String[] args) {
		Ex00_sub ro = new Ex00_sub();

	}

}
