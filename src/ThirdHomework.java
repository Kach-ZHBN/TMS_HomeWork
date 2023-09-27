import java.util.Scanner;

public class ThirdHomework {

    public static void main(String[] args) {
        System.out.println("Task 1 -> ");
        firstTask();
        System.out.println("Task 2 -> ");
        secondTask();
        System.out.println("Task 3 -> ");
        thirdTask();
        System.out.println("Task 4 -> ");
        fourthTask();
        System.out.println("Difficult task -> ");
        difficultTask();
    }

    public static void firstTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number.");
        int a = scanner.nextInt();
        if(a % 2 == 0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }

    public static void secondTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature");
        double temperature = scanner.nextDouble();
        if(temperature > -5){
            System.out.println("Warm");
        } else if (temperature <= -5 && temperature > -20) {
            System.out.println("Normal");
        } else{
            System.out.println("Cold");
        }
    }

    public static void thirdTask(){
        for (int i = 10; i <= 20; i++) {
            System.out.println(i + " * " + i + " = " + (i * i));
        }
    }

    public static void fourthTask(){
        int a = 0;
        while (a < 98){
            a += 7;
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void difficultTask(){
        Scanner scanner = new Scanner(System.in);
        int a;
        int result = 0;

        while (true) {
            System.out.println("Enter a positive number");
            if(scanner.hasNextInt()){
                a = scanner.nextInt();
                if (a>0){
                    break;
                }
            }else {
                scanner.next();
            }
        }

        for (int i = 1; i <= a ; i++)
            result += i;

        System.out.println(result);
        scanner.close();
    }
}
