import java.util.*;

public class a {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int Element[] = new int [n];
        System.out.print("Enter elements: ");
        for(int i=0; i<n; i++){
            Element[i] = sc.nextInt();
        }
        System.out.print("Enter the number to find: ");
        int target = sc.nextInt();
        int index = searchIndex(Element,target);
        System.out.println(target + " is found at index " + index);
    }
    public static int searchIndex(int Element[],int target){
        int minIndex = MinIndex(Element);
        if(Element[minIndex] <= target && target <= Element[Element.length-1]){
            return BinarySearch(minIndex,Element.length-1,target,Element);
        }
        else{
            return BinarySearch(0,minIndex,target,Element);
        }
    }
    BinarySearch(int start, int end, int target, int Element[]){
        for(int i=0; i<Element.length-1; i++){
            int mid = start + (end-start)/2;
            if(Element[mid] == target){
                return mid;
            }
            else if (Element[mid] < target) {
                start = mid+1;                
            }
            else{
                end = mid-1; 
            }
        }
        return -1;
    }
    public static int MinIndex(int Element[]){
        int start = 0;
        int end = Element.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(mid > 0 && Element[mid] < Element[mid-1]){
                return mid;
            }
            else if (Element[start] <= Element[mid] && Element[end] <= Element[mid]) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return start;
    }
}
