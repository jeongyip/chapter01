package chapter01;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner( System.in );

		int result = 1;
		System.out.print("승수: ");

		int pow = scanner.nextInt();
		int temp = pow;
		// Q: 아래 while 반복문을 작성하시오.
		while(temp>0){
			result = result * 2;
			temp --;
		}
		
		System.out.println("2의 " + pow + "제곱근은 " + result + "입니다.");

		scanner.close();
	}

}
