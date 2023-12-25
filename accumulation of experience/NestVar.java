/*
В этой программе предпринимается попытка объявить
во внутренней области переменную с таким же именем,
как у переменной, определенной во внешней области.
*** Программа не скомпилируется. к -к -к
*/

public class NestVar {
    public static void main(String[] args) {

        for(int count = 0; count <= 10; count++){

            System.out.printf("\nCount_step_%s", count);
            System.out.println();

            for(int count1 = 0; count1 <= 5; count1++){ // А вот с ддругим именем можно
            //for(int count = 0; count< 5; count++){   // даже если учитывать, что
                                                      // переменные в блоках считаються автономными
                                                     // их нельзя называть двумя одинаковыми названиями
                System.out.printf("\nStep_count_%s__________", count1);
            }
        System.out.println();
        }
    }
}

