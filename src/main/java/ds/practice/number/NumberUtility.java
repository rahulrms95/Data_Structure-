package ds.practice.number;

import ds.practice.array.ArrayUtility;

public class NumberUtility {

	/**
	 * Convert Given number to its binary representation
	 * 
	 * **/
	public static int[] toBits(int num)
	{
		int bitArray[] = new int[1];
		int i=0;
		while(num>0)
		{
			bitArray = checkArraySize(bitArray,i);
			bitArray[i] = num%2;
			num = num/2;
			i++;
		}
		return ArrayUtility.reverse(bitArray);
	}
	
	public static int bitsToNumber(int bits[])
	{
		int result = 0;
		
		int size = bits.length;
		int i = 0;
		while(i<size)
		{
			result += Math.pow(2,size-i-1)*bits[i];
			i++;
		}
		
		return result;
	}
	
	
	private static int[] checkArraySize(int arr[],int size)
	{
		if(size<arr.length)
		{
			return arr;
		}
		
		size = arr.length+1;
		int temp[] = new int[size];
		
		int i=0;
		while(i<arr.length)
		{
			temp[i] = arr[i];
			i++;
		}
		return temp;
	}
	/**
	 * Convert given number to its digit array
	 * **/
	public static int[] toDigitArray(int num)
	{

		int digitArray[] = new int[(""+num).length()];
		int i=0;
		
		while(num>0)
		{
			digitArray[i] = num%10;
			num = num/10;
			i++;
		}
		
		return ArrayUtility.reverse(digitArray);
	}

	public static int toNumberFromDigits(int digits[])
	{
		int result = 0;
		int size = digits.length-1;
		for(int i=0;i<=size;i++)
		{
			int temp = 1;
			int tempSize = size-i;
			while(tempSize>0)
			{
				temp = temp*10;
				tempSize--;
			}
			result += digits[i]*temp;
		}
		return result;
	}
}
