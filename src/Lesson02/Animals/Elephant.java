package Lesson02.Animals;

import java.time.LocalDate;
import java.util.List;

/**
 Слон умеет ходить и плавать, но не умеет летать.
 */
public class Elephant extends Animal implements Swimable, ToGoable{
    public Elephant(String name, LocalDate birthDate, List<String> vaccination, String illness, String owner) {
        super(name, birthDate, vaccination, illness, owner);
    }
}
