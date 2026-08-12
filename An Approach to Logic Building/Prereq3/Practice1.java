/*  Print the below shape on a console window [10 rows, triangle with increasing numbers and decreasing alphabet sequence]:
*/

public class Practice1{
    public static void main(String args[]){
        int i, j, k, l;

        for(i = 0; i<10; i++){
            for(k = 10-i; k>=0; k--){
                System.out.print(" ");
            } 
            for(j = 0; j<=i; j++){
                System.out.print(j+1);
            }
            for(l = i-1; l>=0; l--){
                System.out.print((char)('A'+l));
            }
            System.out.println();
        }
    }
}