package Lesson.Staff;

import Lesson.Animals.Animal;

public interface TakeBloodable {
    default public void takeBlood(Animal animal){
        System.out.println("Взяла кровь у животного " + animal.getName() + "!");
    }
}
