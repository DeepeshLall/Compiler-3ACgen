public class RecursionExampleDirectory
{	
	int a=1,b=2;
	protected int deep = a*b + (float)a;
    public static void main(String[] args[][]){
        int a=1,b=2;
		char c=a+2.0,d=4.2;
		// char a;
		int[][] arr[];
		int[] zrr[] = new int[2]; 
		// short e;
		// c = e;
		// a/=c;
		// c=a+b*(int)c-(float)d;
		arr[b] = fib(a - 1,a) + fib(b,0);
		// int val = 0;
		// val = ++val + ++val;
		// val = (float) val;
		// for (int i =0 ; i < a ; i++ ){
			// if(a==val || a>2){
				System.out.println( "Hey I am string." );
			// 	b=3;
			// }else{
			// 	d = b;
			// }
			// a=2>3;
			// a=2;
			// break;
			// c=2;
		// }
		// val = a==val?val+val:a+a;
		// a++;
		// System.out.println( r.getSize(d) );
	
		// int[] zrr[] = new int[2]; 

		// arr = new int[5]; 
		
		// int val = 0;
		// val = val + 2.0;

		// char myChar = 'a';
		// String myString = "MyString";
		// arr[0] = 10; 
        // zrr[1] = 20; 

		// arr[2][3] = 3;
    }

	public static int fib(int n, int m)
	{	int result = 0;
		result = fib(n-1,n) + fib(n-2,n);
		return result;
	}
}