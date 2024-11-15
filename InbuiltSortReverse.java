import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class InbuiltSortReverse {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number of Elements: ");
        int n = sc.nextInt();
        Integer Elements[] = new Integer [n];
        System.out.print("Enter the Elements: ");
        for(int i=0; i<n; i++){
            Elements[i] = sc.nextInt();
        }
        SortingReverse(Elements);
    }
    public static void SortingReverse(Integer Element[]){
        Arrays.sort(Element,Collections.reverseOrder());
        System.out.print("The sorted Elements: ");
        for(int i=0; i<Element.length; i++){
            System.out.print(Element[i] + " ");
        }
        System.out.println(" ");
    }
}
