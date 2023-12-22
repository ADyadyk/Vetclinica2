package Lesson.Staff;

import Lesson.Animals.Animal;

public interface Operateable {
    public void operate(Animal animal, Nurse nurse);
    public void operate(Animal animal);
}
