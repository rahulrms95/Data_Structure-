package ds.practice.number;

import java.util.Arrays;

import ds.practice.array.ArrayUtility;

public class SecondLargest {


	static int secondLargest(int num)
	{
		int result = 0;

		int[] digits = NumberUtility.toDigitArray(num);
		ArrayUtility.print(digits);
		int firstMax = digits[0];
		int start = 0;
		int firstIndex =0;
		while(start<digits.length && firstMax<=digits[start]) 
		{
			firstMax = digits[start];
			firstIndex = start;
			start++;
		}
		int size = digits.length-1;
		int lastIndex = digits.length-1;
		int lastDiff = Integer.MAX_VALUE;
		while(size>=firstIndex)
		{
			int currentDiff = firstMax - digits[size];
			if(currentDiff>0 && lastDiff>currentDiff)
			{
				lastIndex = size;
				lastDiff = currentDiff;
			}
			size--;
		}

		int temp = digits[firstIndex];
		digits[firstIndex] = digits[lastIndex];
		digits[lastIndex] = temp;
		//	ArrayUtility.print(digits);

		for(int j=firstIndex+1;j<digits.length;j++)
		{
			for(int k=j+1;k<digits.length;k++)
			{
				if(digits[j]<digits[k])
				{
					temp = digits[j];
					digits[j] = digits[k];
					digits[k] = temp;
				}
			}
		}
		ArrayUtility.print(digits);
		System.out.println(NumberUtility.toNumberFromDigits(digits));
		return result;
	}


	static int secondLargest_(int num)
	{
		int result = 0;
		int[] digits = NumberUtility.toDigitArray(num);
		ArrayUtility.print(digits);
		int firstIndex = 0;
		for(int i=digits.length-1;i>=0;i--)
		{
			//int currNum = digits[i];
			for(int j=i-1;j>=0;j--)
			{
				if(digits[j]>digits[i])
				{
					int temp = digits[i];
					digits[i] = digits[j];
					digits[j] = temp;
					firstIndex = j;
					break;
				}
			}
			if(firstIndex>0)
			{
				break;
			}
		}

		if(firstIndex>0)
		{
			for(int j=firstIndex+1;j<digits.length;j++)
			{
				for(int k=j+1;k<digits.length;k++)
				{
					if(digits[j]<digits[k])
					{
						int temp = digits[j];
						digits[j] = digits[k];
						digits[k] = temp;
					}
				}
			}
		}
		ArrayUtility.print(digits);
		System.out.println(NumberUtility.toNumberFromDigits(digits));

		return result;
	}

	public static void main(String[] args) {

		int num = 7514302;
		int num1 = 12345;
		secondLargest_(num1);
	}

}
