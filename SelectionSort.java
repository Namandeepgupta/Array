import java.util.*;

public class SelectionSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int Element[] = new int [n];
        System.out.print("Enter the elements: ");
        for(int i=0; i<n; i++){
            Element[i] = sc.nextInt();
        }
        SelectionSortAlgo(Element);
        SelectionSortPrint(Element);
    }
    public static void SelectionSortAlgo(int Element[]){
        for(int i=0; i<Element.length-1; i++){
            int minpos = i;
            for(int j=i+1; j<Element.length; j++){
                if(Element[j]<Element[minpos]){
                    minpos = j;
                }
            }
            int swap = Element[minpos];
            Element[minpos] = Element[i];
            Element[i] = swap;
        }
    }
    public static void SelectionSortPrint(int Element[]){
        for(int i=0; i<Element.length; i++){
            System.out.print(Element[i] + " ");
        }
        System.out.println("");
    }
}
