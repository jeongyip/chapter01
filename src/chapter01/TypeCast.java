package chapter01;

public class TypeCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c = 'A';
		byte b = (byte)c;
		
		int i = c;
		byte b1 = 127;
		byte b2 = (byte)128;
		
		System.out.println(i);
		System.out.println(b2);
		
	}

}
