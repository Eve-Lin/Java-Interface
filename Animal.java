interface Animal1 {
    public void animalSound();
    public void sleep();
}



class Pig implements Animal1{
    public void animalSound(){
        System.out.println("The pig says: wee wee");
    }
    public void sleep (){
        System.out.println("Zzz");
    }
}

  //separate file
public class Animal {  

    public static void main(String[] args) {
        Pig piggy = new Pig();
        piggy.animalSound();
        piggy.sleep();
    }

}

