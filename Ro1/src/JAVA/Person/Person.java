package JAVA.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

public class Person implements Serializable{
	private String name;
	private String jumin;
	private String tel;
	private String addr;
	static transient BufferedReader in;
	static {
		in = new BufferedReader(new InputStreamReader(System.in));
	}
	public Person() throws IOException{
		System.out.println("name = ");
		name = in.readLine();
		System.out.println("jumin = ");
		jumin = in.readLine();
		System.out.println("tel = ");
		tel = in.readLine();
		System.out.println("addr = ");
		addr = in.readLine();
	}
	
	public void disp() {
		System.out.println(name + "\t");
		System.out.println(jumin + "\t");
		System.out.println(tel + "\t");
		System.out.println(addr);
	}

}
