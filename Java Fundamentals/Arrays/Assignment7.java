/*
Write a program to remove the duplicate elements in an array and print the same.

Example)

I/P:{12,34,12,45,67,89}
O/P:{12,34,45,67,89}
*/

 public class Assignment7{
    public static void main(String args[]){
        int[] a = new int[] {12,34,12,45,67,89};
        
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<i; j++){
                if(a[i]==a[j])
                    a[i] = -1;
            }
        }

        System.out.print("O/P:{");
        for(int i:a)
            if(i!=-1)
                System.out.print(i+",");
        
        System.out.print("}");
    }
 }