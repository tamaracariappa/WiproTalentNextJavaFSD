/*
A) Write a program to check if a given integer number is Positive, Negative, or Zero.

B) Given two non-negative int values, print true if they have the same last digit,
   such as with 27 and 57.

   lastDigit(7, 17)  -> true
   lastDigit(6, 17)  -> false
   lastDigit(3, 113) -> true
*/

public class Assignment1{
    public static void main(String args[]){
        String ch = args[0];
        switch(ch){
            case "A":
            case "a":
                int n = Integer.parseInt(args[1]);
                if(n>0)
                    System.out.println("Positive");
                else if(n<0)
                    System.out.println("Negative");
                else
                    System.out.println("Zero");
            break;
            case "B":
            case "b":
                int n1 = Integer.parseInt(args[1]);
                int n2 = Integer.parseInt(args[2]);

                if(n1%10 == n2%10)
                    System.out.println(true);
                else
                    System.out.println(false);
            break;
            default:
                System.out.println("Invalid Option");
        }
    }
}