import java.util.Scanner;

public class Question2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int Element[] = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            Element[i] = sc.nextInt();
        }
        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        int index = SearchIndex(Element, target);
        System.out.println(target + " is found at index " + index);
    }

    public static int SearchIndex(int Element[], int target) {
        int pivotindex = minElement(Element);
        if (Element[pivotindex] <= target && target <= Element[Element.length - 1]) {
            return BinarySearch(pivotindex, Element.length - 1, Element, target);
        } else {
            return BinarySearch(0, pivotindex, Element, target);
        }
    }

    public static int BinarySearch(int start, int end, int Element[], int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (Element[mid] == target) {
                return mid;
            } else if (Element[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int minElement(int Element[]) {
        int start = 0;
        int end = Element.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid > 0 && Element[mid] < Element[mid - 1]) {
                return mid;
            } else if (Element[start] <= Element[mid] && Element[end] <= Element[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}

