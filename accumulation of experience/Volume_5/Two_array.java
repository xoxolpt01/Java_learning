package Volume_5;

public class Two_array{
    public static void main( String[] args) {
        int i, t;

        int [][] sample = new int [3][4];

        for (i=0; i < 3; i++){
            for(t = 0; t < 4; t++){
                int formula = (i*4) + t + 1;
                sample[i][t] = formula;
                System.out.print(sample[i][t] + " ");
            }
            System.out.println();

        }
    }
}
