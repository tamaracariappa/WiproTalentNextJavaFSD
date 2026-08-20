/*
Write a program to print the sum of the elements of an array following the given below condition.

If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider
the other numbers for calculation of sum.

Eg1) Array Elements - 10,3,6,1,2,7,9
O/P: 22
[i.e 10+3+9]

Eg2) Array Elements - 7,1,2,3,6
O/P:19

Eg3) Array Elements - 1,6,4,7,9
O/P:10
*/

import java.util.Arrays;

public class Assignment8{
    public static void main(String args[]){
        int[] a = new int[] {1,6,6,4,7,9};
        int sum = 0;
        int sum6 = 0;
        boolean flag6 = false;

        for(int i = 0; i<a.length; i++){
            sum += a[i];

            if(a[i] == 6 && !flag6){
                flag6 = true;
                sum6+=a[i];
            }
            else if(a[i] == 6 && flag6){
                sum6 = a[i];
            }
            else if(a[i] == 7 && flag6 ){
                sum = sum - sum6 - 7;
                sum6 = 0;
                flag6 = false;
            }
            else if(flag6){
                sum6+=a[i];
            }
        }

        System.out.println(sum);
    }
}