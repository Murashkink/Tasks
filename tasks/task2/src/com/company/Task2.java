package com.company;

import java.util.Scanner;


public class Task2 {

    public static void main(String[] args) {

        System.out.println("Введите номер месяца = ");
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        System.out.println(solve(N));
    }

    public static String solve(int N) {
        String[] month = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        if (N > 0 && N <= month.length) return month[N-1];
        return "Месяц не найден";
    }
}
