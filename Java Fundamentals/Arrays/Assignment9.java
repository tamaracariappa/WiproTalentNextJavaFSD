/*
Print a version of the given array where all the 10's have been removed. The remaining elements
should shift left towards the start of the array as needed, and the empty spaces at the end of the
array should be 0. So {10, 10, 2} yields {2, 0, 0}. You may modify and display the given array
or make a new array.

withoutTen([1, 10, 10, 2]) -> [1, 2, 0, 0]
withoutTen([1, 2, 10]) -> [1, 2, 0]
withoutTen([1, 99, 10]) -> [1, 99, 0]
*/

import java.util.Arrays;
public class Assignment9{
    public static void main(String args[]){
        int[] a = new int[] {1, 9, 0};
        int[] without10 = new int[a.length];
        int j = 0;
        Arrays.fill(without10, 0);

        for(int i:a){
            if(i != 10)
                without10[j++] = i;
        }

        System.out.println("Without 10: ");
        for(int i = 0; i<a.length; i++)
            System.out.print(without10[i]+"\t");
    }
}