/*
Write a program to print prime numbers between 10 and 99.
*/

public class Assignment13{
    public static void main(String args[]){
        for(int n = 10; n<99; n++){
            boolean flag = true;
            for(int i = 2; i<n; i++){
                if(n%i==0)
                    flag = false;
            }
            if(flag)
                System.out.println(n);
        }
    }
}