import java.util.*;

public class SubwayArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int Elements[] = new int[n];
        System.out.print("Enter Elements: ");
        for(int i=0; i<n; i++){
            Elements[i] = sc.nextInt();
        }
        int ts = SubwayArray(Elements);
        System.out.println("Total number of SubArrays: " + ts);
    }
    public static int SubwayArray(int Elements[]){
        int ts = 0;
        for(int i=0; i<Elements.length; i++){
            for(int j=i; j<Elements.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(Elements[k] + " ");
                }
                System.out.println(" ");
                ts++;
            }
            System.out.println(" ");
        }
        return ts;
    }
}
