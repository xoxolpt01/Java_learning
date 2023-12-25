package Volume_4;

/*
Добавление параметризованного метода, который вычисляет объем топлива,
необходимого для поездки на заданное расстояние.
*/
class Vehicle_class_new_method {
    int passengers;     // количество пассажиров
    int fuelcap;        // запас топлива в галлонах
    int mpg;            // расход топлива в милях на галлон

    // Возвращает дальность поездки,
    int range() {
        return mpg * fuelcap;
    }

    //Рассчитывает объем топлива,необходимого для поездки на заданное расстояние
    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }
}

public class CompFuel {

    public static void main(String[] args) {
        Vehicle_class_new_method minivan = new Vehicle_class_new_method();
        Vehicle_class_new_method sportscar = new Vehicle_class_new_method();
        double gallons;
        int dist = 252;

        // Присвоить значения полям в minivan,
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Присвоить значения полям в sportscar.
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        gallons = minivan.fuelNeeded(dist);
        System.out.println("Для поездки на расстояние " + dist
                + " миль минивэну требуется " + gallons + " галлонов топлива.");

        gallons = sportscar.fuelNeeded(dist);
        System.out.println("Для поездки на расстояние " + dist
                + " миль спортивному автомобилю требуется " + gallons + " галлонов топлива.");

    }
}
