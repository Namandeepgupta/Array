public class Question1SelectionSort {
    public static void SelectionSort(int Element[]){
        for(int i=0; i<Element.length; i++){
            int maxpos = i;
            for(int j=i+1; j<Element.length; j++){
                if(Element[j]>Element[maxpos]){
                    maxpos = j;
                }
            }
            int temp = Element[i];
            Element[i] = Element[maxpos];
            Element[maxpos] = temp;
        }
    }
    public static void Print(int Element[]){
        System.out.print("Sorted elements : ");
        for( int i=0; i<Element.length; i++){
            System.out.print(Element[i] + " ");
        }
        System.out.println(" ");
    }
    public static void main(String args[]){
        int Element[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        SelectionSort(Element);
        Print(Element);
    }
}
