public class RecursionExampleDirectory
{	
	public static void main(String[] args)
	{	RecursionExampleDirectory r = new RecursionExampleDirectory();
		Directory d = new Directory();
		System.out.println( r.getSize(d) );
    }
    
	//slow fib
	//pre: n >= 1
	public static int fib(int n)
	{	int result = 0;
		result = fib(n-1) + fib(n-2);
		return result;
	}
}

class Directory
{	private Directory[] mySubs;
	
	public Directory()
	{	int numSubs = (int)(Math.random() * 3);
		int numFiles = (int)(Math.random() * 10);
	}
	
	public Directory[] getSubs()
	{	return mySubs;
	}
	
	public File[] getFiles()
	{	return myFiles;
	}
}