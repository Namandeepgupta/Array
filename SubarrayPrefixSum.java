import java.util.*;

public class SubarrayPrefixSum {
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
        System.out.println("Prefix Sum: " + maxSum);
    }
    public static int SubwayArray(int Elements[]){
        int maxSum = Integer.MIN_VALUE;
        int CurrentSum = 0;
        int prefix[] = new int[Elements.length];
        prefix[0] = Elements[0]; 
        for(int i=1; i<Elements.length; i++){
            prefix[i] = prefix[i-1] + Elements[i];
        }
        for(int i=0; i<Elements.length; i++){
            for(int j=i; j<Elements.length; j++){
                CurrentSum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
                if(CurrentSum > maxSum){
                    maxSum = CurrentSum;
                }
            }
        }
        return maxSum;
    }
}

