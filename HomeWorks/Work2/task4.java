package HomeWorks.Work2;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) throws Exception {
        // Разработайте программу, которая выбросит Exception,
        // когда пользователь вводит пустую строку.
        // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
        userInput();
    }

    public static void userInput() throws Exception {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ввод: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                throw new RuntimeException("Пустые строки вводить нельзя");
            }
        }
    }
}
