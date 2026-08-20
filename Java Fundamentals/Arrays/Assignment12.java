/*
Given 2 int arrays, a and b, each length 3, form a new array of length 2, containing their middle
elements.

middleWay([1, 2, 3], [4, 5, 6]) -> [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) -> [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) -> [2, 4]
*/

public class Assignment12{
    public static void main(String args[]){
        int[] a = new int[] {7, 7, 7};
        int[] b = new int[] {3, 8, 0};

        int[] c = new int[] {a[1], b[1]};

        for (int i: c)
            System.out.print(i+" ");
    }
}