import java.util.*;

public class LinearSearch {
    public static int LinearSearchForKey(int Elements[], int Key){
        for(int i=0; i<Elements.length ; i++){
            if(Elements[i] == Key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of elements: ");
        int n =sc.nextInt();
        int Elements[] = new int[n];

        System.out.print("Enter Elements: ");
        for(int i=0; i<n; i++){
            Elements[i] = sc.nextInt();
        }
        
        System.out.print("Enter Key for Search: ");
        int Key = sc.nextInt();

        int index = LinearSearchForKey(Elements,Key);

        if(index==-1){
            System.out.println(Key + " Key not found ");
        }
        else{
            System.out.println(Key + " Key found at index " + index);
        }
    }
}
