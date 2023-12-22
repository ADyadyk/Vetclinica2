package Lesson;

import Lesson.Animals.*;
import Lesson.Staff.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static <Animal> void main(String[] args) {
        // Создадим животных:
        Cat barsik = new Cat("Barsik",
                LocalDate.of(1990,01,03),
                new ArrayList<>(), "Chumka", "Arkady");
        Eagle kesha = new Eagle("Kesha",
                LocalDate.of(1985,12,27),
                new ArrayList<>(), "Heart disease", "Sasha");
        Goose gaga = new Goose("Gaga",
                LocalDate.of(2003,10,15),
                new ArrayList<>(), "Wing fracture", "Nina");
        Elephant tuzik = new Elephant("Tuzik",
                LocalDate.of(2000,07,15),
                new ArrayList<>(), "Runny nose", "Olga");
        Fish shark = new Fish("Shark",
                LocalDate.of(1900,07,15),
                new ArrayList<>(), "Depression", "Ivan");
        // Добавим животных в список больных животных:
        ArrayList<Lesson.Animals.Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(kesha);
        animals.add(gaga);
        animals.add(tuzik);
        animals.add(shark);

        // Проверим, что умеют делать животные:
        /*
        System.out.println("Что умеет делать " + barsik.getName() + "?");
        barsik.swim();
        barsik.toGo();
        System.out.println();
        System.out.println("Что умеет делать " + kesha.getName() + "?");
        kesha.fly();
        kesha.toGo();
        kesha.swim();
        System.out.println();
        System.out.println("Что умеет делать " + gaga.getName() + "?");
        gaga.fly();
        gaga.swim();
        gaga.toGo();
        System.out.println();
        System.out.println("Что умеет делать " + tuzik.getName() + "?");
        tuzik.swim();
        tuzik.toGo();
        System.out.println();
        System.out.println("Что умеет делать " + shark.getName() + "?");
        shark.swim();
         */

        // Создадим медсестёр:
        Nurse anna = new Nurse("Anna", 10);
        Nurse liza = new Nurse("Liza", 5);
        Nurse galina = new Nurse("Galina", 7);

        anna.care(barsik.getName());
        liza.care(tuzik.getName());
        galina.care(shark.getName());

        // Создадим старшую медсестру:
        HeadNurse senior = new HeadNurse("Старшая медсестра", 50);

        System.out.print("Медсестра " + senior.getName() + " ");
        senior.takeBlood(gaga);

        // Создадим докторов:
        Surgeon surgeon = new Surgeon("Хирург", 25, anna);
        Ophthalmologist ophthalmologist = new Ophthalmologist("Окулист", 10);

        surgeon.operate(tuzik, liza);
        surgeon.operate(barsik);
        ophthalmologist.eyeCheck(kesha);

        // Создадим ветеринарную клинику:
        VeterinaryClinic goodDoctor = new VeterinaryClinic("Добрый доктор");

        // Добавим список животных в ветеренарную клинику:
        goodDoctor.setAnimals(animals);
        // Найдём животных, умеющих ходить, плавать, летать:
        /*
        goodDoctor.findFly();
        System.out.println();
        goodDoctor.findToGo();
        System.out.println();
        goodDoctor.findSwim();
         */

        // Создадим список медсестер и добавим их в ветеренарную клинику:
        ArrayList<Lesson.Staff.Nurse> nurses = new ArrayList<>();
        nurses.add(anna);
        nurses.add(galina);
        nurses.add(liza);
        nurses.add(senior);

        goodDoctor.setNurses(nurses);

        // Создадим список докторов и добавим его в ветеренарную клинику:
        ArrayList<Lesson.Staff.Doctors> docs = new ArrayList<>();
        docs.add(surgeon);
        docs.add(ophthalmologist);

        goodDoctor.setDocs(docs);

        System.out.println();
        // Выплати зарплату персоналу
        System.out.println("Выплата зарплаты:");
        goodDoctor.salaryPayment();

    }
}