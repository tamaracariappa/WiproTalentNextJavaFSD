/*
Write a program to initialize an array and print them in a sorted order.
*/

import java.util.Arrays;
public class Assignment6{
    public static void main(String args[]){
        int[] n = new int[] {10, 34, 23, 45, 89, 97, 36};
        Arrays.sort(n);

        for(int i:n)
            System.out.println(i);
    }
}