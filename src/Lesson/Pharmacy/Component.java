package Lesson.Pharmacy;

public class Component implements Comparable<Component>{
    private String name;
    private String weight;
    private int power;

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public String getName() {
        return name;
    }

    /**
     Переопределённый метод toString()
     */
    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", power=" + power +
                '}';
    }

    @Override
    public int compareTo(Component o) {
//        return Integer.compare(o.power, this.power); // Сортировка по убыванию
        return Integer.compare(this.power, o.power); // Сортировка по возрастанию
//        // Сортировка по возрастанию
//        if (this.power > o.power) return 1;
//        if (this.power < o.power) return -1;
//        else return 0;
    }
}
