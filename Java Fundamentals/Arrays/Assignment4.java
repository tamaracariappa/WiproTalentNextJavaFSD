/*
Initialize an integer array with ascii values and print the corresponding character values in a
single row.
*/

public class Assignment4{
    public static void main(String args[]){
        int[] ascii = new int[] {10, 34, 23, 45, 89, 97, 36};

        for(int i : ascii)
            System.out.print((char)i+" ");
    }
}
