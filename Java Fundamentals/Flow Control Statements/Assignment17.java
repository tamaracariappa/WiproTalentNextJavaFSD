/*
Write a Java program to find if the given number is palindrome or not.

Example1)

C:\>java Sample 110011

O/P: 110011 is a palindrome

Example2)

C:\>java Sample 1234

O/P: 1234 is not a palindrome
*/

public class Assignment17{
    public static void main(String args[]){
        int num = Integer.parseInt(args[0]);
        int pow = args[0].strip().length() -1;
        int numtemp = num;
        int pal = 0;
        int dig;

        while(numtemp!=0){
            dig = numtemp%10;
            pal += dig * Math.pow(10,pow--);
            numtemp /= 10;
        }

        if(pal == num)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}