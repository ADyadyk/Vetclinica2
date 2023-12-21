package Lesson02.Animals;

import java.time.LocalDate;
import java.util.List;

/**
 Гусь умеет летать, плавать и ходить.
 */
public class Goose extends Animal implements ToGoable, Swimable, Flyable{
    public Goose(String name, LocalDate birthDate, List<String> vaccination, String illness, String owner) {
        super(name, birthDate, vaccination, illness, owner);
    }
}
