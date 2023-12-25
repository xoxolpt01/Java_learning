package Fine_mini_Progs;
/*
Используя цикл for, оператор if и блоки кода, можно
создать усовершенствованную версию программы преобразования
галлонов в литры, которая была разработана в упражнении 1.1.

Новая версия будет выводить таблицу преобразований, начиная
с 1 и заканчивая 100 галлонами. После каждых 10 галлонов будет выводиться пустая строка.
Это достигается за счет применения переменной counter, подсчитывающей количество выведенных
строк. Обратите особое внимание на ее использование.
*/

public class GalToLitTable {
    public static void main(String[] args) {
        /*
        Упражнение 1.2.
        Эта программа отображает таблицу преобразований галлонов в литры .
        */

        double gallons, liters;
        int counter, quality;

        quality = 30; //100;
        counter = 0;

        for (gallons=1; gallons<=quality; gallons++) {
            liters = gallons * 3.7854;
            if (gallons <= quality){
                //System.out.println("Итерация Count: " + count);
                System.out.println(gallons + " галлонов соответствует "
                        + liters + " литрам ");
            }
            counter ++;

            /* или блок if можно было заменить след. образом
            if(counter % 10 == 0){
                System.out.println(" ");
            }
             */

            if(counter == 10){
                System.out.println(" ");
                counter = 0; // А так, лишний раз нужно прописывать счетчик.
                // break;
            }
        }
    }
}