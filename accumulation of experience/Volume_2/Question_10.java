package Volume_2;

//Напишите программу, находящую все простые числа от 2 до 100.

public class Question_10 {
    public static void main(String[] args){

        for(int i = 2; i<=100; i++){

//            if(i==2) System.out.println("Это число является простым:" + i);
//            if(i==3) System.out.println("Это число является простым:" + i);
//            if(i==5) System.out.println("Это число является простым:" + i);
//            if(i==7) {System.out.println("Это число является простым:" + i);}

            if(i%2 != 0 & i%3!=0 & i%5!=0 & i%7!=0 ){

                System.out.println("Это число является простым:" + i);

            }
        }
    }
}
