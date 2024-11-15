import java.util.*;
import java.util.Arrays;

public class InbuiltSortWithIndex {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Elements: ");
        int n = sc.nextInt();
        int Element[] = new int [n];
        System.out.print("Enter the Elements: ");
        for(int i=0; i<n; i++){
            Element[i] = sc.nextInt();
        }
        System.out.print("Start sorting from: "); 
        int x = sc.nextInt();
        System.out.print("Upto: ");
        int y = sc.nextInt();
        SortingSomeNumbers(Element, x-1, y);
    }
    public static void SortingSomeNumbers(int Element[],int x, int y){
        Arrays.sort(Element, x, y);
        System.out.print("Sorted some Elements: ");
        for(int i=0; i<Element.length; i++){
            System.out.print(Element[i] + " ");
        }
        System.out.println(" ");
    }
}
