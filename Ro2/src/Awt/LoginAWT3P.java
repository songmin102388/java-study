package Awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LoginAWT3P {
	public static void main(String[] args) {
		Frame f= new Frame("로그인");
		f.setLayout(new GridLayout(4,2,5,5));
		Label lblid= new Label("ID: ");
		TextField tfId = new TextField();
		
		Label lblPw=new Label("PW: ");
		TextField tfPw = new TextField();
		tfPw.setEchoChar('*');
		Button btnLogin = new Button("로그인");
		Button btnReast = new Button("초기화");
		Label lblStatus = new Label("상태 : 대기 중");
		
		
		f.add(lblid);
		f.add(tfId);
		f.add(lblPw);
		f.add(tfPw);
		f.add(btnLogin);
		f.add(btnReast);
		f.add(lblStatus);
		f.add(new Label(""));
		
		
		
		f.setSize(350,200);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		btnLogin.addActionListener(e->{
			String id = tfId.getText();
			String pw = tfPw.getText();
			
			if(id.equals("admin") && pw.equals("1234")) {
				System.out.println("로그인 성공!");
			}else {
				System.out.println("로그인 실패");
			}
			tfId.setText("");
			tfPw.setText("");
		});
		btnReast.addActionListener(e->{
			tfId.setText("");
			tfPw.setText("");
			lblStatus.setText("상태 :  초기화됨");
		});
		
	}

}
