import java.util.*;

public class KadeanesAlgorithmSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Elements: ");
        int n = sc.nextInt();
        int Elements[] = new int[n];
        System.out.println("Enter Elements: ");
        for(int i=0; i<n; i++){
            Elements[i] = sc.nextInt();
        }
        int MaxSum = KadeanesAlgorithm(Elements);
        System.out.println("Max Sum of subarray: " + MaxSum);
    }
    
    public static int KadeanesAlgorithm(int Elements[]){
        int CurrentSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        for(int i=0; i<Elements.length; i++){
            CurrentSum = CurrentSum + Elements[i];
            if(CurrentSum<0){
                CurrentSum = 0;
            }
            MaxSum = Math.max(CurrentSum,MaxSum);
        }
        return MaxSum;
    }
}
