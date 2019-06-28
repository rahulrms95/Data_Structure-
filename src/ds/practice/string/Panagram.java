package ds.practice.string;

public class Panagram {

	char[] alphabetArray; // =new char[26];

	public Panagram()
	{
		alphabetArray =new char[26];
		createAlphabetArray();
	}

	public void createAlphabetArray()
	{
		alphabetArray[0] = 'a';
		alphabetArray[1] = 'b';
		alphabetArray[2] = 'c';
		alphabetArray[3] = 'd';
		alphabetArray[4] = 'e';
		alphabetArray[5] = 'f';
		alphabetArray[6] = 'g';
		alphabetArray[7] = 'h';
		alphabetArray[8] = 'i';
		alphabetArray[9] = 'j';
		alphabetArray[10] = 'k';
		alphabetArray[11] = 'l';
		alphabetArray[12] = 'm';
		alphabetArray[13] = 'n';
		alphabetArray[14] = 'o';
		alphabetArray[15] = 'p';
		alphabetArray[16] = 'q';
		alphabetArray[17] = 'r';
		alphabetArray[18] = 's';
		alphabetArray[19] = 't';
		alphabetArray[20] = 'u';
		alphabetArray[21] = 'v';
		alphabetArray[22] = 'w';
		alphabetArray[23] = 'x';
		alphabetArray[24] = 'y';
		alphabetArray[25] = 'z';
	}
	public String minStringForPanagram(String  str)
	{
		String result = "";

		str = str.toLowerCase(); // convert given String to lower case String 
		char[] charArray = str.toCharArray(); // convert String to char Array
		char[] newCharArray =new char[26];	
		for(int i=0;i<charArray.length;i++)
		{
			//System.out.println((int)charArray[i]);
			if(97<=(int)charArray[i] && (int)charArray[i]<=122)
			newCharArray[(int)charArray[i]-97] =  charArray[i];
			//System.out.println(newCharArray[i]);
		}
		for(int i=0;i<newCharArray.length;i++)
		{
			if(97<=(int)newCharArray[i] && (int)newCharArray[i]<=122)
			{
				
			}
			else
			{
				result = result+alphabetArray[i];
			}
		//	System.out.println(newCharArray[i]);
		}
		return result;
	}

	public static void main(String[] args) {

		//System.out.println(new Panagram().minStringForPanagram("The quick brown fox jumps"));
		System.out.println(new Panagram().fun(778324326));
	}
	
	public int fun(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			return fun(n/2+1);
		}
	}
}
