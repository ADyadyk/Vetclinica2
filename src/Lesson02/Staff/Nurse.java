package Lesson02.Staff;

import Lesson02.Animals.Animal;

public class Nurse {
    private String name;
    private int experiense;

    public Nurse(String name, int experiense) {
        this.name = name;
        this.experiense = experiense;
    }

    public String getName() {
        return name;
    }

    public int getExperiense() {
        return experiense;
    }

    // Метод - уход за больными животными:
    public void care(String name){
        System.out.println("Медсестра " + this.name + " ухаживает за " + name + "!");
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "name='" + name + '\'' +
                ", experiense=" + experiense +
                '}';
    }
}
