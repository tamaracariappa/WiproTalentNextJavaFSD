/*  Print the below shape on a console window [10 rows, right-angled left-justified numbers]:
*/

public class Problem1{
    public static void main(String args[]){
        int i, j;

        for(i = 0; i<10; i++){
            for(j = 0; j<=i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}