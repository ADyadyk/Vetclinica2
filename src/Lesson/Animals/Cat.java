package Lesson.Animals;

import java.time.LocalDate;
import java.util.List;

/**
 Кошка умеет ходить, но НЕ УМЕЕТ летать и не любит плавать.
 */
public class Cat extends Animal implements ToGoable, Swimable{
    public Cat(String name, LocalDate birthDate, List<String> vaccination, String illness, String owner) {
        super(name, birthDate, vaccination, illness, owner);
    }
}
