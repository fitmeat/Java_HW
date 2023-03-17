package dz5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", 
                          "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", 
                          "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова", 
                          "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"};

        Map<String, Integer> map = new HashMap<String, Integer>();

        // Заполняем карту с именами и их количеством
        for (String name : names) {
            if (map.containsKey(name)) {
                int count = map.get(name);
                map.put(name, count + 1);
            } else {
                map.put(name, 1);
            }
        }

        // Сортируем карту по убыванию количества повторений и выводим результаты
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for (Map.Entry<String, Integer> entry : list) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}

