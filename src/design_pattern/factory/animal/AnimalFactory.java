package design_pattern.factory.animal;

public class AnimalFactory {
    public Animal getAnimal(String type) {
        if (type.equalsIgnoreCase("cow")) {
            return new Cow();
        } else if (type.equalsIgnoreCase("dog")) {
            return new Dog();
        } else if (type.equalsIgnoreCase("horse")) {
            return new Horse();
        }
        return null;
    }

    public static void main(String[] args) {
        AnimalFactory myFactory = new AnimalFactory();
        Animal dog = myFactory.getAnimal("dog");
        Animal cow = myFactory.getAnimal("cow");
        Animal horse = myFactory.getAnimal("horse");
        dog.sing();
        cow.sing();
        horse.sing();
    }
}
