// Java implementation of the approach 
class GFG 
{ 
	static int C_MAX = 30; 
	static int max_arr_len = 10; 
	
	// To store states of DP 
	static int dp [][] = new int [max_arr_len][C_MAX + 1]; 
	
	// To check if a state has 
	// been solved 
	static boolean v[][]= new boolean [max_arr_len][C_MAX + 1]; 
	
	// Function to compute the states 
	static int findMax(int i, int r, int w[], int n) 
	{ 
	
		// Base case 
		if (r < 0) 
			return Integer.MIN_VALUE; 
		if (i == n) 
			return 0; 
	
		// Check if a state has 
		// been solved 
		if (v[i][r]) 
			return dp[i][r]; 
	
		// Setting a state as solved 
		v[i][r] = true; 
		dp[i][r] = Math.max(w[i] + findMax(i + 1, r - w[i], w, n), 
										findMax(i + 1, r, w, n)); 
	
		// Returning the solved state 
		return dp[i][r]; 
	} 
	
	// Function to pre-compute the states 
	// dp[0][0], dp[0][1], .., dp[0][C_MAX] 
	static void preCompute(int w[], int n) 
	{ 
		for (int i = C_MAX; i >= 0; i--) 
			findMax(0, i, w, n); 
	} 
	
	// Function to answer a query in O(1) 
	static int ansQuery(int w) 
	{ 
		return dp[0][w]; 
	} 
	
	// Driver code 
	public static void main (String[] args) 
	{ 

		int w[] = new int []{ 3, 8, 9 }; 
		int n = w.length; 
		
		// Performing required 
		// pre-computation 
		preCompute(w, n); 
	
		int queries[] = new int [] { 11, 10, 4 }; 
		int q = queries.length; 
	
		// Perform queries 
		for (int i = 0; i < q; i++) 
			System.out.println(ansQuery(queries[i])); 
	} 
} 

// This code is contributed by ihritik 
    