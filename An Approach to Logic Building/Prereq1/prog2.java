/*      prog2: Write a program to accept two numbers and print whether their sum is EVEN or ODD
*/

public class prog2{
    public static void main(String args[]){
        int a, b, c;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);

        c = a+b;
        
        if(c%2==0)
            System.out.println("EVEN");
        else
            System.out.println("ODD");
    }
}