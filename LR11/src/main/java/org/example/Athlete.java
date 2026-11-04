package org.example;

public class Athlete {
    private String name;
    private String team;
    private int number;

    public Athlete(String name, String team, int number) {
        this.name = name;
        this.team = team;
        this.number = number;
    }

    public String getPosition() {
        return "Неизвестная позиция";
    }

    public void train() {
        System.out.println("Тренируюсь");
    }

    public void train(int hours) {
        System.out.println("Тренируюсь " + hours + " часов");
    }

    public void train(String exercise) {
        System.out.println("Тренирую " + exercise);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}