import java.util.*;
import java.util.Arrays;

public class InbuiltSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Elements: ");
        int n = sc.nextInt();
        int Element[] = new int [n];
        System.out.print("Enter the Elements: ");
        for(int i=0; i<n; i++){
            Element[i] = sc.nextInt();
        }
        Sorting(Element);
    }
    public static void Sorting(int Element[]){
        Arrays.sort(Element);
        System.out.print("Sorted Elements: ");
        for(int i=0; i<Element.length; i++){
            System.out.print(Element[i] + " ");
        }
        System.out.println("");
    }
}
