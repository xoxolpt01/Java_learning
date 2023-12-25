package Fine_mini_Progs;

public class Question_10 {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch1, ch2, user, ignore;
        int charcode_upper, charcode_lower, count1, count2;

        count1 = count2 = 0;

        System.out.println("Приветствуем в первой относительно полноценной программе Java");
        System.out.println("Если кратко, то программа переобразует латинские буквы,");
        System.out.println("с маленьких в заглавные, и наоборот.");
        System.out.println();
        System.out.println("Для выхода нажмите '.'");

        stop:
        for( ; ;) {
            restart:
            do {
                System.out.println("Введите букву: ");
                user = (char) System.in.read();
                if(user == '.') break stop;

                if( (user < 65 | user > 90) & (user < 97 | user > 122)){
                    System.out.println("Введены неккоректные значения. Попробуйте заново ");
                    do {
                        ignore = (char) System.in.read();
                    } while (ignore != '\n');
                    break restart;}

                //Переведение с большого в маленькое
                if(65 <= user & user <= 90){
                    //Диапазон больших чисел от 65 до 90
                    charcode_upper = (int) user;
                    ch1 = (char) (charcode_upper + 32);
                    System.out.println("your " + user + " = " + ch1);
                    count1 ++;
                }

                //Переведение с маленького в большое
                if(97 <= user & user <= 122){
                    //Диапазон маленьких чисел от 97 до 122
                    charcode_lower = (int) user;
                    ch2 = (char) (charcode_lower - 32);
                    System.out.println("your " + user + " = " + ch2);
                    count2 ++;
                }

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');

            } while (((user <= 65 & user >= 90) | ( user <= 97 & user >= 122)) & user != '.');
        }
        System.out.printf("Программа окончена. Изменений в регистре произошло %s раз",
                count1+count2);
        System.out.println();
        System.out.printf("Маленьких регистров %s, и Больших %s", count2, count1);
    }
}
