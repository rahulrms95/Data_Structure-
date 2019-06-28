package ds.practice.string;
/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
 */
        //Scanner
        Scanner s = new Scanner(System.in);
        //int N = s.nextInt();                 // Reading input from STDIN
        //s.nextLine();
        
        String str1 = "aaxaabc"; //s.nextLine();
        String str2 = "aabcaax"; //s.nextLine();
        System.out.println(solution(str1,str2));

        // Write your code here

    }
    
    public static int solution(String str1, String str2)
    {
        if(str1.length() != str2.length() || str1.equals(str2))
        {
            return 0;
        }
        char[] strArray = str1.toCharArray();
        int result = 0;
        int i =0;
        while(true)
        {
        	if(result == strArray.length)
        	{
        		return 0;
        	}
            char removed = strArray[i];
            int j = 0;
            int templen = strArray.length;
            while(j<templen-1)
            {
                strArray[j] = strArray[j+1];
                j++;
            }
            strArray[j] = removed;
            result++;
            if(new String(strArray).equals(str2))
            {
                return result;
            }
            
        }
        
    }
}
