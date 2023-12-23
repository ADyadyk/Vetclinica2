package Lesson.Pharmacy;

import java.util.Iterator;

public class PharmacyMain {
    public static void main(String[] args) {
        // Создадим компаненты для лекарств:
        Component pineceline = new Component("Pineceline", "10mg", 100);
        Component salt = new Component("Salt", "50mg", 13);
        Component sugar = new Component("Sugar", "24mg", 78);

        // Создадим лекарство:
        Pharmacy pharmacy1 = new Pharmacy();
        pharmacy1.addComponents(salt, pineceline);
        Pharmacy pharmacy2 = new Pharmacy();
        pharmacy2.addComponents(sugar,pineceline);

        // Создадим итератор:
        Iterator<Component> iterator = pharmacy2;

        while(iterator.hasNext()){
            //System.out.println(iterator.next());
            System.out.println(pharmacy2.next());
        }
        /*
        * Так же можно записать в таком виде:
        * */
//        while(pharmacy2.hasNext()){
//            System.out.println(pharmacy2.next());
//        }

    }
}
