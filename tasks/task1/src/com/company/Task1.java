package com.company;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, D;
        System.out.println("Введите переменные a, b и c квадратного уравнения ax+bx+c");
        try {
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
            D = b * b - 4 * a * c;
            if (D > 0) {
                double x1, x2;
                x1 = (-b - Math.sqrt(D)) / (2 * a);
                x2 = (-b + Math.sqrt(D)) / (2 * a);
                System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
            } else if (D == 0) {
                double x;
                x = -b / (2 * a);
                System.out.println("Уравнение имеет 1 корень: x = " + x);
            } else {
                System.out.println("Уравнение не имеет  корней!");
            }
        } catch (NumberFormatException ex) {
            System.out.println("Введите число!");
        }
    }
}
