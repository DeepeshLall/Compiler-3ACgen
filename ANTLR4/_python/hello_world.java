public class RecursionExampleDirectory
{	
    public static void main(String[] args){
        long a=1,b=2;
        long c=a+2,d=4.2;
        a/=c;
		c=a+b*c-d;
		d = fib(a) + fib(b);
        int val = 0;
		val = ++val + ++val;
		for (int i =0 ; i < a ; i++ ){
			if(a==val || a>2){
				System.out.println( "Hey I am string." );
				b=3;
			}else{
				a = 2;
			}
			// a=2;
			// break;
			// c=2;
		}
		val = a==val?val+val:a+a;
		a++;
		System.out.println( r.getSize(d) );
		
		
		
		// int[] arr; 
		// int a[][];
		// int[] zrr = new int[2]; 

		// arr = new int[5]; 
		
		// int val = 0;
		// val = val + 2.0;

		// char myChar = 'a';
		// String myString = "MyString";
		// arr[0] = 10; 
        // zrr[1] = 20; 

		// a[2][3] = 3;
    }

	// public static int fib(int n)
	// {	int result = 0;
	// 	result = fib(n-1) + fib(n-2);
	// 	return result;
	// }
}