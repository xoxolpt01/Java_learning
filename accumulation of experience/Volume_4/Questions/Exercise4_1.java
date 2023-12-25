package Volume_4.Questions;

/*
Упражнение 3.3
Улучшенная справочная система по управляющим операторам Java,
в которой используется цикл do-while для обработки выбора
варианта в меню.
*/

class Help{

    void helpOn(int what){
        switch (what) {

            case '1':
                System.out.println("Оператор if:\n");
                System.out.println("if(условие) оператор;");
                System.out.println("else оператор;");
                break;

            case '2':
                System.out.println("Традиционный оператор switch:\n");
                System.out.println("switch(выражение) {");
                System.out.println("case константа:");
                System.out.println("последовательность операторов");
                System.out.println("break;");
                System.out.println("// ...");
                System.out.println("}");
                break;

            case '3':
                System.out.println("Цикл for:\n");
                System.out.print("for(инициализация; условие; итерация)");
                System.out.println(" оператор;");
                break;

            case '4':
                System.out.println("Цикл while:\n");
                System.out.println("while(условие) оператор;");
                break;

            case '5':
                System.out.println("Цикл do-while:\n");
                System.out.println("do {");
                System.out.println(" оператор;");
                System.out.println("} while (условие);");
                break;

            case '6':
                System.out.println("Оператор break:\n");
                System.out.println("break; или break метка;");
                break;

            case '7':
                System.out.println("Оператор continue:\n");
                System.out.println("continue; или continue метка;");
                break;

            case 'q' :
                break;
        }
        System.out.println();


    }

    void showMenu() {
        System.out.println();
        System.out.println("1. if");
        System.out.println("2. switch");
        System.out.println("3. for ");
        System.out.println("4. while");
        System.out.println("5. do-while");
        System.out.println("6. break");
        System.out.println("7. continue\n");
        System.out.print("Выберете вариант (или q для завершения) ");
    }

    boolean isValid(int choice){
        if( choice < '1' | choice > '7' & choice != 'q') return false;
        else return true;
    }
}

public class Exercise4_1 {
    public static void main(String[] args)
            throws java.io.IOException {

        char choice, ignore;
        Help hlpobj = new Help();
        stop:
        for ( ; ; ) {
            do {
                hlpobj.showMenu();
                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');

            } while( !hlpobj.isValid(choice) );

            if(choice == 'q') break;
            System.out.println("\n");
            hlpobj.helpOn(choice);
        }
    }
}


