package chapter01;

import java.util.Scanner;

public class NHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scanner = new Scanner( System.in );
		int count= scanner.nextInt();

		for(int i=0; i<count; i++){
			System.out.println("Hello World!");
		}
		
		scanner.close();
	}

}
