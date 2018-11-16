interface FirstInterface {

    public void myMethod();
}

interface SecondInterface {

    public void myOtherMethod();
}


class ImplementingClass implements FirstInterface, SecondInterface{

    @Override
    public void myMethod() {
        System.out.println("Hi there!");
    }

    @Override
    public void myOtherMethod() {
        System.out.println("Nice to meet you!");
    }
}

//separate file
public class MyClass {
    public static void main(String[] args) {

        ImplementingClass myObj = new ImplementingClass();
        myObj.myMethod();
        myObj.myOtherMethod();
    }
}
