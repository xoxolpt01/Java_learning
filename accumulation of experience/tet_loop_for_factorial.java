public class tet_loop_for_factorial {
    public static int factorial(double count){

        double i = 1;
        for(double fact = 1; fact <= count; fact ++){
            i *= fact;
        }
        return (int) i;
    }

    public static void main(String[] args) {
        double e = 0, x = 1 , n = 100, count, sum;

        for(count = 0; count <= n; count ++){
            sum = Math.pow(x, count)/factorial(count);
            e += sum;

            System.out.printf("Step_%s with %s! = ",count, count);
            System.out.print(e);
            System.out.println();
        }
        System.out.println();
        System.out.println("Total result: " + e);
        /*int result = factorial(x);
        System.out.println(result);*/
    }
}
