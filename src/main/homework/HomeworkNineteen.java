package homework;

import homework.homework19.task1.ThreadToFindMax;
import homework.homework19.task1.ThreadToFindMin;
import homework.homework19.difficultTask.*;
import homework.homework19.task2.BubbleSorter;
import homework.homework19.task2.InsertionSorter;
import homework.homework19.task2.SelectionSorter;

import java.util.Random;
import java.util.concurrent.ExecutionException;

public class HomeworkNineteen {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
          Задача 1:
          Пользователь вводит с клавиатуры значение в массив. После чего запускаются два
          потока. Первый поток находит максимум в массиве, второй — минимум. Результаты
          вычислений возвращаются в метод main().
         */
        System.out.println("----Task 1----");
        Random random = new Random();
        double[] array = new double[random.nextInt(1, 20)];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        ThreadToFindMin threadToFindMin = new ThreadToFindMin(array);
        ThreadToFindMax threadToFindMax = new ThreadToFindMax(array);
        threadToFindMin.start();
        threadToFindMax.start();
        threadToFindMax.join();
        threadToFindMin.join();
        System.out.println("Max value = " + threadToFindMax.getMaxValue());
        System.out.println("Min value = " + threadToFindMin.getMinValue());

        /*
          Задача 2:
          Сортировка массива цифр в нескольких потоках различными алгоритмами:
           сортировка вставками;
           сортировка выбором;
           сортировка пузырьком.
          Каждый вид сортировки должен запускаться в отдельном потоке. После вывести
          результат отсортированных массивов в консоль.
         */
        System.out.println("----Task 2----");
        int[] unsortedArray = new int[50000];
        for (int i = 0; i < unsortedArray.length; i++) {
            unsortedArray[i] = random.nextInt();
        }

        Thread insertionSorterThread = new Thread(new Runnable() {
            @Override
            public void run() {
                long startTime = System.currentTimeMillis();
                InsertionSorter.sort(unsortedArray);
                long endTime = System.currentTimeMillis();
                System.out.println("Insert. Running time = " + (endTime - startTime) + " ms");
            }
        });

        Thread selectionSorterThread = new Thread(new Runnable() {
            @Override
            public void run() {
                long startTime = System.currentTimeMillis();
                SelectionSorter.sort(unsortedArray);
                long endTime = System.currentTimeMillis();
                System.out.println("Select. Running time = " + (endTime - startTime) + " ms");
            }
        });

        Thread bubbleSorterThread = new Thread(new Runnable() {
            @Override
            public void run() {
                long startTime = System.currentTimeMillis();
                BubbleSorter.sort(unsortedArray);
                long endTime = System.currentTimeMillis();
                System.out.println("Bubble. Running time = " + (endTime - startTime) + " ms");
            }
        });

        insertionSorterThread.start();
        selectionSorterThread.start();
        bubbleSorterThread.start();
        insertionSorterThread.join();
        selectionSorterThread.join();
        bubbleSorterThread.join();

        /*
          Задача *:
          Имеются сущности Магазин, Производитель, Покупатель. Цель задачи сделать так, чтобы
          производитель произвел 5 единиц продукта, а покупатель их купил. Пока производитель
          не произвел продукт, покупатель не может его купить. При этом одновременно в магазине
          может находиться не более 3 товаров.
         */
        System.out.println("----Difficult task ----");
        Shop shop = new Shop();
        Producer producer = new Producer(shop);
        Consumer consumer = new Consumer(shop);

        Thread producerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    try {
                        producer.supplyProductToShop();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });


        Thread consumerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    try {
                        consumer.buyProduct();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        producerThread.start();
        consumerThread.start();
        producerThread.join();
        consumerThread.join();
    }
}
