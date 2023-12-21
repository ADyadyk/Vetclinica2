package Lesson02.Animals;

import java.sql.SQLOutput;

public interface ToGoable {
    default public void toGo(){
        System.out.println("I can go!");
    }
}
