package Lesson02.Staff;

import Lesson02.Animals.Animal;

/**
 Хирург
 */
public class Surgeon extends Doctors implements Operateable{
    public Surgeon(String name, int experiense) {
        super(name, experiense);
    }

    public Surgeon(String name, int experiense, Nurse nurse) {
        super(name, experiense, nurse);
    }

    @Override
    public void operate(Animal animal, Nurse nurse) {
        System.out.println("Медсестра " + nurse.getName() +
                " ухаживает за животным " + animal.getName() +
                " после операции, которую провел доктор " + super.name + ".");
    }

    @Override
    public void operate(Animal animal) {
        System.out.println("Медсестра " + nurse.getName() +
                " ухаживает за животным " + animal.getName() +
                " после операции, которую провел доктор " + super.name + ".");
    }

}
