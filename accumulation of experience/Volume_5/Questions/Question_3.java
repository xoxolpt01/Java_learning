package Volume_5.Questions;

public class Question_3 {
    public static void main(String[] args){

        double[] avrg = {1, 2, 3 ,4, 5, 6, 7, 8, 9};
        int sum = 0;
        for(double x : avrg){
            sum += (int) x;
        }
        double res = (double) sum/avrg.length;
        System.out.println("Среднее значение со списка: " + res);
    }
}
