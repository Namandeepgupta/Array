//When height of bar of biulding and length of bar are given
import java.util.*;

public class TrappingRainwater {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of buildings: ");
        int n = sc.nextInt();
        int Height[] = new int [n]; 
        System.out.print("Enter the height of buildings: ");
        for(int i=0; i<n; i++){
            Height[i] = sc.nextInt();
        }
        System.out.print("Enter the width: ");
        int width = sc.nextInt();
        int TrappedWater = WaterBetweenBuildings(Height) * width;
        System.out.println("Water trapped : " + TrappedWater + " unit");
    }
    public static int WaterBetweenBuildings(int Height[]){
        int n = Height.length;
        //leftmax
        int maxLeft[] = new int [n];
        maxLeft[0] = Height[0];
        for(int i=1; i<n; i++){
            maxLeft[i] = Math.max(Height[i],maxLeft[i-1]);
        }
        //rightmax
        int maxRight[] = new int [n];
        maxRight[n-1] = Height[n-1];
        for(int i=n-2; i>=0; i--){
            maxRight[i] = Math.max(Height[i],maxRight[i+1]);
        }
        //waterlevel
        int watertrapped = 0;
        for(int i=0; i<n; i++){
            int waterlevel = Math.min(maxLeft[i],maxRight[i]);
            watertrapped += waterlevel - Height[i]; 
        }
        return watertrapped;
    }
}
