package ds.practice.recursion;

public class Fabonacci {
	
	int count = 0;
	public int fac(int n)
	{
		count++;
		if(n==0)
		{
			return 0;
		}
		if(n == 1)
		{
			return 1;
		}
		
		return fac(n-1)+fac(n-2);
	}
	
	public static void main(String[] args) {
		
		Fabonacci ff = new Fabonacci();
		System.out.println(ff.fac(4));
		System.out.println(ff.count);
	}
	
	int fab[] = new int[4];
	public int facDP(int n)
	{
		if(n==0)
		{
			return 0;
		}
		if(n==1)
		{
			return 1;
		}
		
		return -1;
	}

}
