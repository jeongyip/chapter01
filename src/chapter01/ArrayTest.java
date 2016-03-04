package chapter01;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] c = new char[3];
		
		c[0]='B';
		c[1]='I';
		c[2]='T';
		
		//배열객체의 참조값
		System.out.println(c);
		System.out.println(System.identityHashCode(c));
	
		//String의 참조값
		String s = new String("string");
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		System.out.println(s.hashCode());
		
		//배열의 선언 //배열 OutOfBound 예외
		int[] intArray;
		intArray = new int[10];
		try{
			intArray[10] = 10;
		} catch( ArrayIndexOutOfBoundsException ex){
			System.out.println("Array Index Out of Bound Error");
		}
		
		System.out.println("here");
		
		//Arrays 유틸리티 클래스 사용
		int[] intArray2 = {30,20,15,10,9,8}; //Sorting되어 있어야 한다
		int index = Arrays.binarySearch(intArray2, 15);
		System.out.println("이진 검색 결과:"+index);
		
		int[] intArray6 = {100,20,1500,20,1,5,6};
		System.out.println(intArray6); //println함수는 integer배열을 받지 않는다. 그래서 char[]와 다르게 주소값이 나옴
		System.out.println(Arrays.toString(intArray6));
		Arrays.sort(intArray6);
		System.out.println(Arrays.toString(intArray6));
		
		//배열 비교
		int[] intArray7 = {1,5,6,20,20,100,1500};
		boolean b = Arrays.equals(intArray6, intArray7);
		System.out.println(b);
		
		//배열 초기화
		Arrays.fill(intArray7,-10);
		System.out.println(Arrays.toString(intArray7));
		
		//배열 복사
		int[] src = {10,20,30,40,50};
		int[] dest1 = src; //같은 배열 객체 참조 - 이건 배열을 똑같이 만드는게 아니라, 참조값이 하나 더 생기는 것
		int[] dest2 = new int[src.length];//배열 복사
		System.arraycopy(src,0,dest2,0,src.length);
		System.out.println(Arrays.toString(dest2));
		
		//My ArrayUt[i] 테스트 해보기
		boolean b2 = ArrayUtil.equals( src, dest2);
		System.out.println(b2);
		
	}

}
