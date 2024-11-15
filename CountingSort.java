import java.util.*;

public class CountingSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Elements: ");
        int n = sc.nextInt();
        int Element[] = new int[n];
        System.out.print("Enter the Elements: ");
        for(int i=0; i<n; i++){
            Element[i] = sc.nextInt();
        }
        CountingSort(Element);
        CountingSortPrint(Element);
    }
    public static void CountingSort(int Element[]){
        //largest
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<Element.length; i++){
            largest = Math.max(largest, Element[i]);
        }
        //frequency
        int Frequency[] = new int [largest + 1];
        for(int i=0; i<Element.length; i++){
            Frequency[Element[i]]++;
        }
        //sorting
        int j = 0;
        for(int i=0; i<Frequency.length; i++){
            while (Frequency[i]>0) {
                Element[j] = i;
                j++;
                Frequency[i]--;    
            }
        }
    }
    public static void CountingSortPrint(int Element[]){
        System.out.print("Sorted Elements: ");
        for(int i=0; i<Element.length; i++){
            System.out.print(Element[i] + " ");
        }
        System.out.println(" ");
    }
}
