/*
Write a program to receive a color code from the user (an Alphabet).

The program should then print the color name, based on the color code given.

The following are the color codes and their corresponding color names.
R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White.

If color code provided by the user is not valid then print "Invalid Code".
*/

public class Assignment8{
    public static void main(String args[]){
        String color = args[0];

        switch(color){
            case "r":
            case "R":
                System.out.println("Red");
            break;
            case "b":
            case "B":
                System.out.println("Blue");
            break;
            case "g":
            case "G":
                System.out.println("Green");
            break;
            case "o":
            case "O":
                System.out.println("Orange");
            break;
            case "y":
            case "Y":
                System.out.println("Yellow");
            break;
            case "w":
            case "W":
                System.out.println("White");
            break;
            default:
                System.out.println("Invalid Code");
        }
    }
}