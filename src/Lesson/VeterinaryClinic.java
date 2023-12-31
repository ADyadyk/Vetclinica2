package Lesson;

import Lesson.Animals.Animal;
import Lesson.Animals.Flyable;
import Lesson.Animals.Swimable;
import Lesson.Animals.ToGoable;
import Lesson.Staff.Doctors;
import Lesson.Staff.Nurse;

import java.util.ArrayList;

public class VeterinaryClinic{
    private String name; // Название ветеринарной клиники
    private ArrayList<Animal> animals; // список животных
    private ArrayList<Doctors> docs; //  список докторов
    private ArrayList<Nurse> nurses; // список медсестер

    public VeterinaryClinic(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public void setDocs(ArrayList<Doctors> docs) {
        this.docs = docs;
    }
    public void setNurses(ArrayList<Nurse> nurses) {
        this.nurses = nurses;
    }

    /**
     Метод определяющий летающих животных
     */
    public void findFly(){
        System.out.println("Летающие животные:");
        for(int i=0; i< animals.size(); i++){
            if (animals.get(i) instanceof Flyable){
                System.out.println(animals.get(i).getType()+" " + animals.get(i).getName() + " - летает.");
            }
        }
    }

    /**
     Метод определяющий ходящих животных
     */
    public void findToGo(){
        System.out.println("Ходящие животные:");
        for(int i=0; i< animals.size(); i++){
            if (animals.get(i) instanceof ToGoable){
                System.out.println(animals.get(i).getType()+" " + animals.get(i).getName() + " - ходят.");
            }
        }
    }

    /**
     Метод определяющий плавающих животных
     */
    public void findSwim(){
        System.out.println("Плавающие животные:");
        for (Animal animal : animals) {
            if (animal instanceof Swimable) {
                System.out.println(animal.getType() + " " + animal.getName() + " - плавают.");
            }
        }
    }

    /**
     Метод, отображающий информацию о выплате заработной платы:
     */
    public void salaryPayment(){
        for (Doctors doc : docs) {
            System.out.println(doc.getName() + " - получил зарплату.");
        }
        for (Nurse nurs : nurses) {
            System.out.println(nurs.getName() + " - получила зарплату.");
        }
    }
}
