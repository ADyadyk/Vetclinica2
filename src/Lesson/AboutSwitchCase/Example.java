package Lesson.AboutSwitchCase;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

public class Example {
    // Создадим map для хранения операторов и действий:
    static Map<Character, BinaryOperator<Double>> map = new HashMap<>();
    /**
    Заполняет map, хранящую операторы и действия
     */
    public static void fillMap(){
        map.put('*', (x,y) -> x * y);
        map.put('+', (x,y) -> x + y);
        map.put('-', (x,y) -> x - y);
        map.put('/', (x,y) -> x / y);
    }
    public static void main(String[] args) {
        fillMap();
        System.out.println( switchCase('-',2,3));
        System.out.println( switchToMap('-',2,3));
    }

    /**
     *
     * @param operator
     * @param a
     * @param b
     * @return
     * Вариант "плохого" кода
     */
    public static double switchCase(char operator, double a, double b){
        double result = 0;
        switch (operator) {
            case ('*') -> result = a * b;
            case ('+') -> result = a + b;
            case ('-') -> result = a - b;
            case ('/') -> result = a / b;
            default -> throw new RuntimeException("Опрерация не поддерживается!");
        }
        return result;
    }

    /**
    Вариант кода с использованием функционального интерфейса
     */
    public static double switchToMap(char operator, double a, double b){
        return map.get(operator).apply(a,b);
    }
}
