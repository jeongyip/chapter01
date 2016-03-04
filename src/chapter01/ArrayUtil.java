package chapter01;

public class ArrayUtil {
	public static int[] concat(int[] a,int[] b){
		int[] c = null;
		
		if( a==null && b == null){
			c = null;
		}else if( a==null && b!=null){
			c = new int[b.length];//배열 복사
			System.arraycopy(c,0,b,0,c.length);
		}else if( a!=null && b==null){
			c = new int[a.length];//배열 복사
			System.arraycopy(c,0,a,0,c.length);
		}
		c = new int[a.length+b.length];
		
		for(int i=0; i<a.length; i++){
			c[i] = a[i];
		}
		
		for(int i=0; i<b.length; i++){
			c[i+a.length] = b[i];
		}
		
		return c;
		
		
		
		
		/* 선생님의 답안 
		
		int length = (( a == null ) ? 0 : a.length)+((b == null)? 0 : b.length);
		int[] dest = new int[length];
		
		int destPos = 0;
		
		if( a= null ){
			System.arraycopy(a,0,dest,destPos,a.length);
			destPos = a.length;
		}
		
		if( b!= null ){
			System.arraycopy(b,0,dest,destPos,b.length);
		}
		
		return dest; */
		
	}
	
	public static boolean equals(int[] a,int[] b){
		if( a==null || b==null ){
			return false;
		}
		
		if (a.length != b.length) {
			return false;
		} else {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					return false;
				}
			}
		}
		return true;
	}

}
