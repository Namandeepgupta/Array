public class PracticeQuestion1 {
    public static void main(String args[]){
        int Matrix [][] = {{4,7,8},
                           {8,8,7}};
        int key = 7;
        NumberOfKey(Matrix,key);
    }
    public static void NumberOfKey(int Matrix[][], int key){
        int count = 0;
        for(int i=0; i<Matrix.length; i++){
            for(int j=0; j<Matrix[0].length; j++){
                if(key == Matrix[i][j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
