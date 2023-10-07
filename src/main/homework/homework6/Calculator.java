package homework.homework6;
/*
    Задача 1:
    1.1 Создать класс Calculator с полями weight, cost, color и заполнить их. И методами
    нахождения суммы, разности, деления, умножения двух чисел. Метод main в этом классе
    не создавать !
    1.2 Создать объект класса Calculator в main методе другого класса. Проверить работу
    методов и вывести в консоль значения полей weight, cost, color.
    1.3 Создать конструктор для класса Calculator, чтобы иметь возможность
    инициализировать поля в момент создания объекта. Также в логическом блоке добавить
    вывод в консоль, создаётся объект Calculator.
 */
public class Calculator {
    private double weight;
    private double cost;
    private String color;

    {
        System.out.println("Calculator is being created.");
    }

    public Calculator(double weight, double cost, String color) {
        this.weight = weight;
        this.cost = cost;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double sum(double a, double b){
        return a + b;
    }

    public double subtraction (double a, double b){
        return a - b;
    }

    public double division (double a, double b){
        if(b == 0) {
            System.out.println("Error!!! Division by zero!!!");
        }
            return a / b;
    }

    public double multiplication (double a, double b){
        return a * b;
    }
}
