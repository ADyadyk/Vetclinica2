package Lesson.Animals;

public interface Flyable {
    default public void fly(){
        System.out.println("I can fly!");
    }
}
