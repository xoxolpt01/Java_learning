package Volume_5.Questions;

class Queue_int {
    int[] q; // массив, хранящий данные очереди
    int putloc, getloc; // индексы для позиций помещения и извлечения

    Queue_int(int size) {
        q = new int[size]; // выделение памяти под очередь
        putloc = getloc = 0;
    }

    // Поместить символ в очередь,
    void put(int ch) {
        if (putloc == q.length) {
            System.out.println(" - Очередь переполнена.");
            return;
        }
        q[putloc++] = ch;
    }

    int get() {
        if(getloc == putloc) {
            System.out.println(" - Очередь пуста.");
            return 0;
        }
        return q[getloc++];
    }
}


public class QDemo_int {
    public static void main(String[] args){

        Queue_int bigQ = new Queue_int(11);
        Queue_int smallQ = new Queue_int(4);
        int ch;
        int i;
        System.out.println("Использование bigQ для сохранения алфавита.");
// Поместить в bigQ коды букв,
        for(i=0; i < 10; i++)
            bigQ.put((char) ('0' + i));
// Извлечь и отобразить элементы bigQ.
        System.out.print("Содержимое bigQ: ");
        for(i=0; i < 10; i++) {
            ch = bigQ.get();
            if(ch !=  0) System.out.print(ch);
        }
        System.out.println("\n");
        System.out.println("Использование smallQ для генерации ошибок.");
// Использовать smallQ для генерации ошибок.
        for(i=0; i < 5; i++) {
            System.out.print("Попытка сохранения " +
                    (char) ('9' - i));
            smallQ.put((char) ('9' - i));
            System.out.println();
        }
        System.out.println();
// Дополнительные ошибки в smallQ.
        System.out.print("Содержимое smallQ: ");
        for(i=0; i < 5; i++) {
            ch = smallQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }
    }
}
