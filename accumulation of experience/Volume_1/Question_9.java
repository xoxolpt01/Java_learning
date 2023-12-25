package Volume_1;

public class Question_9 {
    /*  Сила тяжести на Луне составляет около 17% земной.
    Напишите программу для расчета вашего фактического веса на Луне.
    */
    public static void main(String[] args){
        double moon_weight, earth_weight, result, const_1;

        const_1 = 0.17;
        earth_weight= 80;
        moon_weight = earth_weight*const_1;
        System.out.println("Находясь на луне, вес составит: " + moon_weight + " кг");
        System.out.println("При земных: " + earth_weight +  " кг");
    }
}
