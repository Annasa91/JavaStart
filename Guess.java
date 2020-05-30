package ru.geekbrains.javalessons;

import java.util.Scanner;

public class Guess {

    public static void main(String[] args) {
        int repeatAnswer = 1;
        for (int repeatGame = 1; repeatGame == repeatAnswer;) {
            Scanner scanner = new Scanner(System.in);
            int maxCount = 3;
            int trueAnswer = (int) (Math.random() * 10);
            for (int count = 0; count < maxCount; count++) {
                System.out.println("Введите число от 0 до 9: ");
                int userAnswer = scanner.nextInt();
                if (userAnswer == trueAnswer) {
                    System.out.println("Поздравляем! Вы угадали!");
                    break;
                } else {
                    if (userAnswer < trueAnswer) {
                        System.out.println("Вы ввели слишком маленькое число");
                    } else {
                        System.out.println("Вы ввели слишком большое число");
                    } System.out.println("Попыток осталось: " + (maxCount - count - 1));

                }

            }
            System.out.println("Игра окончена. Правильный ответ: " + trueAnswer);

            System.out.println("Сыграем еще раз? 1 – да / 0 – нет");
            repeatAnswer = scanner.nextInt();
        }

    }

}
