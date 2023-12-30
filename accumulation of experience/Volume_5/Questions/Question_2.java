package Volume_5.Questions;

import java.util.Arrays;

public class Question_2 {
    public static void main(String[] args) {

        int[] new_list = new int[6];
        for(int i = 0; i < new_list.length; i++){
            new_list[i] = i;
        }
        System.out.print("Cписок состоит с: ");
        for(int x : new_list) System.out.print(x + " ");

        System.out.println("\nВид списа: " + Arrays.toString(new_list));
    }
}
