package Lesson.Pharmacy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IterablePharmacy implements Iterable<Component>{
    private int index;
    private final List<Component> components;
    // Конструктор:
    public IterablePharmacy() {
        this.index = 0;
        this.components = new ArrayList<>();
    }
    // Getter для components:
    public List<Component> getComponents() {
        return components;
    }

    /**
     Метод, добавляющий список компонентов в лекарство
     */
    public void addComponents(Component ... components){
        if(components.length == 0) System.out.println("Вы ничего не добавили!");
        else Collections.addAll(this.components, components);
    }
    // Реализация метода Iterator интерфейса Iterable:
    // Для этого создадим дополнительный класс ComponentIterator
    @Override
    public Iterator<Component> iterator() {
        return new ComponentIterator(this);
    }
}
