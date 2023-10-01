package homework;

import java.security.SecureRandom;
import java.util.Scanner;

public class FifthHomework {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 1 -> ");
        firstTask(scanner);
        System.out.println("Task 2 -> ");
        secondTask();
        System.out.println("Task * -> ");
        difficultTask(scanner);
        System.out.println("Additional task -> ");
        additionalTask(scanner);
        scanner.close();
    }

    public static void firstTask(Scanner scanner) {
        SecureRandom secureRandom = new SecureRandom();
        int addNumber;
        int sumOfAllElements = 0;

        int[][] twoDimArray = new int[secureRandom.nextInt(1, 10)]
                [secureRandom.nextInt(1, 10)];

        System.out.println("Initial array");
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = secureRandom.nextInt(100);
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the number to add");
        addNumber = scanner.nextInt();

        System.out.println("Finish array");
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] += addNumber;
                sumOfAllElements += twoDimArray[i][j];
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Summ of all element " + sumOfAllElements);
    }

    public static void secondTask() {
        String[][] chessBoard = new String[8][8];

        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    chessBoard[i][j] = "W";
                } else {
                    chessBoard[i][j] = "B";
                }
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void difficultTask(Scanner scanner) {
        System.out.println("Enter two numbers");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int counter = 0;

        int[][] twoDimArray = new int[n][m];

        for (int i = 0; i < twoDimArray.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < twoDimArray[i].length; j++) {
                    twoDimArray[i][j] = counter++;
                }
            } else {
                for (int j = twoDimArray[i].length - 1; j >= 0; j--) {
                    twoDimArray[i][j] = counter++;
                }
            }
        }

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.format("%3d ", twoDimArray[i][j]);
            }
            System.out.println();
        }
    }

    public static void additionalTask(Scanner scanner) {
        SecureRandom secureRandom = new SecureRandom();
        int n;

        while (true) {
            System.out.println("Enter number n (n >= 5)");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n >= 5) {
                    break;
                }
            } else {
                scanner.next();
            }
        }

        int[][] inputTwoDimArray = new int[n][n];
        int[][] outputTwoDimArray = new int[n][n];

        for (int i = 0; i < inputTwoDimArray.length; i++) {
            for (int j = 0; j < inputTwoDimArray[i].length; j++) {
                inputTwoDimArray[i][j] = secureRandom.nextInt(100);
                System.out.format("%3d ", inputTwoDimArray[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < outputTwoDimArray.length; i++) {
            for (int j = 0; j < outputTwoDimArray[i].length; j++) {
                outputTwoDimArray[i][j] = inputTwoDimArray[j][i];
                System.out.format("%3d ", outputTwoDimArray[i][j]);
            }
            System.out.println();
        }
    }
}
