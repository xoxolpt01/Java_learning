public class Loops {
    public static void main(String[] args){
        int count;

        /*
        Условия так же можно и иначе записать
        for (count = 0; count <= 5; count +=1) как в питоне
        for (count = 0; count <= 5; count ++) по дефолту
        но в плюсах и джаве принято писать через инкремент:
         */
        for (count = 0; count <= 5; count ++) {
            System.out.println("Mean count: " + count);
        }
        System.out.println("Done!");
    }
}
