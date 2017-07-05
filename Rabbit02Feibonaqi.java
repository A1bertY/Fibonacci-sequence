package Java50;



public class Rabbit02Feibonaqi {
	final static double a=Math.sqrt(5)/5;
	final static double b=(1+Math.sqrt(5))/2;
	final static double c=(1-Math.sqrt(5))/2;
	
	static int n =100;

static double d;
static long e;
	/**
	 * @param args
	 */
	public static void main(String[] args) {

d=a*(Math.pow(b, n)-Math.pow(c, n));
e=(long) Math.round(d);
System.out.println(e);

	}

}
