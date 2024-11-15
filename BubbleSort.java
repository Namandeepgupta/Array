import java.util.*;

public class BubbleSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Elements: ");
        int n = sc.nextInt();
        int Element[] = new int [n];
        System.out.print("Enter the Elements: ");
        for(int i=0; i<n; i++){
            Element[i] = sc.nextInt();
        }
        BubbleSort(Element);
        Print(Element);
    }
    public static void BubbleSort(int Element[]){
        for(int turn=0; turn<Element.length-1; turn++){
            for(int i=0; i<Element.length-1-turn; i++){
                if(Element[i]>Element[i+1]){
                    int temp = Element[i];
                    Element[i] = Element[i+1];
                    Element[i+1] = temp;
                }
            }
        }
    }
    public static void Print(int Element[]){
        System.out.print("Elements: ");
        for(int i=0; i<=Element.length-1; i++){
            System.out.print(Element[i] + " ");
        }
        System.out.println("");
    }
}
