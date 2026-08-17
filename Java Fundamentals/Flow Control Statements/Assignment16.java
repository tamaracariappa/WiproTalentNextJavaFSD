/*
Write a program to reverse a given number and print.

Example1)

I/P: 1234
O/P:4321

Example2)

I/P:1004
O/P:4001
*/

public class Assignment16{
    public static void main(String args[]){
        int num = Integer.parseInt(args[0]);
        int pow = args[0].strip().length() -1;
        int numtemp = num;
        int rev = 0;
        int dig;

        while(numtemp!=0){
            dig = numtemp%10;
            rev += dig * Math.pow(10,pow--);
            numtemp /= 10;
        }

        System.out.println("Reverse "+rev);
    }
}