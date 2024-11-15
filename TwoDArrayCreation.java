import java.util.*;

public class TwoDArrayCreation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int m = sc.nextInt();
        int Element[][] = new int [n][m];
        System.out.print("Enter the Elements: ");
        for(int i=0; i<Element.length; i++){
            for(int j=0; j<Element[0].length; j++){
                Element[i][j] = sc.nextInt();
            }
        }
        print(Element);
        System.out.print("Enter the Element to search: ");
        int key = sc.nextInt();
        search(Element,key);
    }
    public static void print(int Element[][]){
        for(int i=0; i<Element.length; i++){
            for(int j=0; j<Element[0].length; j++){
                System.out.print(Element[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    public static boolean search(int Element[][], int key){
        for(int i=0; i<Element.length; i++){
            for(int j=0; j<Element[0].length; j++){
                if(Element[i][j] == key){
                    System.out.println("The key " + key + " is found at index (" + i + "," + j + ").");
                    return true;
                }
            }
        }
        System.out.print("The key " + key + " is not found.");
        return false;
    }
}
