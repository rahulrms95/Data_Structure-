package ds.practice.string;

public class ReverseSentenceWord {


	public String reverseString(String str)
	{
		String reverseString = "";
		String[] strArray = str.split(" ");

		int start = 0;
		int end = strArray.length-1;
		while(start<end)
		{
			String temp = strArray[start];
			strArray[start] = strArray[end];
			strArray[end] = temp;
			start++;
			end--;
		}
		for(int i=0;i<strArray.length;i++)
		{
			if(i<strArray.length-1)
			{
				reverseString = reverseString+strArray[i]+" ";
			}
			else
			{
				reverseString = reverseString+strArray[i];	
			}
		}
		return reverseString;
	}

	public static void main(String[] args) {

		String str = "Hello I am Rahul";

		System.out.println(new ReverseSentenceWord().reverseString(str));
	}
}
