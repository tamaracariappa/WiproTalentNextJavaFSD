/*
Initialize a character variable with an alphabet in a program.

If the character value is in lowercase, the output should be displayed in uppercase
in the following format.

Example1)
i/p:a
o/p:a->A

If the character value is in uppercase, the output should be displayed in lowercase
in the following format.

Example2)
i/p:A
o/p:A->a
*/

public class Assignment7{
    public static void main(String args[]){
        char c = args[0].charAt(0);

        if(Character.isUpperCase(c))
            System.out.println(c+"->"+Character.toLowerCase(c));
        else if(Character.isLowerCase(c))
            System.out.println(c+"->"+Character.toUpperCase(c));
        else
            System.out.println("Invalid Character");
    }
}