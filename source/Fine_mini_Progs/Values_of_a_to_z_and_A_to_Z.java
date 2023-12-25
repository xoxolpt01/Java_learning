package Fine_mini_Progs;


class Values_of_a_to_z_and_A_to_Z {
    public static void main(String[] args) {
        char x, X, x_1, X_1, xx;
        int a,b,c,d,d1;

        x = (char) 'a';
        a = (int) x;
        X = (char) 'z';
        b = (int) X;

        x_1 = (char) 'A';
        c = (int) x_1;
        X_1 = (char) 'Z';
        d = (int) X_1;

        xx = (char) '.';
        d1 = (int) xx;

        System.out.println("a " + a);
        System.out.println("z " + b);
        System.out.println();
        System.out.println("A " + c);
        System.out.println("Z " + d);
        System.out.println('.' + xx);


    }
}