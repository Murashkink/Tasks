package com.company;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        try {
            System.out.print("Введите строку: ");
            Scanner line = new Scanner(System.in);
            String str = line.nextLine();
            char[] chars = str.toCharArray();
            int sum = 0;
            for (int i = 0; i < chars.length; i++) {
                if ((byte) chars[i] >= 0x30 && (byte) chars[i] <= 0x39)
                    sum += (byte) chars[i] - 0x30;

            }
            if (sum == 0) {
                System.err.println("В строке нет чисел");
            }
            System.out.println("Сумма всех целых чисел(цифр) в строке равна " + sum);

        } finally {
            System.out.println("Программа завершена успешно. ");
        }
    }
}
