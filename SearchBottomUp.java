public class SearchBottomUp {
    public static void main(String args[]){
        int matrix[][] = {{11,12,13,14,15},
                          {26,27,28,29,30},
                          {41,42,43,44,45},
                          {56,57,58,59,60}};
        int key = 57;
        SearchInSortedMatrix(matrix,key);
    }
    public static boolean SearchInSortedMatrix(int matrix[][],int key){
        int row = matrix.length-1;
        int col = 0;
        while(row >= 0 && col < matrix[0].length){
            if(matrix[row][col] == key){
                System.out.println(key + " key is found at (" + row + "," + col + ").");
                return true;
            }
            else if(matrix[row][col] < key){
                col++;
            }
            else{
                row--;
            }
        }
        System.out.println(key + " key is not found.");
        return false;
    }
}
