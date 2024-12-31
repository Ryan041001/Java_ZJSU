package ZooManagement;

import java.util.*;

public class Main1 {
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


        // 初始化管理员
        System.out.println("----------------------------------------------------------------------------------------------------\n" +
                "----------------------------------------动物园管理员信息-----------------------------------------------");
        for (int i = 0; i < 100; i++) {
            String name = randomString(7);
            int age = 20 + rand.nextInt(46);
            Admin admin = new Admin(name, age, "2021-11-30");
            for (int j = 0; j < 10; j++) {
                Iterator<Map.Entry<Integer, Animal>> iterator = animals.entrySet().iterator();
                while (iterator.hasNext()) {
                    Map.Entry<Integer, Animal> entry = iterator.next();
                    Animal animal = entry.getValue();
                    if (!admin.animals.contains(animal)) { // 确保动物不被重复添加
                        admin.addAnimal(animal);
                        iterator.remove(); // 移除动物，防止被其他管理员管理
                        break;
                    }
                }
            }
            zoo.addAdmin(admin); // 正确调用 addAdmin 方法
            System.out.println("Admin{" + "name='" + admin.name + "', age=" + admin.age + ", regTime='" + admin.regTime + "', animals=" + admin.animals + "}");
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
