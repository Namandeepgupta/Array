import java.util.*;

public class DiagonalSumn {
    public static void main(String args[]){
        int Element[][] = {{1,2,3},
                           {4,5,6},
                           {7,8,9}};
        System.out.println("Diagonal Sum: " + DiagonalSum(Element));
    }
    public static int DiagonalSum(int Element[][]){
        int sum = 0;
        for(int i=0; i<Element.length; i++){
            sum += Element[i][i];
            if(i != Element.length-1-i){
                sum += Element[i][Element.length-1-i];
            }
        }
        return sum;
    }
}
