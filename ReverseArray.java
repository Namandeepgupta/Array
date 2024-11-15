import java.util.*;

public class ReverseArray {
    public static void ReverseOfArray(int Elements[]){
        int first = 0;
        int last = Elements.length-1;
        while(first<last){
            int temp = Elements[last];
            Elements[last] = Elements[first];
            Elements[first] = temp; 
            first++;
            last--;
        }
    } 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of Elements: ");
        int n = sc.nextInt();
        int Elements[] = new int [n];
        System.out.print("Enter Elements: ");
        for(int i=0; i<n; i++){
            Elements[i] = sc.nextInt();
        }
        ReverseOfArray(Elements);
        for(int i=0; i<Elements.length; i++){
            System.out.print(Elements[i] + " ");
        }
        System.out.println("");
    }
}
