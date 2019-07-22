package ds.practice.algo;

public class KnapSackProb {

	public static int maxValue(int wv[][],int i,int weight,int currentVal)
	{
		if(i>=wv[0].length || weight <= 0)
		{
			return currentVal;
		}
		
		return Math.max(maxValue(wv,i+1,weight-wv[1][i],currentVal+wv[0][i]), maxValue(wv,i+1,weight,currentVal));
	}
	
	public static void main(String[] args) {
		
		int wv[][] = {{60,100,120},
					  {10,20,30}};
		//System.out.println(maxValue(wv,0, 50,0));
		
		
		byte a = 127;
		byte b =29;
		byte c = (byte) (a+b);
		System.out.println(c);
	}
}
