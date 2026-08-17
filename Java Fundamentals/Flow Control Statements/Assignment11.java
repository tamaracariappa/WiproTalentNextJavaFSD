/*
Write a program to print even numbers between 23 and 57.
Each number should be printed in a separate row.
*/

public class Assignment11{
    public static void main(String args[]){
        for(int i = 23; i<57; i++)
            if(i%2==0)
                System.out.println(i);
        AlternateMethod();
    }

    public static void AlternateMethod(){
        for(int i = 24; i<57; i+=2)
            System.out.println(i);
    }
}