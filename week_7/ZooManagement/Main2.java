package ZooManagement;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("杭州动物园", "杭州市西湖区虎跑路40号");
        Random rand = new Random();
        System.out.println("Zoo{name='" + zoo.name + "', address='" + zoo.address + "'}");


        // 初始化动物
        Map<Integer, Animal> animals = new HashMap<>();
        System.out.println("----------------------------------------------------------------------------------------------------\n" +
                "----------------------------------------动物园动物信息-----------------------------------------------");
        for (int i = 0; i < 1000; i++) {
            String category = Arrays.asList("大象", "长颈鹿", "老虎", "猴子").get(rand.nextInt(4));
            String name = randomString(5);
            int age = 1 + rand.nextInt(100);
            int weight;
            do {
                weight = 20 + rand.nextInt(4981);
            } while (animals.containsValue(new Animal(category, name, age, weight, 0))); // 确保体重唯一
            int height = 10 + rand.nextInt(490);
            Animal animal = new Animal(category, name, age, weight, height);
            animals.put(weight, animal); // 使用体重作为键
            System.out.println(animal);
        }

        // 检查 animals 映射是否为空
        if (animals.isEmpty()) {
            System.out.println("没有初始化任何动物。");
        } else {
            // 将 animals 映射的值转换为列表
            List<Animal> allAnimals = new ArrayList<>(animals.values());

            // 检查 allAnimals 列表是否为空
            if (allAnimals.isEmpty()) {
                System.out.println("动物列表为空。");
            } else {
                // 数据读取与排序
                Map<String, Integer> animalCount = new HashMap<>();

                for (Animal animal : allAnimals) {
                    animalCount.put(animal.category, animalCount.getOrDefault(animal.category, 0) + 1);
                }

                for (Map.Entry<String, Integer> entry : animalCount.entrySet()) {
                    System.out.println(entry.getKey() + "：" + entry.getValue() + " 只");
                }

                Collections.sort(allAnimals, (a1, a2) -> {
                    int ageComparison = Integer.compare(a1.age, a2.age);
                    if (ageComparison != 0) {
                        return ageComparison;
                    }
                    return Integer.compare(a1.weight, a2.weight);
                });

                System.out.println("\n排序后的动物信息：");
                for (Animal animal : allAnimals) {
                    System.out.println(animal);
                }
            }
        }
    }

    private static String randomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }
        return sb.toString();
    }
}