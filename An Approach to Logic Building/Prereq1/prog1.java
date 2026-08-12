/*      prog1: Write a program to accept a number N and print whether the number is EVEN or ODD
*/

public class prog1{
    public static void main(String args[]){
        int N = Integer.parseInt(args[0]);
        if(N%2==0)
            System.out.println("EVEN");
        else
            System.out.println("ODD");
    }
}