package Lesson02.Animals;

import java.time.LocalDate;
import java.util.List;

/**
 Рыба умеет плавать, но НЕ УМЕЕТ ходить и летать.
 */
public class Fish extends Animal implements Swimable{
    public Fish(String name, LocalDate birthDate, List<String> vaccination, String illness, String owner) {
        super(name, birthDate, vaccination, illness, owner);
    }
}
