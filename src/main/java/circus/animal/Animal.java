package circus.animal;

import circus.Asset;

import java.util.Comparator;

public abstract class Animal implements Asset {

    public String name;
    public abstract String speak();

    // create a comparator object
    public static Comparator<Animal> AnimalNameComprator = new Comparator<Animal>() {
        @Override
        public int compare(Animal animal1, Animal animal2) {

            return animal1.name.compareToIgnoreCase(animal2.name);
        }
    }; // semicolon cos this is technically a single line of code
}
