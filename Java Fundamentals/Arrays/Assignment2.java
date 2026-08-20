/*
Write a program to initialize an integer array and find the maximum and minimum value of the array.
*/

public class Assignment2{
    public static void main(String args[]){
        int[] x = new int[] {7, 34, 67, 2, 45, -3, 65};
        int max = x[0];
        int min = x[0];

        for(int i : x){
            if(i>max)
                max = i;
            if(i<min)
                min = i;
        }
        
        System.out.println("Max: "+max+"\nMin: "+min);
    }
}