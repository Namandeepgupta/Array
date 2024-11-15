import java.util.*;

public class PairInArray {
    public static int PairArray(int element[]){
        int tp = 0;
        for(int i=0; i<element.length; i++){
            int n1 = element[i];
            for(int j=i+1; j<element.length; j++){
                int n2 = element[j];
                System.out.print("(" + n1 + "," + n2 +") ");
                tp++;
            }
            System.out.println("");
        }
        return tp;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of element: ");
        int n = sc.nextInt();
        int element[] = new int[n];
        System.out.print("Enter elements: ");
        for(int i=0; i<n; i++){
            element[i] = sc.nextInt();
        }
        int tp = PairArray(element);
        System.out.println("Total pair: " + tp);
    }
}
