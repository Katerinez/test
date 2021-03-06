package Lesson1;

public class HomeWorkApp {
    public static void main (String[] args){
        System.out.println("Home Work 1");
        System.out.println("   ");
        System.out.println("Task-1");
        printTreeWords();

        System.out.println("   ");
        System.out.println("Task-2");
        checkSumSign(5, 7);

        System.out.println("   ");
        System.out.println("Task-3");
        printColor(105);

        System.out.println("   ");
        System.out.println("Task-4");
        compareNumbers(2, 2);
    }

    public static void printTreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int a, int b){
        int sum= a+b;

        if (sum>=0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(int value){
        if (value<=0){
            System.out.println("Красный");
        } else if (value>0 && value<=100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(int a, int b){
        if (a>=b){
            System.out.println("a>=b");
        } else {
            System.out.println ("a<b");
        }
    }

}
