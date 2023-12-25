import java.util.Scanner;

public class test_1 {
    public static void main(String[] args) {
            Scanner in_ = new Scanner(System.in);
            double a, b, sum;

            System.out.println("Inpu some text here");

            String text = in_.next(); //принимает значение str
            a = in_.nextInt(); // принимает значение int
            b = in_.nextInt(); // -----//-------

            sum = a + b;

            System.out.printf("%s Result of %s and %s is %s", text, a, b, sum);
    }
}

