package ru.java.courses;

import java.util.Arrays;
import java.util.stream.Stream;

public class Lesson2 {

    final static int COEFFICIENT = 13;
    final static String FIO_MASK = "%s.%s.%s";

    public static void main(String[] args) {
        System.out.println("Задача 1: " + formula(50));
        System.out.println("Задача 2: " + initials("иванов Петр александрович"));
    }

    /**
     * Нужно реализовать формулу y = √(13x + 13/x)
     * Подсказка: квадратный корень вычисляется функцией Math.sqrt()
     *
     * @param x на текущем этапе входное значение будет больше нуля
     * @return возвращаем только целую часть от полученного результата,
     * хвост отбрасываем без откругления
     */
    static int formula(int x) {
        return (int) Math.sqrt(COEFFICIENT * x + COEFFICIENT / x);
    }

    /**
     * Нужно привести строку с полным именем к инициалам.
     * Например, "Иванов Петр Александрович" → "И.П.А."
     * Подсказка:
     * разделение строки на части: .split(" ");
     * получение символа на определенной позиции: .charAt();
     * приведение к верхнему регистру: .toUpperCase();
     *
     * @param fullName на текущем этапе имена будут состоять из имени, фамили и отчества, разделяться пробелами.
     *                 Регистр букв во входном параметре может быть любым.
     * @return возвращаем инициалы в верхнем регистре разделенные точкой, как в примере выше
     */
    static String initials(String fullName) {

        String[] initArray = fullName.split(" ");

        final char surname = initArray[0].toUpperCase().charAt(0);
        final char name = initArray[1].toUpperCase().charAt(0);
        final char patronymic = initArray[2].toUpperCase().charAt(0);

        return String.format(FIO_MASK, surname, name, patronymic);
    }
}
