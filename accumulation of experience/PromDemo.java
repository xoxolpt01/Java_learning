public class PromDemo {
    public static void main(String[] args) {
        byte b;
        int i;

        b=10;
        i = b*b;


        b=10;
        b = (byte) (b * b);
        System.out.println("i и b: " + i + " " + b);

        char chi = 'a', ch2 ='C';
        chi = (char) (chi + ch2);
        System.out.println(chi);

    }
}