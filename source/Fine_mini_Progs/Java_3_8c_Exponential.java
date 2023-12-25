package Fine_mini_Progs;


public class Java_3_8c_Exponential {
    public static int factorial(double count){
        double fact, i;
        i = 1;
        for(fact = 1; fact <= count; fact ++){
            i *= fact;
            /*System.out.printf("Factorial %s: ", fact);
            System.out.print(i);
            System.out.println();*/
        }
//        System.out.println(i);
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
