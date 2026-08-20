/*
Write a program to initialize an integer array and print the sum and average of the array.
*/

public class Assignment1{
    public static void main(String args[]){
        int[] x = new int[] {1, 2, 3, 4, 5, 6, 7};
        int sum = 0; 
        double avg;

        for(int i : x)
            sum+=i;
        avg = sum/x.length;
        
        System.out.println("Sum: "+sum+"\nAvg: "+avg);
    }
}