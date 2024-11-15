import java.util.*;

public class Question1BubbleSort {
    public static void BubbleSort(int Element[]){
        for(int turn=0; turn<Element.length; turn++){
            for(int i=0; i<Element.length-1-turn; i++){
                if(Element[i]<Element[i+1]){
                    int temp = Element[i];
                    Element[i] = Element[i+1];
                    Element[i+1] = temp;
                }
            }
        }
    }
    public static void Print(int Element[]){
        System.out.print("Sorted elements : ");
        for( int i=0; i<Element.length; i++){
            System.out.print(Element[i] + " ");
        }
        System.out.println(" ");
    }
    public static void main(String args[]){
        int Element[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        BubbleSort(Element);
        Print(Element);
    }
}
