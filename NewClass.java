interface MyInt1{

    public void method1();
}

interface MyInt2 extends MyInt1{

    public void method2();
}
public class NewClass implements MyInt2 {

    public void method1(){
        System.out.println("Method1");
    }

    public void method2(){
        System.out.println("Method2");
    }

    public static void main(String[] args) {
        NewClass obj = new NewClass();
        obj.method1();
        obj.method2();
    }
}
