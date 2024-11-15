import java.util.*;

public class SubarraySumBruteForce {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int Elements[] = new int[n];
        System.out.print("Enter Elements: ");
        for(int i=0; i<n; i++){
            Elements[i] = sc.nextInt();
        }
        int maxSum = SubwayArray(Elements);
        System.out.println("Maxsum SubArrays: " + maxSum);
    }
    public static int SubwayArray(int Elements[]){
        int maxSum = Integer.MIN_VALUE;
        int CurrentSum = 0;
        for(int i=0; i<Elements.length; i++){
            for(int j=i; j<Elements.length; j++){
                CurrentSum = 0;
                for(int k=i; k<=j; k++){
                    System.out.print(Elements[k] + " ");
                    CurrentSum += Elements[k];
                }
                System.out.println("");
                System.out.println("Current Sum = " + CurrentSum);
                if(CurrentSum > maxSum){
                    maxSum = CurrentSum;
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }
        return maxSum;
    }
}
