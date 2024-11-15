import java.util.*;

public class DiagonalSumn2 {
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
        System.out.print("Diagonal Sum: " + DiagonalSum(Element));
    }
    public static void Matrix(int Element[][]){
        for(int i=0; i<Element.length; i++){
            for(int j=0; j<Element[0].length; j++){
                System.out.print(Element[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    public static int DiagonalSum(int Element[][]){
        int sum = 0;
        for(int i=0; i<Element.length; i++){
            for(int j=0; j<Element[0].length; j++){
                if(i==j){
                    sum += Element[i][j];
                }
                else if(i+j == Element.length-1 && i != j){
                    sum += Element[i][j];
                }
            }
        }
        return sum;
    }
}
//time comlexity = n^2;
//brute force;
