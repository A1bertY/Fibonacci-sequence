package Java50;



public class Rabbit01BornNumbers {
	
	
	
	public static long rabbit(int m){
		long n=1,c=0,temp=0;
		for (int i = 1; i < m; i++) {
			temp=n;
			n=n+c;
			c=temp;
			}
		
		 
		return n;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int t =100;
		System.out.println(rabbit(t));
		
		

		
		
		
	}

}
