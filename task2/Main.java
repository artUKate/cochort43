package Homework_25.task2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add((int) (Math.random() * 100) + 1);
        }

        System.out.println("Список случайных чисел: " + numbers);

        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);

        Collections.sort(numbers);

        System.out.println("Список чисел, отсортированный в порядке возрастания: " + numbers);
    }
}