public class Power_while {
    public static void main(String[] args){
        int e, res;

        for(int i = 0; i <= 10; i++ ){

            res = 1;
            e = i;
            while (e>0){

                res *= 5;
                e--;
            }
            System.out.printf("\n2 powered %s is: %s", i, res);
        }
    }
}
