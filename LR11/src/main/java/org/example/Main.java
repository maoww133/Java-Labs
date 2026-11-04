package org.example;

public class Main {
    public static void main(String[] args) {
        Athlete baseAthlete = new Athlete("Алексей", "Сборная", 10);
        baseAthlete.train();
        baseAthlete.train(3);
        baseAthlete.train("дриблинг");

        Forward forward = new Forward("Килиан", "Реал", 9, 25);
        Goalkeeper goalkeeper = new Goalkeeper("Тибо", "Реал", 1, 80);

        forward.train("удары по воротам", 9);
        goalkeeper.train(true);

        Athlete[] squad = {
                new Athlete("Иван", "Спартак", 5),
                forward,
                goalkeeper
        };

        for (Athlete a : squad) {
            System.out.println("Спортсмен: " + a.getName() + ", Команда: " + a.getTeam() +
                    ", Номер: " + a.getNumber() + ", Позиция: " + a.getPosition());
        }
    }
}