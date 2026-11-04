package org.example;

public class Main {
    public static void main(String[] args) {

        Animal a1 = new Animal("Лев", 5, 190.5);
        Animal a2 = new Animal("Жираф", 7, 820.0);
        Animal a3 = new Animal("Медведь", 4, 310.2);
        Animal a4 = new Animal("Кенгуру", 3, 65.8);
        Animal a5 = new Animal("Зебра", 6, 350.0);

        Animal[] zoo = {a1, a2, a3, a4, a5};
        System.out.println("Список животных в зоопарке:");
        for (Animal a : zoo) {
            System.out.println("Вид: " + a.getSpecies() + ", Возраст: " + a.getAge() + " лет, Вес: " + a.getWeight() + " кг");
        }

        System.out.println("Всего животных: " + Animal.getTotalAnimals());
        System.out.println("Общий вес: " + Animal.getTotalWeight() + " кг");
        System.out.println("Средний вес: " + Animal.getAverageWeight() + " кг");

    }
}