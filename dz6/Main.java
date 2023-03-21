package dz6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем список ноутбуков
        ArrayList<Notebook> notebooks = new ArrayList<>();

        // Добавляем несколько ноутбуков в список
        notebooks.add(new Notebook("Lenovo", "IdeaPad 5", 8, 512, "Серый", 599.99));
        notebooks.add(new Notebook("HP", "Pavilion 14", 16, 256, "Черный", 699.99));
        notebooks.add(new Notebook("Acer", "Aspire 5", 4, 256, "Синий", 399.99));
        notebooks.add(new Notebook("Dell", "Inspiron 14", 8, 1_024, "Красный", 799.99));

        try (// Запрашиваем у пользователя минимальный размер оперативной памяти
        Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите минимальный размер оперативной памяти (в Гб): ");
            int minRamSize = scanner.nextInt();

            // Фильтруем список ноутбуков по заданным условиям
            ArrayList<Notebook> filteredNotebooks = new ArrayList<>();
            for (Notebook notebook : notebooks) {
                if (notebook.getRamSize() >= minRamSize) {
                    filteredNotebooks.add(notebook);
                }
            }

            // Выводим отфильтрованный список ноутбуков
            System.out.println("Отфильтрованные ноутбуки:");
            for (Notebook notebook : filteredNotebooks) {
                System.out.println(notebook.getBrand() + " " + notebook.getModel() + ", " + notebook.getColor() + ", " + notebook.getPrice() + " $");
            }
        }
    }
}
