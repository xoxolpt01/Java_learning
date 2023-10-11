public class Condition {
    public static void main(String[] args) {
       int a,b,c;

       a = 2;
       b = 3;

       if(a<b) System.out.println("Definition a is minor b");

       //Следующий оператор ничего не отобразит.
       if(a==b) System.out.println("This you shouldn`t see");
       System.out.println();

       c = a - b; // Переменная с содержит -1
       System.out.println("Varriable has -1");

       if(c >= 0) System.out.println("Meaning c isn`t Negative");
       if(c < 0) System.out.println("Meaning c isn Negative");

       System.out.println();

       c = b - a; // Теперь переменная с содержит 1
       if(c >= 0) System.out.println("Meaning c isn`t Negative");
       if(c < 0) System.out.println("Meaning c isn Negative");
    }
}
