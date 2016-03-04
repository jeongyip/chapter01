package chapter01;

public class Swap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1 = 20;
		int a2 = 10;
		int a3 = 50;

		if (a1 >= a2) {
			if(a1 >= a3){
				System.out.println("최댓값은 a1 입니다");
			}else{
				System.out.println("최댓값은  a3 입니다");
			}
		} else {
			if(a2 >= a3){
				System.out.println("최댓값은  a2 입니다");
			}else{
				System.out.println("최댓값은 a3 입니다");
			}
		}

		
	}

}
