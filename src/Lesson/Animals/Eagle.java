package Lesson.Animals;

import java.time.LocalDate;
import java.util.List;

/**
 Орел умеет летать, плавать и ходить.
 */
public class Eagle extends Animal implements ToGoable, Flyable, Swimable{
    public Eagle(String name, LocalDate birthDate, List<String> vaccination, String illness, String owner) {
        super(name, birthDate, vaccination, illness, owner);
    }
}
