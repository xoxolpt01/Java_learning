package Volume_4;



// Параметризованный конструктор.
class MyClass_param {
    int x;
    MyClass_param(int i){
        x = i;
    }
}

class ParmConsDemo {
    public static void main(String[] args) {
        MyClass_param t1 = new MyClass_param(10);
        MyClass_param t2 = new MyClass_param(88);
        System.out.println(t1.x + " " + t2.x);
    }
}

