public class PracticeQuestion3 {
    public static void main(String args[]){
        int matrix[][] = {{11,12,13},
                          {21,22,23},
                          {31,32,33}};
        MatrixTranspose(matrix);
    }
    public static void MatrixTranspose(int matrix[][]){
        int transpose[][] = new int [matrix.length][matrix[0].length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                transpose[i][j] = matrix[j][i];
            }
        }
        MatrixPrint(transpose);
    }
    public static void MatrixPrint(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
