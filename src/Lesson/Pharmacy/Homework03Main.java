package Lesson.Pharmacy;

import java.util.*;

public class Homework03Main {
    public static void main(String[] args) {
        // Создадим компаненты для лекарств:
        Component pineceline = new Component("Pineceline", "10mg", 100);
        Component salt = new Component("Salt", "50mg", 13);
        Component sugar = new Component("Sugar", "24mg", 78);
        Component nitrogen = new Component("Nitrogen", "400mg", 230);
        Component aspartame = new Component("Aspartame", "2mg", 4);

        // Создадим лекарства:
        NewPharmacy dogDrug = new NewPharmacy("dogDrug");
        dogDrug.addComponents(aspartame, salt, sugar);
        NewPharmacy catDrug = new NewPharmacy("catDrug");
        catDrug.addComponents(nitrogen, pineceline, aspartame);
        NewPharmacy henDrug = new NewPharmacy("henDrug");
        henDrug.addComponents(pineceline, aspartame, nitrogen, salt, sugar);
        NewPharmacy eagleDrug = new NewPharmacy("eagleDrug");
        eagleDrug.addComponents(pineceline, aspartame, nitrogen, salt, sugar);

        // Сделать так, чтобы после выполнения кода ниже, в сете result были только уникальные объекты:
        Set<NewPharmacy> result = new HashSet<>();
        result.add(dogDrug);
        result.add(catDrug);
        result.add(henDrug);
        result.add(eagleDrug);
//        // Посмотрим на hashCode наших лекарств:
//        System.out.println("hash-коды лекарств:");
//        System.out.println(dogDrug.hashCode());
//        System.out.println(catDrug.hashCode());
//        System.out.println(henDrug.hashCode());
//        System.out.println(eagleDrug.hashCode());
        System.out.println("Количество уникальных лекарств в сете:");
        System.out.println(result.size());

        // Создадим список лекарств:
        List<NewPharmacy> listNewPharmacy = new ArrayList<>();
        listNewPharmacy.add(eagleDrug); // суммарная power для eagleDrug равна - 425 (pineceline, aspartame, nitrogen, salt, sugar)
        listNewPharmacy.add(catDrug); // суммарная power для catDrug равна - 334 (nitrogen, pineceline, aspartame)
        listNewPharmacy.add(dogDrug); // суммарная power для dogDrug равна - 95 (aspartame, salt, sugar)
        listNewPharmacy.add(henDrug); // суммарная power для henDrug равна - 425 (pineceline, aspartame, nitrogen, salt, sugar)

        System.out.println();
        System.out.println("Отсортировано по возрастанию суммарной power:");
        Collections.sort(listNewPharmacy);
        System.out.println(listNewPharmacy);

    }
}
