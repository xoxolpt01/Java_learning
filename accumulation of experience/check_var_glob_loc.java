 class check_var_glob_loc {

    public static void main(String[] args){

        int x = 10;

        if(x == 10) {

            int y = 20;

            System.out.println("value_ 1  х и у: " + x + " " + y);
            x = y * 2;
        }

        System.out.println();
        System.out.println("Значение х равно " + x);
    }
}
