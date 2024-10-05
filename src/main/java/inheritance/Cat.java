package inheritance;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("meow");
    }
    public void scratch(){
        System.out.println("i am a cat i scratch things");
    }
}
