package chapter01;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int n1 = 10;
		int n2 = 30;

		// Q1: n1값이 항상 큰 값이 되도록, 필요할 경우 n1과 n2를 교체하라.
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		
		int temp = 0;
		
		if( n2>n1 ){
			temp = n1;
			n1 = n2;
			n2 = temp;
		}
		
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		


	}

}
