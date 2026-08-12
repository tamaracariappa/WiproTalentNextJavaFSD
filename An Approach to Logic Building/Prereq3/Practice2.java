/*  Print the below shape on a console window [10 rows, rhombus with increasing and decreasing numbers]:
*/

public class Practice2{
    public static void main(String args[]){
        int i, j, k, l;

        for(i = 0; i<10; i++){
            for(k = 10-i; k>=0; k--){
                System.out.print(" ");
            } 
            for(j = 0; j<=i; j++){
                System.out.print(j+1);
            }
            for(l = i; l>0; l--){
                System.out.print(l);
            }
            System.out.println();
        }
        for(i = 9; i>0; i--){
            for(k = 10-i; k>=0; k--){
                System.out.print(" ");
            } 
            for(j = 0; j<i; j++){
                System.out.print(j+1);
            }
            for(l = i-1; l>0; l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}