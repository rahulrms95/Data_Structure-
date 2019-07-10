package ds.practice.matrix;

public class LongestPlindromeSubSequence {

	static int count = 0;
	static int mat[][];
	
	public LongestPlindromeSubSequence(int n)
	{
		mat = new int[n][n];
	}
	public static int LongestPlindrome(String str,int start,int end)
	{
		count++;
		if(start>end)
		{
			return 0;
		}
		if(mat[start][end] > 0)
		{
			return mat[start][end];
		}
		else if(start == end)
		{
			mat[start][end] = 1;
			return mat[start][end] ;
		}
		else if(str.charAt(start) == str.charAt(end))
		{
			
			mat[start][end] =  LongestPlindrome(str, start+1, end-1)+2;
			return mat[start][end];
		}
		
		mat[start][end] = Math.max(LongestPlindrome(str, start+1, end), LongestPlindrome(str, start, end-1));
		
		return mat[start][end] ;
	}
	
	public static void main(String[] args) {
		
		String str  = "ABCABA";
		LongestPlindromeSubSequence plin = new LongestPlindromeSubSequence(str.length());
		System.out.println(LongestPlindrome(str, 0, str.length()-1));
		System.out.println(count);
	}
}
