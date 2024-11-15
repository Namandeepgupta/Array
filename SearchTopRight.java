public class SearchTopRight {
    public static void main(String args[]){
        int matrix[][] = {{11,12,13,14,15},
                          {26,27,28,29,30},
                          {31,32,33,34,35},
                          {46,47,48,49,50},
                          {62,64,66,68,70}};
        int key = 64;
        SearchInSortedMatrix(matrix,key);
    }
    public static boolean SearchInSortedMatrix(int matrix[][], int key){
        int row = 0;
        int column = matrix[0].length-1;
        while(row<matrix.length && column>=0){
            if(matrix[row][column] == key){
                System.out.println(key + " key is found at (" + row + "," + column + ")");
                return true;
            }
            else if(matrix[row][column] > key){
                column--; 
            }
            else{
                row++;
            }
        }
        System.out.println(key + " key is not found.");
        return false;
    }
}
