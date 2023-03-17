package dz4;

import java.util.*;

public class ConsoleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> strings = new ArrayList<>();
        boolean running = true;
        while (running) {
            String input = scanner.nextLine();
            switch (input) {
                case "print":
                    for (int i = strings.size() - 1; i >= 0; i--) {
                        System.out.println(strings.get(i));
                    }
                    break;
                case "revert":
                    if (!strings.isEmpty()) {
                        strings.remove(strings.size() - 1);
                    }
                    break;
                case "exit":
                    running = false;
                    break;
                default:
                    strings.add(input);
                    break;
            }
        }
        scanner.close();
    }
}
