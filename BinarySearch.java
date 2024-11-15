import java.util.*;

public class BinarySearch {
    public static int BinarySearchforKey(int Elements[], int Key){
        int start = 0;
        int end = Elements.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            if(Key == Elements[mid]){
                return mid;
            }
            if(Key < Elements[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int Elements[] = new int[n];
        System.out.print("Enter sorted Elements: ");
        for(int i=0; i<n; i++){
            Elements[i] = sc.nextInt();
        }
        System.out.print("Enter the key: ");
        int Key = sc.nextInt();
        int index = BinarySearchforKey(Elements, Key);
        if(index == -1){
            System.out.println(Key + "Key not found");
        }
        else{
            System.out.println(Key + " Key is found at index " + index);
        }
    }
}
