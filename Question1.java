import java.util.*;

public class Question1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Element: ");
        int n = sc.nextInt();
        int Element[] = new int [n];
        System.out.print("Enter elements: ");
        for(int i=0; i<n; i++){
            Element[i] = sc.nextInt();
        }
        boolean result = RepetedElements(Element);
        System.out.println("Result: " + result);
    }
    public static boolean RepetedElements(int Element[]){
        for(int i=0; i<Element.length; i++){
            for(int j=i+1; j<Element.length; j++){
                if(Element[i] == Element[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
