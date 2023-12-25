//import java.math;

class math_custom{
    double radius, pi, l, s, pythagoras, a, b, result;

    double hypotenus(){
        result = Math.pow(a, 2) + Math.pow(b, 2);
        return result;
    }

    double root(double arg){
        return Math.sqrt(arg);
    }
}


public class class_test {
    public static void main(String[] args){

        math_custom calculos_Pyhagoreus = new math_custom();

        calculos_Pyhagoreus.a = 4;
        calculos_Pyhagoreus.b = 3;

        System.out.println("Сумма квадрата " + calculos_Pyhagoreus.a + " и квадрата " +
                calculos_Pyhagoreus.b + " = " + calculos_Pyhagoreus.hypotenus());
        System.out.println("корень выражения:" +
                calculos_Pyhagoreus.root(calculos_Pyhagoreus.hypotenus()));

        math_custom other_calculus = new math_custom();
        other_calculus.a = 6;
        other_calculus.b = 16;

        System.out.println();
        System.out.println("корень выражения c calculos_Pyhagoreus:" +
                other_calculus.root(calculos_Pyhagoreus.hypotenus()));

        System.out.println("корень выражения c other_calculus:" +
                other_calculus.root(other_calculus.hypotenus()));


    }
}


