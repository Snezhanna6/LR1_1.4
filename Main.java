package Main;

import java.util.Scanner;

public class Main {

    /**
     * Сумма введенных чисел
     */
    static int summ = 0;
    /**
     * Произведение введенных чисел
     */
    static long multipl = 1;

    public static void main(String[] args) {

        inputAndCalc();
        System.out.printf("Сумма чисел: %d\nПроизведение чисел: %d",summ,multipl);
    }

    /**
     * Функция в которой осуществлен ввод и подсчет нужных значений
     */
    public static void inputAndCalc(){

        //Объект для ввода данных с консоли
        Scanner in = new Scanner(System.in);
        int sl;

        System.out.println("Ввод чисел осуществляется до того, как будет введено не целое число. " +
                "Числа можно вводить через 'space' или через 'enter'");
        System.out.print("Введите целое число: ");

        boolean flag = false;

        while (in.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
            sl = in.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
            summ += sl;
            multipl *= sl;
            flag = true;
        }

        if (!flag) multipl = 0;
    }
}
