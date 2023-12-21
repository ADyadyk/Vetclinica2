package Lesson02.Staff;

import Lesson02.Animals.Animal;

public class Ophthalmologist extends Doctors implements EyeCheckable{
    public Ophthalmologist(String name, int experiense) {
        super(name, experiense);
    }

    @Override
    public void eyeCheck(Animal animal) {
        System.out.println("Выполнена проверка глаз у животного " + animal.getName() + " окулистом " + super.name);
    }
}
