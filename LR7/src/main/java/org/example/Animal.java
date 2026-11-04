package org.example;

public class Animal {
    private String species;
    private int age;
    private double weight;

    private int kolvo;

    public int getKolvo(){
        return kolvo;
    }

    public void setKolvo(int kolvo){
        this.kolvo=kolvo;
    }

    public Animal (String species, int age, double weight, int kolvo) {
        this(species, age, weight);
        this.kolvo=kolvo;
    }

    public static void vsePolya() {
        System.out.println(totalAnimals);
        System.out.println(totalWeight);
    }
//Animal.vsePolya()


    private static int totalAnimals;
    private static double totalWeight;

    public Animal(String species, int age, double weight) {
        this.species = species;
        this.age = age;
        this.weight = weight;

        totalAnimals++;
        totalWeight += weight;
    }

    public static double getAverageWeight() {
        if (totalAnimals == 0) {
            return 0.0;
        }
        return totalWeight / totalAnimals;
    }

    public static int getTotalAnimals() {
        return totalAnimals;
    }

    public static double getTotalWeight() {
        return totalWeight;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }
}