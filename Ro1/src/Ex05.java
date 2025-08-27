// 10진수 --> 16진수
public class Ex05 {

	public static void main(String[] args) {
		int decimal=111;
		String hex = Integer.toHexString(decimal);
		System.out.println("10진수 "+decimal+" -->  16진수 "+hex);
		
		// 16진수 => 10진수
		String hex2 ="1f600";
		int decimal2 =Integer.parseInt(hex2,16); 
		System.out.println("16진수   " + hex2+" -->  10진수  "+decimal2);
		System.out.println((char)44032);
	}

}
