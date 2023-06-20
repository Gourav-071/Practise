//modifieds
//Kadane optimised approach for max sub-array
// Note: He told if negative occurs then take 0 as current sum

import java.util.*;

public class KadaneMax {

    public static void kadane() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }

        int maxsum = Integer.MIN_VALUE;
        int cursum = 0;
        for (int i = 0; i < arr.length; i++) {
            cursum = cursum + arr[i];
            if(maxsum<cursum)
            {
                maxsum=cursum;
                int a=sc.ne
            }
            if (cursum < 0) {
                cursum = 0;
            }
           
            maxsum = Math.max(cursum, maxsum);
        }
        System.out.println("Maximum Sum is:" + maxsum);

    }

    public static void main(String args[]) {

        kadane();
    }
}