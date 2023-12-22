package Lesson.Animals;

public interface Swimable {
    default public void swim(){
        System.out.println("I can swim!");
    }
}
