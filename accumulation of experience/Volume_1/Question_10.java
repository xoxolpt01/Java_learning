package Volume_1;
/*
Адаптируйте программу из упражнения 1.2 так,
чтобы она выводила таблицу преобразования дюймов в метры.

Отображайте преобразования длины до 12 футов через каждый дюйм.
Через каждые 12 дюймов выводите пустую строку.

(Один метр равен примерно 39,37 дюйма.)
1 feet == 12 inch
 */
public class Question_10 {
    public static void main(String[] args){
            /*
                Definitions:                     feet = 12;
                1_meter =  39,37 inch    then    inch = feet * 12;
                1_feet = 12 inch                 meters = inch / 39.37 ;
             */
        double feet, inch, meters, inch_count;
        int i;

        i = 0;
        feet = 12;
        for (inch=1; inch <= feet * 12; inch ++){
            meters = inch / 39.37 ;
            System.out.println(inch + " inch, its " + meters + " meters");

            i ++;
            if (inch % 12 == 0){
                System.out.println();
                System.out.println("Inch is:" + i);
                System.out.println();
                i = 0;
            }
        }
    }
}
