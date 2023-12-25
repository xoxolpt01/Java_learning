/*
Задача 1: Создание класса "Калькулятор"
Создайте класс с именем Calculator, представляющий простой калькулятор.
У класса Calculator должны быть методы для выполнения базовых арифметических операций:
сложение, вычитание, умножение и деление.
В методе main создайте объект класса Calculator.
Вызовите методы для выполнения нескольких арифметических операций и
выведите результаты на экран.
 */

package Optimization;
import java.util.Scanner;

class options{
    void info(){
        System.out.println("Выберете одну из следующих операций 1-4-q");
        System.out.println("1. добавление + ");
        System.out.println("2. отнимание - ");
        System.out.println("3. умножение * ");
        System.out.println("4. деление /");
        System.out.println("q. чтобы выключить программу");
        System.out.println();
    }
}

class functions{
    Scanner input = new Scanner(System.in);

    double deter_func(char choosing)
            throws java.io.IOException {
        char choose;

        switch (choosing) {
            case '1':
                System.out.print("Для добавления");
                System.out.print(" ведите число a ");
                int value_positive = input.nextInt();

                System.out.println();
                System.out.print("Введите число b ");
                int value_positive2 = input.nextInt();
                System.out.println();

                int res_pos = value_positive + value_positive2;
                System.out.println("Локальный ответ = " + res_pos);

                System.out.println("введите *y* для следующего числа ");
                System.out.println("Для выхода с режима прибавления нажмите *n*");


                for( ; ; ) {
                    System.out.println("введите ** y ** для следующего числа_");
                    System.out.println("Для выхода с режима прибавления нажмите ** n **");
                    choose = (char) System.in.read();
                    if (choose == 'n') {
                        break;
                    }
                    else {
                        if (choose == 'y') {
                            System.out.println();
                            System.out.println("Введите следующеe числo ");
                            int one_more_value_pos = input.nextInt();
                            res_pos += one_more_value_pos;
                            System.out.println(res_pos);
                            System.out.println();
                        }
                    }
                }
                return res_pos;

            case '2':
                System.out.print("Введите число a ");
                int value_negative = input.nextInt();
                System.out.println();
                System.out.print("Введите число b ");
                int value_negative2 = input.nextInt();
                System.out.println();

                int res_neg = value_negative - value_negative2;
                System.out.println("Локальный ответ = " + res_neg);

                for( ; ; ) {
                    System.out.println("введите ** y ** для следующего числа_");
                    System.out.println("Для выхода с режима прибавления нажмите ** n **");
                    choose = (char) System.in.read();
                    if (choose == 'n') {
                        break;
                    }
                    else {
                        if (choose == 'y') {
                            System.out.println();
                            System.out.println("Введите следующеe числo ");
                            int one_more_value_pos = input.nextInt();
                            res_neg -= one_more_value_pos;
                            System.out.println("Локальный ответ = " + res_neg);
                            System.out.println();
                        }
                    }
                }
                return res_neg;

            case '3':
                System.out.print("Введите число a ");
                int value_multiplication = input.nextInt();
                System.out.println();
                System.out.print("Введите число b ");
                int value_multiplication2 = input.nextInt();
                System.out.println();

                int res_mult =  value_multiplication * value_multiplication2;
                System.out.println("Локальный ответ = " + res_mult);

                for( ; ; ) {
                    System.out.println("введите ** y ** для следующего числа_");
                    System.out.println("Для выхода с режима прибавления нажмите ** n **");
                    choose = (char) System.in.read();
                    if (choose == 'n') {
                        break;
                    }
                    else {
                        if (choose == 'y') {
                            System.out.println();
                            System.out.println("Введите следующеe числo ");
                            int one_more_value_pos = input.nextInt();
                            res_mult *= one_more_value_pos;
                            System.out.println("Локальный ответ = " + res_mult);
                            System.out.println();
                        }
                    }
                }
                return res_mult;

            case '4':
                //Тут стоит немного переделать для особых двух чисел, дать выбор знаменателю
                // или числителю, а после и делать деление

                System.out.print("Введите число a ");
                int value_division = input.nextInt();
                System.out.println();
                System.out.print("Введите число b ");
                int value_division2 = input.nextInt();
                System.out.println();

                if (value_division2 == 0){
                    System.out.println("Error division by 0");}

                else {

                    double res_div =  (double) value_division / value_division2;
                    System.out.println("Локальный ответ = " + res_div);

                    for( ; ; ) {
                        System.out.println("введите ** y ** для следующего числа_");
                        System.out.println("Для выхода с режима прибавления нажмите ** n **");
                        choose = (char) System.in.read();
                        if (choose == 'n') {
                            break;
                        }
                        else {
                            if (choose == 'y') {
                                System.out.println();
                                System.out.println("Введите следующеe числo ");
                                int one_more_value_pos = input.nextInt();
                                res_div /= one_more_value_pos;
                                System.out.println("Локальный ответ = " + res_div);
                                System.out.println();
                            }
                        }
                    }
                    return res_div;
                }

            default:
                System.out.println("Введены неправильные значения, повторите попытку ");
                return 0;

        }
    }
}

public class Custom_calculator {
    public static void main(String[] args)
            throws java.io.IOException {
        char ignore;

        for( ; ; ) {
            options promotions = new options();
            promotions.info();

            char choosing = (char) System.in.read();

            if (choosing == 'q') break;
            else {
                functions operation = new functions();
                if (choosing != '1' & choosing != '2' & choosing != '3' & choosing !='4' & choosing != '5') {
                    System.out.println("Введен неккоректный диапазон");
                    do {
                        ignore = (char) System.in.read();
                    } while (ignore != '\n');
                    break;
                }
                else{
                        System.out.println("Ответ = " + operation.deter_func(choosing));
                        System.out.println();
                }
            }
        }System.out.println();
    }
}
