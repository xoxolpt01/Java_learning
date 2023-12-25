package Volume_4;

class Vehicle1 {
    int passengers; // количество пассажиров
    int fuelcap;    // запас топлива в галлонах
    int mpg;        // расход топлива в милях на галлон
}

public class TwoVehicles {
    public static void main(String[] args) {

        Vehicle_class_new_method minivan = new Vehicle_class_new_method();
        Vehicle_class_new_method sportcar = new Vehicle_class_new_method();

        int rangel, range2;

        // Присвоить значения полям в minivan,
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Присвоить значения полям в sportscar.
        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

        // Рассчитать дальности при полном баке,
        rangel = minivan.fuelcap * minivan.mpg;
        range2 = sportcar.fuelcap * sportcar.mpg;

        System.out.println("Минивэн может перевезти " + minivan.passengers +
                " пассажиров на расстояние " + rangel + " миль.");

        System.out.println("Спортивный автомобиль может перевезти " +
                sportcar.passengers + " пассажиров на расстояние " + range2 + " миль.");

    }
}
