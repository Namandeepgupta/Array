import java.util.*;

public class InputOutputUpdate {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int array1[] = {1, 2, 3};
        System.out.println(array1[0]+array1[1]+array1[2]);
        int array2[] = new int [3];
        System.out.print("Maths score: ");
        array2[0] = sc.nextInt();
        System.out.print("Physics score: ");
        array2[1] = sc.nextInt();
        System.out.print("Chemistry score: ");
        array2[2] = sc.nextInt();
        System.out.println("Maths: " + array2[0]);
        System.out.println("Physics: " + array2[1]);
        System.out.println("Chemistry: " + array2[2]);
        int percentage = (array2[0]+array2[1]+array2[2])/3;
        System.out.println("Percentage: " + percentage);
        /*update maths score*/
        array2[0] = array2[0] + 3;
        System.out.println("Updated Maths score: " + array2[0]);
        percentage = (array2[0]+array2[1]+array2[2])/3;
        System.out.println("Updated Percentage: " + percentage);
    }
}
