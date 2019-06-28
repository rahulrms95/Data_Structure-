package ds.practice.others;

public class Factorial {
	
	
	public long fac(int n)
	{
		if(n==0)
		{
			return 1;
		}
		
		return n*fac(n-1);
	}

	public static void main(String[] args) {
	
		System.out.println(new Factorial().fac(12));
	}
}
