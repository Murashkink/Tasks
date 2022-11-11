package com.company;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        System.out.println("Введите окончание слова которое должно быть заменено: ");
        Scanner s = new Scanner(System.in);
        String suffix = s.nextLine(); // вводим строку на которую должно заканчиваться слово
        s.close();
        String text = """
                Two roads diverged in a yellow wood,
                And sorry I could not travel both
                And be one traveler, long I stood
                And looked down one as far as I could
                To where it bent in the undergrowth.""";
        String string = "SecretWord";
        String splited[] = text.split("\\s"); // разделяем все слова в тексте по пробелу
        StringBuffer newText = new StringBuffer();
        for (
                int i = 0;
                i < splited.length; i++) {
            if (!splited[i].endsWith(suffix)) // проверяем оканчивается ли слово заданной подстрокой
            {
                newText.append(splited[i] + " ");
            } else {
                newText.append(splited[i] + " " + string + " ");
            }
        }
        System.out.println(newText);
    }
}
