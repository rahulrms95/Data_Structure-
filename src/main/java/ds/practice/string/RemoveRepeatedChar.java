package ds.practice.string;

public class RemoveRepeatedChar {

	public static String reduceString(String str)
	{
		StringBuilder result = new StringBuilder(str);
		int i=0;
		while(i<result.length()-1)
		{

			if(result.charAt(i) == result.charAt(i+1))
			{
				result.replace(i,i+2, "");
				i=0;
			}
			else
			{
				i++;
			}
		}
		if(result.toString().equalsIgnoreCase(""))
		{
			return "Empty String";
		}
		
		return result.toString();
	}

	public static void main(String[] args) {

		System.out.println(reduceString("abba"));

		/*	char[] ch = "Hi KR".toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.print((int)ch[i]+" ");
		}
		System.out.println();*/
	}
}
