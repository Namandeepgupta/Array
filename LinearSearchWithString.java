import java.util.*;

public class LinearSearchWithString {
    public static int LinearSearchWithKey(String Element[],String Key){
        for(int i=0; i<Element.length; i++){
            if(Element[i].equals(Key)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        String Elements[] = new String[n];

        System.out.print("Enter Elements: ");
        for(int i=0; i<n; i++){
            Elements[i] = sc.next();
        }

        System.out.print("Enter key: ");
        String Key = sc.next();

        int index = LinearSearchWithKey(Elements,Key);

        if(index == -1){
            System.out.println(Key + " is not found.");
        }
        else{
            System.out.println(Key + " is found at index " + index);
        }
    }
}
