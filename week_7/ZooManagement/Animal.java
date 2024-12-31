package ZooManagement;

public class Animal {
    String category;
    String name;
    int age;
    int weight;
    int height;

    public Animal(String category, String name, int age, int weight, int height) {
        this.category = category;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Animal{Category='" + category + "', name='" + name + "', age=" + age + ", weight=" + weight + ", height=" + height + "}";
    }
}
