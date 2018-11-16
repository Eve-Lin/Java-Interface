interface Car{

    public void drive();
    String safety = "Drive safely";  //All the fields declared in an interface are
                                     //implicitly public, static and final constants.
}



public class MyCar implements Car {


    public void drive(){

        System.out.println("It drives fast!");

    }

    public static void main(String[] args) {
        MyCar miniCooper = new MyCar();
        miniCooper.drive();
        System.out.println(miniCooper.safety);

    }
}
