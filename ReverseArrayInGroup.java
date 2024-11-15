import java.util.Scanner;

public class ReverseArrayInGroup {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Elements: ");
        int n = sc.nextInt();
        int Elements[] = new int[n];
        System.out.print("Enter Elements: ");
        for (int i = 0; i < n; i++) {
            Elements[i] = sc.nextInt();
        }
        System.out.print("Enter Key: ");
        int key = sc.nextInt();
        ReverseArrayInGroup(Elements, key);
    }

    public static void ReverseArrayInGroup(int Elements[], int key) {
        for (int i = 0; i < Elements.length; i += key) {
            int left = i;
            int right = Math.min(i + key - 1, Elements.length - 1);

            while (left < right) {
                int temp = Elements[left];
                Elements[left] = Elements[right];
                Elements[right] = temp;
                left++;
                right--;
            }
        }

        System.out.println("Reversed Array in Groups:");
        for (int i = 0; i < Elements.length; i++) {
            System.out.print(Elements[i] + " ");
        }
    }
}
