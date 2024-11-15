

public class ArrayFunctionArgument {
    public static void UpdateArray(int Scores[]){
        for(int i=0; i<Scores.length; i++){
            Scores[i] = Scores[i] + 1;
        }
    }
    public static void main(String args[]){
        int Scores [] = {95,94,96};
        UpdateArray(Scores);
        for(int i=0; i<Scores.length; i++){
            int j = i+1;
            System.out.println("Subject " + j + ": " + Scores[i]);
            
        }
        System.out.println("");
    }
}
