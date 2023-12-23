package Lesson.Pharmacy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterator<Component> {
    private int index;
    private List<Component> components;

    public Pharmacy() {
        this.index = 0;
        this.components = new ArrayList<>();
    }

    @Override
    public boolean hasNext() {
        return index < components.size(); // Сравниваем индекс с длиной списка
    }

    @Override
    public Component next() {
        return components.get(index++); // Получаем компонент по индексу, а потом увеличиваем индекс на еденицу
    }
}
