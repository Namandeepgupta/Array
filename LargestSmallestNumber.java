import java.util.*;

public class LargestSmallestNumber {
    public static int LargestNumber(int Elements[]){
        int Largest = Integer.MIN_VALUE;
        for(int i=0; i<Elements.length; i++){
            if(Elements[i]>Largest){
                Largest = Elements[i];
            }
        }
        return Largest;
    }
    public static int SmallestNumber(int Elements[]){
        int Smallest = Integer.MAX_VALUE;
        for(int i=0; i<Elements.length; i++){
            if(Elements[i]<Smallest){
                Smallest = Elements[i];
            }
        }
        return Smallest;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of elements: ");
        int n = sc.nextInt();

        int Elements[] = new int [n];
        System.out.print("Enter elements: ");
        for(int i=0; i<n; i++){
            Elements[i] = sc.nextInt(); 
        }

        int Largest = LargestNumber(Elements);
        System.out.println("Largest number: " + Largest);

        int Smallest = SmallestNumber(Elements);
        System.out.println("Smallest number: " + Smallest);
    }
}
