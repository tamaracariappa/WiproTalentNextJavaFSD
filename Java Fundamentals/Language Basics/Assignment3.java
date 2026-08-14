/*
 * Write a Program to accept two integers as command line arguments and print the sum of the two
 * numbers.
 *
 * Example1)
 * C:\>java Sample 10 20
 * O/P Expected : The sum of 10 and 20 is 30
 */

public class Assignment3{
    public static void main(String args[]){
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        System.out.println(n1+n2);
    }
}