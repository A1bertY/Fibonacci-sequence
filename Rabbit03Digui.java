package Java50;

public class Rabbit03Digui {
	
	    public static long con(int n) {  
	        if (n > 2) {  
	            return con(n - 1) + con(n - 2);  
	        }  
	        return 1;  
	    }  
	  
	    public static void main(String[] args) {  
	        System.out.println(con(50));  
	    }  
	
}
