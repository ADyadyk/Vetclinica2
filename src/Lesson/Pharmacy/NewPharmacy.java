package Lesson.Pharmacy;

import java.util.*;

public class NewPharmacy /*implements Iterator<Component> */{
    private int index;
    private final List<Component> components;

    public NewPharmacy() {
        this.index = 0;
        this.components = new ArrayList<>();
    }


    /**
     Метод, добавляющий список компонентов в лекарство
     */
    public void addComponents(Component ... components){
        if(components.length == 0) System.out.println("Вы ничего не добавили!");
        else Collections.addAll(this.components, components);
    }
//
//    @Override
//    public boolean hasNext() {
//        return index < components.size(); // Сравниваем индекс с длиной списка
//    }
//
//    @Override
//    public Component next() {
//        return components.get(index++); // Получаем компонент по индексу, а потом увеличиваем индекс на еденицу
//    }

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
}
