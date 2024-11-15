import java.util.*;

public class SpiralMatrix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix,");
        System.out.print("Rows: ");
        int n = sc.nextInt();
        System.out.print("Column: ");
        int m = sc.nextInt();
        int Element [][] = new int [n][m];
        System.out.print("Enter the elements of matrix: ");
        for(int i=0; i<Element.length; i++){
            for(int j=0; j<Element[0].length; j++){
                Element[i][j] = sc.nextInt();
            }
        }
        Matrix(Element);
        SpiralMatrix(Element);
    }
    public static void Matrix(int Element[][]){
        for(int i=0; i<Element.length; i++){
            for(int j=0; j<Element[0].length; j++){
                System.out.print(Element[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    public static void SpiralMatrix(int Element[][]){
        int startrow = 0;
        int startcolumn = 0;
        int endrow = Element.length-1;
        int endcolumn = Element[0].length-1;
        while (startrow <= endrow && startcolumn <= endcolumn) {
            //top
            for(int j=startcolumn; j<=endcolumn; j++){
                System.out.print(Element[startrow][j] + " ");
            }
            //right
            for(int i=startrow+1; i<=endrow; i++){
                System.out.print(Element[i][endcolumn] + " ");
            }
            //bottom
            for(int j=endcolumn-1; j>=startcolumn; j--){
                if(startcolumn == endcolumn){
                    break;
                }
                System.out.print(Element[endrow][j] + " ");
            }
            //left
            for(int i=endrow-1; i>=startrow+1; i--){
                if(startrow == endrow){
                    break;
                }
                System.out.print(Element[i][startcolumn] + " ");
            }
            startrow++;
            startcolumn++;
            endrow--;
            endcolumn--;
        }
    }
}
