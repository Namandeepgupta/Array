public class SearchInSortedMatrix{
    public static void main(String args[]){
        int matrix[][] = {{11,12,13,14},
                          {25,26,27,28},
                          {31,32,33,34},
                          {45,46,47,48}};
        int key = 30;
        SearchInSortedMatrix(matrix,key);
    } 
    public static boolean SearchInSortedMatrix(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println(key + " key is found at (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println(key + " key is not found.");
        return false;
    }   
}