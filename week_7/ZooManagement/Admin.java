package ZooManagement;

import java.util.ArrayList;
import java.util.List;

public class Admin {
    String name;
    int age;
    String regTime;
    List<Animal> animals = new ArrayList<>();

    public Admin(String name, int age, String regTime) {
        this.name = name;
        this.age = age;
        this.regTime = regTime;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
}
