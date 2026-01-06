package Awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;

class Ex07_sub extends Frame{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	// private Button[] bt = new Button[12];
	private Label lb = new Label("좋아하는 과일을 모두 체크하세요!");
	private Checkbox cb = new Checkbox("   사    과");
	private Checkbox cb1 = new Checkbox("   딸    기",false);
	private Checkbox cb2 = new Checkbox("    키    위",true);
	private Checkbox cb3 = new Checkbox("  포     도");
	private Button bt = new Button("확인");
	private Button bt1 = new Button("최소");
	
	
	public Ex07_sub() {
		super("전화기 자판");
		// this.init();
		this.init2();
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
	
	
	
	
	
	
//	private void init() {
//		this.setSize(300,400);
//		CardLayout card = new CardLayout(5,5);
//		this.setLayout(card);
//		GridLayout grid = new GridLayout(4,3,5,5);
//		Panel p =  new Panel(grid);
//		Font font  = new Font("TimesRoman", Font.BOLD, 20);
//		Font font1 = new Font("SansSerf", Font.BOLD, 20);
//		String[] str = {"*", "0", "#"};
//		for(int i = 0; i < bt.length; i++) {
//			if(i<9) {
//				bt[i] = new Button(String.valueOf(i + 1));
//				bt[i].setFont(font);
//				
//			}
//			else { 
//				bt[i] = new Button(str[i - 9]);
//				bt[i].setFont(font1);
//			}
//			p.add(bt[i]);
//		}
//		
//		
//		this.add("view", p);
//	}
	
	
	
	public void init2() {
		this.setSize(300,200);
		BorderLayout border = new BorderLayout();
		this.setLayout(border);
		
		this.add("North", lb);
		GridLayout grid = new GridLayout(2,2);
		Panel p = new Panel(grid);
		p.add(cb);
		p.add(cb1);
		p.add(cb2);
		p.add(cb3);
		this.add("Center", p);
		
		FlowLayout flow = new FlowLayout(FlowLayout.RIGHT);
		Panel p1 = new Panel(flow);
		p1.add(bt);
		p1.add(bt1);
		this.add("South",p1);
	}
	
	
	
	
	
}       

public class Ex07 {

	public static void main(String[] args) {
		Ex07_sub ro=new Ex07_sub();
		

	}

}
