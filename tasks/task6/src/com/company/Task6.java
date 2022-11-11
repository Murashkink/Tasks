package com.company;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner line = new Scanner(System.in);
        String str = line.nextLine();
        char[] chars = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            if ((byte) chars[i] >= 0x30 && (byte) chars[i] <= 0x39)
                sum += (byte) chars[i] - 0x30;
        }
        System.out.println("Сумма всех целых чисел(цифр) в строке равна " + sum);
    }
}
