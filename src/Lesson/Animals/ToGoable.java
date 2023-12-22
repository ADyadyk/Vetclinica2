package Lesson.Animals;

public interface ToGoable {
    default public void toGo(){
        System.out.println("I can go!");
    }
}
