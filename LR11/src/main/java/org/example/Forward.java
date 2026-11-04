package org.example;

public class Forward extends Athlete {
    private int goals;

    public Forward(String name, String team, int number, int goals) {
        super(name, team, number);
        this.goals = goals;
    }

    @Override
    public String getPosition() {
        return "Нападающий";
    }

    public void train(String exercise, int intensity) {
        System.out.println("Нападающий отрабатывает " + exercise + " с интенсивностью " + intensity + "/10");
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }
}