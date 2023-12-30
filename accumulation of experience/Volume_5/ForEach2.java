package Volume_5;

import java.util.Arrays;

public class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] nums = new int[3][5];
// Поместить некоторые значения в nums.
        for(int i = 0; i < 3; i++)
            for(int j=0; j < 5; j++)
                nums[i][j] = (i+1)*(j+1);
        System.out.println("Изначальный список =  " + Arrays.deepToString(nums));
// Применение цикла for в стиле "for-each" для отображения
// и суммирования значений.
        for(int[] x : nums) {
            System.out.println("Значения по Х = " + Arrays.toString(x));
            for(int y : x) {
                System.out.println("Значениеgj y: " + y);
                sum += y; // Обратите внимание на способ объявления переменной х
            }
        }
        System.out.println("Сумма: " + sum);
    }

}
