public class Question1InsertionSort {
    public static void InsersionSort(int Element[]){
        for(int i=1; i<Element.length; i++){
            int current = Element[i];
            int previous = i-1;
            while(previous>=0 && Element[previous]<current){
                Element[previous+1] = Element[previous];
                previous--;
            }
            Element[previous+1] = current;
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
        InsersionSort(Element);
        Print(Element);
    }
}
