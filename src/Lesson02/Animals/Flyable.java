package Lesson02.Animals;

public interface Flyable {
    default public void fly(){
        System.out.println("I can fly!");
    }
}
