package Volume_4;

class Vehicle_return {
    int passengers;
    int fuelcap;
    int mpg;

    // Возвращает дальность поездки,
    int range() {
        return mpg * fuelcap;
    }
}

public class RetMeth {

    public static void main(String[] args) {
        Vehicle_return minivan = new Vehicle_return();
        Vehicle_return sportscar = new Vehicle_return();
        int rangel, range2;

        // Присвоить значения полям в minivan,
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Присвоить значения полям в sportscar.
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        // Получить дальность поездки для разных транспортных средств,
        rangel = minivan.range();
        range2 = sportscar.range();

        System.out.println("Минивэн может перевезти " + minivan.passengers +
                " пассажиров на расстояние " + rangel + " миль.");

        System.out.println("Спортивный автомобиль может перевезти " +
                sportscar.passengers + " пассажиров на расстояние " + range2 + " миль.");

    }
}
