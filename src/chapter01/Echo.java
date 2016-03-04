package chapter01;

public class Echo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for( int i = 0; i < args.length; i++){ 
		       System.out.println( args[ i ] );
		}
		
		//arg에 args의 각각 요소들 하나씩 사용
		for( String arg : args ){
			System.out.println( arg );  
		}
	}

}
