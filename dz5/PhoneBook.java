package dz5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String name, String phoneNumber) {
        if (phoneBook.containsKey(name)) {
            List<String> phoneNumbers = phoneBook.get(name);
            phoneNumbers.add(phoneNumber);
            phoneBook.put(name, phoneNumbers);
        } else {
            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            phoneBook.put(name, phoneNumbers);
        }
    }

    public List<String> get(String name) {
        return phoneBook.getOrDefault(name, new ArrayList<>());
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("John", "123-456-7890");
        phoneBook.add("John", "555-555-5555");
        phoneBook.add("Jane", "111-222-3333");

        System.out.println(phoneBook.get("John")); // [123-456-7890, 555-555-5555]
        System.out.println(phoneBook.get("Jane")); // [111-222-3333]
        System.out.println(phoneBook.get("Bob")); // []
    }
}

