package ds.practice.others;
import java.util.Scanner;

public class Solution {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        int apple = 0;
        int orange = 0;

        for(int i=0;i<apples.length;i++)
        {
        	int tempValue = a+apples[i];
            if(s<=tempValue && tempValue<=t)
            {
                apple++;
            }
        }
        for(int i=0;i<oranges.length;i++)
        {
        	int tempValue = b+oranges[i];
            if(s<=tempValue && tempValue<=t)
            {
                orange++;
            }
        }
        System.out.println(apple);
        System.out.println(orange);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
     
    	int apples[] = {-2,2,1};
    	int oranges[] = {5,-6};
    	//  7 11
    
        countApplesAndOranges(7, 11, 5, 15, apples, oranges);

    }
}
