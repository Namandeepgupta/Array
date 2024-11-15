import java.util.*;

public class Question4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of buildings: ");
        int n = sc.nextInt();
        int height[] = new int[n];
        System.out.print("Enter the height of buildings: ");
        for(int i=0; i<n; i++){
            height[i] = sc.nextInt(); 
        }   
        System.out.print("Enter the width of Bulding: ");
        int width = sc.nextInt();
        int watertrapped = WaterTrapped(height);
        int storedwater = watertrapped*width;
        System.out.println("Water Trapped: " + storedwater + " units.");
    }
    public static int WaterTrapped(int height[]){
        int n = height.length;
        //leftmax
        int maxleft[] = new int[n];
        maxleft[0] = height[0];
        for(int i=1; i<n; i++){
            maxleft[i] =  Math.max(height[i], maxleft[i-1]);
        }
        //rightmax
        int maxright[] = new int[n];
        maxright[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            maxright[i] = Math.max(maxright[i+1],height[i]);
        }
        //waterlevel
        int watertrapped = 0;
        for(int i=0; i<n; i++){
            int waterlevel = Math.min(maxleft[i],maxright[i]);
            watertrapped += waterlevel - height[i];
        }
        return watertrapped;
    }
}
