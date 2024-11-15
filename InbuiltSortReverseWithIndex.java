import java.util.*;

public class InbuiltSortReverseWithIndex {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number of Elements: ");
        int n = sc.nextInt();
        Integer Elements[] = new Integer [n];
        System.out.print("Enter the Elements: ");
        for(int i=0; i<n; i++){
            Elements[i] = sc.nextInt();
        }
        System.out.print("Enter the number starting index: ");
        int x = sc.nextInt();
        System.out.print("Upto: ");
        int y = sc.nextInt();
        SortingReverse(Elements,x,y+1);
    }
    public static void SortingReverse(Integer Elements[], int x,int y){
        Arrays.sort(Elements,x,y,Collections.reverseOrder());
        System.out.print("Sortted Elements: ");
        for(int i=0; i<Elements.length; i++){
            System.out.print(Elements[i] + " ");
        }
        System.out.println(" ");
    }
}
