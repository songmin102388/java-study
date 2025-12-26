package Awt;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex02 {

	public static void main(String[] args) {
		Frame f = new Frame("AWT 창");
		
		f.setSize(400, 300);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}

}
