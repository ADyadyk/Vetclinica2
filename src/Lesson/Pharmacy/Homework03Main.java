package Lesson.Pharmacy;

import java.util.HashSet;
import java.util.Set;

public class Homework03Main {
    public static void main(String[] args) {
        // Создадим компаненты для лекарств:
        Component pineceline = new Component("Pineceline", "10mg", 100);
        Component salt = new Component("Salt", "50mg", 13);
        Component sugar = new Component("Sugar", "24mg", 78);
        Component nitrogen = new Component("Nitrogen", "400mg", 230);
        Component aspartame = new Component("Aspartame", "2mg", 4);

        // Создадим лекарства:
        NewPharmacy dogDrug = new NewPharmacy();
        dogDrug.addComponents(aspartame, salt, sugar);
        NewPharmacy catDrug = new NewPharmacy();
        catDrug.addComponents(nitrogen, pineceline, aspartame);
        NewPharmacy henDrug = new NewPharmacy();
        henDrug.addComponents(pineceline, aspartame, nitrogen, salt, sugar);
        NewPharmacy eagleDrug = new NewPharmacy();
        eagleDrug.addComponents(pineceline, aspartame, nitrogen, salt, sugar);

        // Сделать так, чтобы после выполнения кода ниже, в сете result были только уникальные объекты:
        Set<NewPharmacy> result = new HashSet<>();
        result.add(dogDrug);
        result.add(catDrug);
        result.add(henDrug);
        result.add(eagleDrug);
        System.out.println(result.size());

    }
}
