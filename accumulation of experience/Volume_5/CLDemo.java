package Volume_5;

public class CLDemo {
    public static void main(String[] args) {
        System.out.println("console can`t recognize russian alphabet " + args.length);
        System.out.println("argumetn`s list: ");
        for(int i=0; i<args.length; i++)
            System.out.println("arg[" + i + "]: " + args[i]);

    }
}
