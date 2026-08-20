/*
Write a program to reverse the elements of a given 2*2 array. Four integer numbers needs to be
passed as Command line arguments.

Example1)

C:\>java Sample 1 2 3

O/P: Please enter 4 integer numbers

Example2)

C:\>java Sample 1 2 3 4

O/P:

The given array is :
1 2
3 4

The reverse of the array is :
4 3
2 1
*/

public class Assignment13{
    public static void main(String args[]){
        if(args.length != 4){
            System.out.println("Please enter 4 integer numbers");
            System.exit(0);
        }

        int i;
        int j;
        int k = 0;
        int[][] a = new int[2][2];

        for (i = 0; i<2; i++)
            for (j = 0; j<2; j++)
                a[i][j] = Integer.parseInt(args[k++]);

        System.out.println("Input array:");
        for (i = 0; i<2; i++){
            for (j = 0; j<2; j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }

        for (i = 0; i<2; i++)
            for (j = 0; j<1; j++){
                k = a[i][j];
                a[i][j] = a[Math.abs(i-1)][Math.abs(j-1)];
                a[Math.abs(i-1)][Math.abs(j-1)] = k;
            }
        
        System.out.println("Output array:");
        for (i = 0; i<2; i++){
            for (j = 0; j<2; j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }        
    }
}