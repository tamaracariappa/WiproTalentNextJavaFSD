/*
Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.
*/

public class Assignment5{
    public static void main(String args[]){
        int[] n = new int[] {10, 34, 23, 45, 89, 97, 36};

        int max1 = n[0];
        int max2 = n[1];
        int min1 = n[0];
        int min2 = n[1];

        for(int i:n){
            if(i>max1){
                max2 = max1;
                max1 = i;
            }
            else if(i>max2)
                max2 = i;

            if(i<min1){
                min2 = min1;
                min1 = i;
            }
            else if(i<min2)
                min2 = i;
        }

        System.out.println("Largest: "+max1+"\nSecond Largest: "+max2+"\nSmallest: "+min1+"\nSecond Smallest: "+min2);

    }
}