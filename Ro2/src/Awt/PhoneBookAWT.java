package Awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class PhoneBookAWT {
	static class Contact{
		String name;
		String phone;
		
		public Contact(String name,String phone) {
			this.name=name;
			this.phone=phone;
		}
		@Override
		public String toString() {
			return name +" | " + phone;
		}
	}
	

	public static void main(String[] args) {
		Frame f = new Frame("AWT 전화번호부");
		
		ArrayList<Contact> contacts = new ArrayList<>();
		
		Label lblName =  new Label("이름:");
		TextField tfName = new TextField(18);
		
		Label lblPhone = new Label("전화:");
		TextField tfPhone = new TextField(18);
		
		Button btnAdd = new Button("추가");
		Button btnUpdate = new Button("수정");
		Button btnDelete = new Button("삭제");
		Button btnClear = new Button("비우기");
		
		Label lblStatus = new Label("상태: 대기 중");
		
		List list = new List(10); // AWT List(목록)
		
		f.setLayout(new BorderLayout());
		Panel top = new Panel(new FlowLayout());
		
		
		top.add(lblName);
		top.add(tfName);
		top.add(lblPhone);
		top.add(tfPhone);
		Panel bottom = new Panel(new FlowLayout());
		bottom.add(btnAdd);
		bottom.add(btnUpdate);
		bottom.add(btnDelete);
		bottom.add(btnClear);
		
		f.add(top, BorderLayout.NORTH);
		f.add(list, BorderLayout.CENTER);
		f.add(bottom, BorderLayout.SOUTH);
		f.setSize(500,200);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		Runnable clearInputs = () -> {
			tfName.setText("");
			tfPhone.setText("");
			tfName.requestFocus();
		};
		
		btnAdd.addActionListener(e->{
			String name = tfName.getText().trim();
			String phone = tfPhone.getText().trim();
			contacts.add(new Contact(name, phone));
			list.add(name+ " : "+phone);
			clearInputs.run();
		});
		
		
	}

}
