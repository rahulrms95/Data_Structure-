package ds.practice.algo;

public class ShortestPath {

	public static int shortestPath(int mat[][],int i,int j,int result)
	{
		if(i<0 && j<0)
		{
			return result;
		}
		if(i>0 && j<0)
		{
			shortestPath(mat, i-1, j, result+mat[i][j]);
			shortestPath(mat, i, j-1, result+mat[i][j]);
		}
		else 	if(i>0 && j<0)
		{
			shortestPath(mat, i-1, j, result+mat[i][j]);
			shortestPath(mat, i, j-1, result+mat[i][j]);
		}
		return Math.max(shortestPath(mat, i-1, j, result+mat[i][j]),shortestPath(mat, i, j-1, result+mat[i][j]));
	}

	public static void main(String[] args) {
		int mat[][] = {{1,1,1,1},{1,0,1,1},{1,1,0,0},{1,1,1,1}};
		try
		{
			System.out.println(shortestPath(mat, 3, 3, 0));
		}
		catch(Exception e)
		{

		}
	}
}
