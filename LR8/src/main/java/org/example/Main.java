package org.example;

public class Main {
    public static void main(String[] args) {
        Pet[] pets = new Pet[5];

        pets[0] = new DogPet("Шарик", 4, "Иван", "Немецкая овчарка");
        pets[1] = new DogPet("Пушинчик", 2, "Алексей", "Шпиц");
        pets[2] = new DogPet("Бобик", 5, "Ольга", "Такса");
        pets[3] = new CatPet("Мурка", 3, "Злата", "Рыжий");
        pets[4] = new CatPet("Барсик", 1, "Елена", "Серый");

        for (Pet p : pets) {
            p.displayInfo();
            p.play();

            // Демонстрация уникальных методов подклассов
            if (p instanceof DogPet dog) {
                dog.bark();
            } else if (p instanceof CatPet cat) {
                cat.meow();
            }
        }
    }
}