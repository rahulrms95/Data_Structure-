package ds.practice.matrix;

public class BoarderPattern {

	
	public static void main(String[] args) {
		
		 int[][] mat = printSpiralMat(9);
		print(mat);
	}
	
	public static void print(int mat[][])
	{
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[0].length;j++)
			{
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
	}
	public void printBoarder(int n)
	{
		
	}
	
	public static int[][] printSpiralMat(int n)
	{
		int size = n*2-1;
		int mat[][] = new int[size][size];
		
		int top = 0;
		int bottom = size-1;
		
		int left = 0;
		int right = size-1;
		
		int row = 0;
		int col = 0;
	
		while(top<=bottom && left <= right)
		{
			col = top;
			while(col<=right)
			{
				mat[top][col] = n;
				col++;
			}
			top++;
			
			row = right;
			while(row>=(size-bottom))
			{
				mat[row][right] = n;
				row--;
			}
			right--;
			
			col = bottom;
			
			while(col>=left)
			{
				mat[bottom][col] = n;
				col--;
			}
			bottom--;
			
			row = size-left-1;
			while(row>=top)
			{
				mat[row][left] = n;
				row--;
			}
			left++;
			
			n--;
		}
		return mat;
	}
	
	public void solution(int n)
    {
        int size = 2*n-1;
        int mat[][] = new int[size][size];
        int top = 0;
        int bottom = size-1;
        int left = 0;
        int right = size-1;
        int row = 0;
        int col = 0;
        while(top<=bottom && left<=right)
        {
            col = top;
            
            while(col<=right)
            {
                mat[top][col] = n;
                col++;
            }
            top++;
            
            row = right;
            
            while(row>=(size-bottom))
            {
                mat[row][right] = n;
                row--;
            }
            right--;
            
            col = bottom;
            
            while(col>=left)
            {
                mat[bottom][col] = n;
                col--;
            }
            bottom--;
            
            row = left;
            
            while(row<=(size-top))
            {
                mat[row][left] = n;
                row++;
            }
            
            left++;
            n--;
        }
    }
}
