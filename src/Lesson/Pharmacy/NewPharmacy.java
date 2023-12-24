package Lesson.Pharmacy;

import java.util.*;

public class NewPharmacy implements Comparable<NewPharmacy>{
    private int index;
    private String name;
    private final List<Component> components;

    public NewPharmacy(String name) {
        this.index = 0;
        this.name = name;
        this.components = new ArrayList<>();
    }


    /**
     Метод, добавляющий список компонентов в лекарство
     */
    public void addComponents(Component ... components){
        if(components.length == 0) System.out.println("Вы ничего не добавили!");
        else Collections.addAll(this.components, components);
    }


    // Переопределим методы equals() и hasCode() класса Object:
    @Override
    public boolean equals(Object o) {
//        System.out.println("Equals is called: " + this + " - " + o); // Вывод в консоль того, что происходит в equals()
        if (this == o) return true; // Рефлексивность - любой объект должен быть equals() самому себе
        if (o == null || getClass() != o.getClass()) return false; // Проверка на равенство null и равенство классов
        NewPharmacy that = (NewPharmacy) o;
        return index == that.index && components.equals(that.components); // Проверка на равенство значений полей

    }

    // Самостоятельное переопределение hashCode() для NewPharmacy:
    @Override
    public int hashCode() {
        return components.hashCode();
    }
    // Автоматическое переопределение с помощью generate vai wizard
//    @Override
//    public int hashCode() {
//        return Objects.hash(index, components);
//    }



    // Переопределим метод compereTo(), чтобы он мог сравнивать лекарства по суммарной силе компонентов:
    @Override
    public int compareTo(NewPharmacy o) {
        int powerThis = 0;
        for(Component item : this.components){
            powerThis += item.getPower();
        }
        int powerO = 0;
        for (Component item : o.components){
            powerO += item.getPower();
        }
        if(powerThis > powerO) return 1;
        if(powerThis < powerO) return -1;
        else return 0;
    }

    @Override
    public String toString() {
        StringBuilder componentName = new StringBuilder();
        int powerComponents = 0;
        for(Component item : components){
            componentName.append(", ").append(item.getName());
            powerComponents += item.getPower();
        }
        return "Суммараная power лекарства - " + name + ", включающего данные компоненты: " +
                " {" + componentName + "} равна - " + powerComponents  + "\n";
    }
}
