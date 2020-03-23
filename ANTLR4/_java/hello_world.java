public class RecursionExampleDirectory
{	
    public static void main(String[] args){
        long a=1,b=2;
        long c=a+2,d=4.2+"string temp";
        a/=c;
		c=a+b*c-d;
		d = fib(a) + fib(b);
        int val = 0;
		val = val++ + ++val;
		if(a==val){
			System.out.println( "Hey I am string." );
		}
		val = a==val?val+val:a+a;
		a++;
		System.out.println( r.getSize(d) );
    }

	public static int fib(int n)
	{	int result = 0;
		result = fib(n-1) + fib(n-2);
		return result;
	}
}