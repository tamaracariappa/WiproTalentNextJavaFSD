/*
Write a program to print the sum of all the digits of a given number.

Example1)
I/P:1234
O/P:10
*/

public class Assignment14{
    public static void main(String args[]){
        int num = Integer.parseInt(args[0]);
        int sum = 0;
        int numtemp = num;
        while(numtemp>0){
            sum += numtemp%10;
            numtemp /=10;
        }
        System.out.println("Sum: "+sum);
    }
}