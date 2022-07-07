package ru.evgeny13;

import java.util.Scanner;

public class LineReversal {
    public static void main(String[] args) {
        System.out.println("Введите строку для переворота: ");

        // считываем вводимую строку и закидываем ее в массив
        Scanner sc = new Scanner(System.in);
        String lineBeforeRevert = sc.nextLine();
        String[] arrayForReverse = {lineBeforeRevert};

        // здесь просто выводим строку до и после, замер времени пойдет в цикле
        System.out.println("\nИсходная строка: " + lineBeforeRevert);
        System.out.println("Перевернутая строка: " + reverse(lineBeforeRevert) + "\n");

        // исходное время (для последующего сопоставления)
        long nsBefore = System.currentTimeMillis();

        // переворот строки до 100 000 повторений и замер времени на нужных нам значениях повторений
        for (int i = 1; i < 100001; i++) {
            String result = reverse(arrayForReverse[0]);

            if (i == 1000) {
                System.out.println("На 1 000-м повторении затрачено наносекунд: " + (System.currentTimeMillis() - nsBefore));
            }

            if (i == 10000) {
                System.out.println("На 10 000-м повторении затрачено наносекунд: " + (System.currentTimeMillis() - nsBefore));
            }

            if (i == 100000) {
                System.out.println("На 100 000-м повторении затрачено наносекунд: " + (System.currentTimeMillis() - nsBefore));
            }

            arrayForReverse[0] = result;
        }

        // тест, что мой подход действительно обеспечивает переворот строки туда и обратно (на примере 10 повторений)
//        for (int i = 1; i < 11; i++) {
//            String result = reverse(arrayForReverse[0]);
//            System.out.println(result);
//            System.out.println("Количество повторений: " + i);
//            arrayForReverse[0] = result;
//        }
    }

    // циклом пробегаемся по массиву с его конца, добавляя символы в итоговую (перевернутую) строку
    private static String reverse(String input) {
        char[] array = input.toCharArray();
        String result = "";

        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }

        return result;
    }
}