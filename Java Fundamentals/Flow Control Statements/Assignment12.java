/*
Write a program to check if a given number is prime or not.
*/

public class Assignment12{
    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
        boolean flag = true;

        for(int i = 2; i<n; i++){
            if(n%i==0)
                flag = false;
        }

        if(flag)
            System.out.println("prime");
        else
            System.out.println("not prime");
    }
}