package ds.practice.algo;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimeNumber {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		sc.nextBigInteger();
	}
	
	 public static String isPrime(BigInteger bnum)
	    {
	        BigInteger i = new BigInteger("2");
	        long j = i.longValue();
	        while(j*j<bnum.longValue())
	        {
	            if(bnum.longValue()%j==0)
	            {
	                return "not prime";
	            }
	            j++;
	        }
	        return "prime";
	    }
}
