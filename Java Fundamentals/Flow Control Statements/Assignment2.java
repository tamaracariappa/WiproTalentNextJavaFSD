/*
Write a program to check if a given integer number is odd or even.
*/

public class Assignment2{
    public static void main(String args[]){
        int N = Integer.parseInt(args[0]);
        if(N%2==0)
            System.out.println("EVEN");
        else
            System.out.println("ODD");
    }
}