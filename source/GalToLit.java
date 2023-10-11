class GalToLit {
    /*
    Упражнение 1.1.
    Программа для преобразования галлонов в литры .
    Назовите этот файл GalToLit.java.
    */

    public static void main(String[] args){
        int gallons; // хранит количество галлонов
        double liters; // хранит результат преобразования в литры

        gallons = 1042; // начать с 10 галлонов
        liters = gallons * 3.7854; // преобразование в литры
        System.out.println(gallons + " Галлонов соответствует "
                + liters + " литрам ");
    }
}
