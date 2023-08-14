public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        //task1
        System.out.println("task1");
        for (int i = 0; i <= 10; i = i + 1) {
            System.out.println("числа i " + i);
        }
    }

    public static void task2() {
        //task2
        System.out.println("task2");
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println("числа i " + i);
        }
    }

    public static void task3() {
        //task3
        System.out.println("task3");
        for (int i = 0; i % 2 == 0 && i <= 17; i = i + 2) {
            System.out.println("четные числа i " + i);
        }
    }

    public static void task4() {
        //task4
        System.out.println("task4");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println("i " + i);
        }
    }

    public static void task5() {
        //task5
        System.out.println("task5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
    }

    public static void task6() {
        //task6
        System.out.println("task6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
    }

    public static void task7() {
        //task7
        System.out.println("task7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
    }

    public static void task8() {
        //task8
        System.out.println("task8");
        int accumulation = 29_000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + accumulation;
            System.out.println("Месяц " + i + ", сумма накоплений равна" + total + " рублей");
        }
    }

    public static void task9() {
        //task9
        System.out.println("task9");
        int accumulation = 29_000;
        double total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + (total / 100);
            total = total + accumulation;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task10() {
        //task10
        System.out.println("task10");
        int total = 0;
        for (int i = 1; i <= 10; i = i + 1) {
            total = i * 2;
            System.out.println("2 * " + i + " = " + total);
        }
    }
}
