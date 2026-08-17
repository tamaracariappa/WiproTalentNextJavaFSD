/*
Initialize a character variable in a program and

print 'Alphabet' if the initialized value is an alphabet,
print 'Digit' if the initialized value is a number, and
print 'Special Character', if the initialized value is anything else.
*/

public class Assignment5{
    public static void main(String args[]){
        char c = args[0].charAt(0);

        if(Character.isLetter(c))
            System.out.println("Alphabet");
        else if(Character.isDigit(c))
            System.out.println("Digit");
        else
            System.out.println("Special Character");
    }
}