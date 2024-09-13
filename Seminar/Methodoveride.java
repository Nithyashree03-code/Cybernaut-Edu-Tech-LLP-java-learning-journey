class Animal {
    // Method in the superclass
    public void makeSound() {
        System.out.println("Some sound");
    }
}
class Dog extends Animal {
    // Overriding the method in the subclass
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}
public class Methodoveride{
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound();  // Calls the method from Animal class
        Dog myDog = new Dog();
        myDog.makeSound();     // Calls the overridden method from Dog class
        // Using polymorphism
    }
}
