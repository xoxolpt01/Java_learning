package Volume_4;

class Vehicle{
    int passengers; // количество пассажиров
    int fuelcap;    // запас топлива в галлонах
    int mpg;        // расход топлива в милях на галлон
}

public class VehicleDemo {
    public static void main(String[] args){
        int range;

        Vehicle_class_new_method minivan = new Vehicle_class_new_method();
        // Присвоить значения полям в minivan,
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Рассчитать дальность при полном баке,
        range = minivan.fuelcap * minivan.mpg;

        System.out.println("Минивэн может перевезти " + minivan.passengers +
                " пассажиров на расстояние " + range + " миль.");

    }
}
