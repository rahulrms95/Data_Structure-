package ds.practice.matrix;

public class Pattern {

	public static void main(String[] args) {
		plotPattern(7, 7);
	}
	public static void plotPattern(int rowNum,int colNum)
	{
		int count = 0;
		int left =1,top = 1;
		for(int row=0;row<rowNum;row++)
		{
			for(int col=0;col<colNum;col++)
			{
				if((row+col)%2==0)
				{
					if((row%2==0 && col==count) || (col == colNum-1))
					{
						System.out.print("*");
						System.out.print("   ");
					}
					/*if(i == j)
					{
						System.out.print("*");
						System.out.print("   ");
					}
					else if(j+top == col)
					{
						System.out.print("*");
						System.out.print("   ");
						top++;
					}*/
					else
					{
						System.out.print("   ");
					}
				/*	if(i%2==0 && j%2==0)
					{
						if(count == i)
						{
							System.out.print("*");
							System.out.print("   ");
						}
					}
					else if(i%2!=0 && j%2!=0)
					{
						System.out.print("*");
						System.out.print("   ");
					}*/
				}
				else
				{
					System.out.print("   ");
				}
			}
			count = count+1;
			System.out.println();
		}
	}
}
