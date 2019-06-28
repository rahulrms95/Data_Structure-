package ds.practice.matrix;

import java.util.Scanner;

public class SpiralMatrix {

	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of Rows : ");
		int row = s.nextInt();
		System.out.println("Enter number of Columns : ");
		int col = s.nextInt();
		
		int mat [][] = new int[row][col];
		int value = 1;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				mat[i][j]=value;
				value++;
			}
		}
		SpiralMatrix sm = new SpiralMatrix();
		sm.print(mat);
	}
	
	public void printSpiral(int mat[][])
	{
		int top=0,left=0,right=mat.length,bottom=mat[0].length;
		
		
	}
	
	public void print(int mat[][])
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
}
