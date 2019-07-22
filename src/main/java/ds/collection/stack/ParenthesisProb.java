package ds.collection.stack;

import java.util.Stack;

public class ParenthesisProb {


	static boolean isValid(char ch)
	{
		if(ch=='(' || ch=='{' || ch=='[' || ch==')' || ch=='}' || ch==']')
		{
			return true;
		}
		return false;
	}

	static boolean validToPush(char ch)
	{
		if(ch=='(' || ch=='{' || ch=='[')
		{
			return true;
		}
		return false;
	}
	
	static boolean isBalanceBracket(char char1 ,char char2)
	{
		if(char1=='(' && char2 ==')')
		{
			return true;
		}
		if(char1=='{' && char2 =='}')
		{
			return true;
		}
		if(char1=='[' && char2 ==']')
		{
			return true;
		}
		return false;
	}
	public static boolean isBalance(String str)
	{
		Stack<Character> stack = new Stack<>();

		char[] charArr = str.toCharArray();
		stack.push(charArr[0]);
		int i=1;
		while(i<charArr.length)
		{
			char currChar = charArr[i];
			if(isValid(currChar))
			{
				if(validToPush(currChar)) // to check if current parenthesis is start parenthesis
				{
					stack.push(currChar);
				}
				else
				{
					if(stack.isEmpty())
					{
						return false;
					}
					char temp = stack.pop();
					if(!isBalanceBracket(temp,currChar)) // if not start parenthesis then pop element from stack and check for balance parenthesis
					{
						return false;
					}
					
				}

			}
			i++;
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		String str = "[{(){}5(7)()}]";
		
		System.out.println(isBalance(str));
	}
}
