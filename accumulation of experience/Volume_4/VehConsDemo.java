package Volume_4;

class Vehicle_param {
    int passengers;
    int fuelcap;
    int mpg;

    Vehicle_param(int p, int f, int m) {
        // Конструктор для класса Vehicle.
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Возвращает дальность поездки,
    int range() {
        return mpg * fuelcap;
    }

    //Рассчитывает объем топлива, необходимого для поездки на заданное расстояние
    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }

}

public class VehConsDemo {
    public static void main(String[] args) {

        // Создать объекты транспортных средств.
        Vehicle_param minivan = new Vehicle_param(7, 16, 21);
        Vehicle_param sportscar = new Vehicle_param(2, 14, 12);

        double gallons;
        int dist = 252;

        gallons = minivan.fuelNeeded(dist);
        System.out.println("Для поездки на расстояние " + dist
                + " миль минивэну требуется " + gallons + " галлонов топлива.");

        System.out.println();

        gallons = sportscar.fuelNeeded(dist);
        System.out.println("Для поездки на расстояние " + dist
                + " миль спортивному автомобилю требуется " + gallons + " галлонов топлива.");
    }
}