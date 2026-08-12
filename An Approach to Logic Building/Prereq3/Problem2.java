/*  Print the below shape on a console window [10 rows, right-angled right-justified stars]:
*/

public class Problem2{
    public static void main(String args[]){
        int i, j, k;

        for(i = 0; i<10; i++){
            for(k = 10-i; k>=0; k--){
                System.out.print(" ");
            } 
            for(j = 0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}