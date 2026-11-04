package org.example;

public class Goalkeeper extends Athlete {
    private int saves;

    public Goalkeeper(String name, String team, int number, int saves) {
        super(name, team, number);
        this.saves = saves;
    }

    @Override
    public String getPosition() {
        return "Вратарь";
    }

    public void train(boolean withGoalkeepingGloves) {
        if (withGoalkeepingGloves) {
            System.out.println("Вратарь тренирует реакцию в перчатках");
        } else {
            System.out.println("Вратарь тренирует ОФП без перчаток");
        }
    }

    public int getSaves() {
        return saves;
    }

    public void setSaves(int saves) {
        this.saves = saves;
    }
}