package ds.practice.matrix;

public class LCS {


	public static int maxLCS(String str1,String str2)
	{
		int count = 0;

		int mat[][] = new int[str1.length()+1][str2.length()+1];

		for(int i=1;i<=str1.length();i++)
		{
			mat[i][0] = (int)str1.charAt(i-1); 
		}
		for(int j=1;j<=str2.length();j++)
		{
			mat[0][j] = (int)str2.charAt(j-1); 
		}

		int i=1,j=1;
		char arr[] = new char[10];
		while(i<=str1.length())
		{
			if(j > str2.length())
			{
				i++;
				j=0;
			}

			if(mat[i][0] == mat[0][j])
			{
				mat[i][j] = count;
				arr[count] = (char)mat[i][0];
				i++;
				j++;
				count++;
			}
			else
			{
				j++;
			}

		}

		System.out.println(new String(arr));
		return count;
	}
	
	public static void main(String[] args) {
		
		String str2 = "AGGTAB";
		String str1 = "GXTXAYB";
		System.out.println(maxLCS(str1, str2));
	}
}
