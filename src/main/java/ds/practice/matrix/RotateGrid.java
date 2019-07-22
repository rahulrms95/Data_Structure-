package ds.practice.matrix;

public class RotateGrid {

	public static int[][] rotate(int [][] mat)
	{
		int rotated [][] = new int [mat[0].length][mat.length];

		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[0].length;j++)
			{
				rotated[rotated.length-i-1][j] = mat[j][i];
			}
		}
		return rotated;
	}

	public static int[][] rotateInPlace(int mat[][],int degree)
	{
		int rotateCount = 1;
		while(rotateCount>0)
		{
			for(int i=0;i<mat.length;i++)
			{
				for(int j=i;j<mat[0].length;j++)
				{
					int temp = mat[i][j];
					mat[i][j] = mat[j][i];
					mat[j][i] = temp;
				}
			}
			rotateCount--;
		}
		return mat;
	}

	public static void main(String[] args) {

		int mat[][] = {{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}};

		int[][] result = rotateInPlace(mat,90);
		new SpiralMatrix().print(result);

	}
}
