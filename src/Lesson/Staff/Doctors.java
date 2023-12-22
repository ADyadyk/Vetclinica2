package Lesson.Staff;

public abstract class Doctors{
    protected String name;
    protected int experiense;
    protected Nurse nurse;

    public Doctors(String name, int experiense) {
        this.name = name;
        this.experiense = experiense;
        this.nurse = null;
    }

    public Doctors(String name, int experiense, Nurse nurse) {
        this.name = name;
        this.experiense = experiense;
        this.nurse = nurse;
    }

    public String getName() {
        return name;
    }

    public int getExperiense() {
        return experiense;
    }

    public Nurse getNurse() {
        return nurse;
    }
}
