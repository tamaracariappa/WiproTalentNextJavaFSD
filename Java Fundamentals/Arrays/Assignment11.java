/*
Given an array of type int, print true if every element is 1 or 4.

only14([1, 4, 1, 4]) -> true
only14([1, 4, 2, 4]) -> false
only14([1, 1]) -> true
*/

public class Assignment11{
    public static void main(String args[]){
        int[] a = new int[] {1, 1};

        for(int i:a){
            if(!(i==1 || i==4)){
                System.out.println("false");
                System.exit(0);
            }
        }
        System.out.println("true");
    }
}