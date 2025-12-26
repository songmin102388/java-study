package Awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LoginAWT {

	public static void main(String[] args) {
		Frame f= new Frame("로그인");
		f.setLayout(new FlowLayout());
		
		Label lblid= new Label("ID: ");
		TextField tfId = new TextField(15);
		
		Label lblPw=new Label("PW: ");
		TextField tfPw = new TextField(15);
		tfPw.setEchoChar('*');
		Button btnLogin = new Button("로그인");
		
		f.add(lblid);
		f.add(tfId);
		f.add(lblPw);
		f.add(tfPw);
		f.add(btnLogin); 
		f.setSize(300,200);
		f.setVisible(true);		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = tfId.getText();
				String pw = tfPw.getText();
				
				if(id.equals("admin") && pw.equals("1234")) {
					System.out.println("로그인 성공");
					
				}else {
					System.out.println("로그인 실패");
				}
			}
		});
		
		
		
	
	}
}
