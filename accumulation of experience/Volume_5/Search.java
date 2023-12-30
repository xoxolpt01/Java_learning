package Volume_5;

public class Search {
    // Поиск в массиве с использованием цикла for в стиле "for-each".
        public static void main(String[] args) {
            int[] nums = { 6, 8 , 3 , 1, 5, 8 , 1, 4 };
            int val = 5;
            boolean found = false;
// Применить цикл for в стиле "for-each" для поиска в nums значения val.
            for(int x : nums) {
                if(x == val) {
                    found = true;
                    break;
                }
            }
            if(found)
                System.out.println("Значение найдено!");
    }
}
