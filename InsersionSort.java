import java.util.*;

public class InsersionSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element: ");
        int n = sc.nextInt();
        int Element[] = new int [n];
        System.out.print("Enter the elements: ");
        for(int i=0; i<n; i++){
            Element[i] = sc.nextInt();
        }
        InsersionSortAlgo(Element);
        InsersionSortPrint(Element);
    }
    public static void InsersionSortAlgo(int Element[]){
        for(int i=1; i<Element.length; i++){
            int current = Element[i];
            int previous = i-1;
            while(previous >= 0 && Element[previous] > current){
                Element[previous+1] = Element[previous];
                previous--;
            }
            Element[previous + 1] = current;
        }
    }
    public static void InsersionSortPrint(int Element[]){
        for(int i=0; i<Element.length; i++){
            System.out.print(Element[i] + " ");
        }
    }
}
