package ds.practice.matrix;

import java.util.ArrayList;
import java.util.List;

import ds.practice.array.ArrayUtility;

public class MatrixTraversal {



	public static void main(String[] args) {

		int row = 4;
		int col = 5;
		int mat[][] = {{1,2,3,4,5},
				       {6,7,8,9,10},
				       {11,12,13,14,15},
				       {16,17,18,19,20},
				       {21,22,23,24,25}
		};
		int from[] = {0,0};
		int to[] = {4,5};
		
		System.out.println("Total Cost : "+ new MatrixTraversal().minCost(mat, 0,0));
		//new ArrayUtility().print(new MatrixTraversal().traverseMatSimple(mat, from, to));
	}
	public List<Integer> traverseMatSimple(int mat[][],int from[],int to[])
	{
		List<Integer> result = new ArrayList<>();
		int start = 0;
		int end = 0;
		int index = 0;
		result.add(mat[0][0]);
		while(start<mat[0].length-1 && end < mat.length-1)
		{
			//result[index] = minValue(mat[start+1][end], mat[start][end+1], mat[start+1][end+1]);
			if(mat[start+1][end] > mat[start][end+1])
			{
				if(mat[start][end+1] > mat[start+1][end+1])
				{
					result.add(mat[start+1][end+1]);
					start++;
					end++;
				}
				else
				{
					result.add(mat[start][end+1]);
					end++;
				}
			}
			else
			{
				if(mat[start+1][end] > mat[start+1][end+1])
				{
					result.add(mat[start+1][end+1]);
					start++;
					end++;
				
				}
				else
				{
					result.add(mat[start+1][end]);
					start++;
				}
			}
			index++;
		}
		result.add(mat[mat[0].length-1][mat.length-1]);
		return result;
	}

	public int minCost(int [][]mat,int i,int j)
	{
		
		if(i==mat[0].length-1 || j==mat.length-1)
		{
			//System.out.println(mat[i][j]);
			return mat[i][j];
		}
		else
		{
			return Math.min(minCost(mat, i+1, j), minCost(mat, i, j+1))+mat[i][j];
		}
	}
	
}
