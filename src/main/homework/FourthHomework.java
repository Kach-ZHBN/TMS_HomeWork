package homework;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class FourthHomework {

    public static void main(String[] args) {
        System.out.println("Enter array size");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        /* Ручной ввод массива
        for(int i = 0; i < array.length; i++){
            System.out.println("Enter array element " + i);
            array[i] = scanner.nextInt();
        }
         */

        //Заполнение массива рандомом. Пусть диапазон будет 0 - 100.
        for(int i = 0; i < array.length; i++){
                array[i] = (int) (Math.random() * 100);
        }

        directOutput(array);
        reverseOutput(array);

        System.out.println("Min array element - " + getMinElementOfArray(array));
        System.out.println("Max array element - " + getMaxElementOfArray(array));

        System.out.println("Index of the minimum array element - " + getIndexOfMinimumArrayElement(array));
        System.out.println("Index of the maximum array element - " + getIndexOfMaximumArrayElement(array));

        if(getNumberOfZeroElements(array) != 0){
            System.out.println("Array contains " + getNumberOfZeroElements(array) + " zero elements");
        }else{
            System.out.println("Array doesn't contain zero elements");
        }

        fifthTask(array);
        System.out.print("Task 5 -> ");
        directOutput(array);

        System.out.print("Task 6 -> ");
        if(isSorted(array))
            System.out.println("Array is sorted");
        else
            System.out.println("Array isn't sorted");

        System.out.println("Difficult task");
        difficultTask();
        scanner.close();
    }

    //Task 1
    public static void directOutput(int[] array) {
        System.out.print("Direct output: ");
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    //Task 1
    public static void reverseOutput(int[] array) {
        System.out.print("Reverse output: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //Task 2
    public static int getMinElementOfArray(int[] array){
        int minElement = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] < minElement){
                minElement = array[i];
            }
        }
        return minElement;
    }

    //Task 2
    public static int getMaxElementOfArray(int[] array){
        int maxElement = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > maxElement){
                maxElement = array[i];
            }
        }
        return maxElement;
    }

    //Task 3
    public static int getIndexOfMinimumArrayElement(int[] array){
        int minElement = getMinElementOfArray(array);
        for (int i =0; i < array.length; i++){
            if (array[i] == minElement){
                return i;
            }
        }
        return -1;
    }

    //Task 3
    public static int getIndexOfMaximumArrayElement(int[] array){
        int maxElement = getMaxElementOfArray(array);
        for (int i =0; i < array.length; i++){
            if (array[i] == maxElement){
                return i;
            }
        }
        return -1;
    }

    //Task 4
    public static int getNumberOfZeroElements(int[] array){
        int numberOfZeroElements = 0;
        int[] sortedArray = new int[array.length];
        System.arraycopy(array, 0, sortedArray, 0, array.length);
        Arrays.sort(sortedArray);

        for (int element : sortedArray) {
            if (element < 0) {
                continue; //Унифицировал метод. Это на случай, если на входе будет массив с отрицательными значениями
            } else if (element == 0) {
                numberOfZeroElements++;
            } else {
                break;
            }
        }
        return numberOfZeroElements;
    }

    //task 5
    public static void fifthTask(int[] array){
        int temp;
        for(int i = 0; i < array.length / 2; i++){
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    //Task 6
    public static boolean isSorted(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            if (array[i] > array[i + 1]){
                return false;
            }
        }
        return true;
    }

    public static void difficultTask(){
        SecureRandom secureRandom = new SecureRandom();
        int inputNumber = 0;
        int outputArrayLength = 0;

        //Создание нового рандомного массива
        int inputArrayLength = secureRandom.nextInt(10) + 1; // Генерируем размер массива от 1 до 10
        int[] inputArray = new int[inputArrayLength];

        //Заполняем массив рандомными значениями от 0 до 9
        for(int i = 0; i < inputArray.length; i++){
            inputArray[i] = secureRandom.nextInt(10); //Заполняем массив значениями от 0 до 9
        }
        if(inputArray[0] == 0) // Гарантия того, что в старшем разряде не будет нуля
            inputArray[0] = secureRandom.nextInt(9) + 1;

        System.out.println("Input: " + Arrays.toString(inputArray));

        for(int i = inputArray.length - 1; i >= 0; i --){ //Преобразую массив в число
            inputNumber += (inputArray[i] * Math.pow(10, inputArray.length - 1 - i));
        }

        inputNumber++;//Увеличиваю преобразованное число на 1

        //Считаю разряды числа для того, чтобы создать новый массив
        int temp = inputNumber;
        while(temp > 0){
            temp /= 10;
            outputArrayLength++;
        }

        //Преобразование числа в массив
        int[] outputArray = new int[outputArrayLength];
        for(int i = outputArray.length - 1; i >= 0; i --){
            outputArray[i] = inputNumber % 10;
            inputNumber /= 10;
        }
        System.out.println("Output: " + Arrays.toString(outputArray));
    }
}
