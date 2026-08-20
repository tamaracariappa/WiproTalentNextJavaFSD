/*
Write a program to find the biggest number in a 3*3 array. The program is supposed to receive 9
integer numbers as command line arguments.

Example1:

C:\>java Sample 1 2 3

O/P: Please enter 9 integer numbers

Example2:

C:\>java Sample 1 23 45 55 121 222 56 77 89

O/P:

The given array is :
1 23 45
55 121 222
56 77 89

The biggest number in the given array is 222
*/

public class Assignment14{
    public static void main(String args[]){
        int[][] x = new int[3][3];
        int k = 0;
        if(args.length !=9 ){
            System.out.println("Please enter 9 integer numbers");
            System.exit(0);
        }
        for(int i = 0; i<3; i++)
            for(int j = 0; j<3; j++)
                x[i][j] = Integer.parseInt(args[k++]);
        
        int max = x[0][0];
        for(int i = 0; i<3; i++)
            for(int j = 0; j<3; j++)
                if(x[i][j]>max)
                    max = x[i][j];

        System.out.println("The given array is :");
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++)
                System.out.print(x[i][j]+" ");
            System.out.println();
        }

        System.out.println("The biggest number in the given array is "+max);
    }
}