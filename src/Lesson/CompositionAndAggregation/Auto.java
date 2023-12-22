package Lesson.CompositionAndAggregation;

public class Auto {
    private Engine engine; // Композиция - жёсткая связь
    private Driver driver; // Агрегация - гибкая связь

    public Auto(Engine engine) {
        this.engine = engine;
        this.driver = null;
    }

    public Auto(Engine engine, Driver driver) {
        this.engine = engine;
        this.driver = driver;
    }
    // Между двигателем и автомобилем получилась жёсткая связь потому, что во всех конструкторах необходимо передавать в качестве параметра двигатель
    // Между водитлем и автомобилем получилась гибкая связь потому, что есть конструктор, в котором можно не передавать в качестве параметра водителя
}
