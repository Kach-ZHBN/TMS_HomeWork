public class SecondHomeWork {
    public static void main(String[] args) {
        System.out.print("Task 1 -> ");
        task1();
        System.out.print("Task 2 -> ");
        task2();
        System.out.print("Task 3 -> ");
        task3();
        System.out.print("Task 4 -> ");
        task4();
        System.out.print("Task 5 -> ");
        task5();
        System.out.print("Task * -> ");
        difficultTask();
    }

    public static void task1(){
        double b = 2.53;
        double c = 185;
        System.out.println("a = " + ( 4 * (b + c - 1) / 2));
    }

    public static void task2(){
        byte n = 85;
        System.out.println(n / 10 + n % 10);
    }

    public static void task3(){
        int n = 198;
        System.out.println(n / 100 + n / 10 % 10 + n % 10);
    }

    public static void task4(){
        double n = 33.557;
        //System.out.println(Math.round(n)); // Предполагаю, что сейчас не про библиотеку Math.

        if ( ((int)(n * 10 )) % 10 < 5){
            System.out.println((int)n);
        }else{
            System.out.println((int)n + 1);
        }
    }

    public static void task5(){
        int q = 43;
        int w = 7;
        System.out.println(q + " / " + w + " = " + (q / w) + " и " + (q % w) + " в остатке");
    }

    public static void difficultTask(){
        //Усовершенствованная программа
        int a = 1;
        int b = 2;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
}
