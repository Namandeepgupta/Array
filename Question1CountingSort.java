public class Question1CountingSort {
    public static void CountingSort(int Element[]){
        //largest
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<Element.length; i++){
            largest = Math.max(largest,Element[i]);
        }
        //frequency
        int frequency[] = new int [largest+1];
        for(int i=0; i<Element.length; i++){
            frequency[Element[i]]++;
        }
        //sorting
        int j=0;
        for(int i=frequency.length-1; i>=0; i--){
            while(frequency[i]>0){
                Element[j] = i;
                j++;
                frequency[i]--;
            }
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
        CountingSort(Element);
        Print(Element);
    }
}
