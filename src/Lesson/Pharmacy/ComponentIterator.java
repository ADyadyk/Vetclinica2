package Lesson.Pharmacy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ComponentIterator implements Iterator<Component> {
    private int index = 0;
    private final IterablePharmacy iterablePharmacy;

    public ComponentIterator(IterablePharmacy iterablePharmacy) {
        this.iterablePharmacy = iterablePharmacy;
    }

    @Override
    public boolean hasNext() {
        return index < iterablePharmacy.getComponents().size(); // Сравниваем индекс с длиной списка
    }

    @Override
    public Component next() {
        return iterablePharmacy.getComponents().get(index++); // Получаем компонент по индексу, а потом увеличиваем индекс на еденицу
    }
}
