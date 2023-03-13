import java.util.ArrayList;

public class task003 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("world");
        list.add("123");
        list.add("456");
        list.add("789");

        for (int i = 0; i < list.size(); i++) {
            if (isInteger(list.get(i))) {
                list.remove(i);
                i--;
            }
        }

        System.out.println(list); // Output: [Hello, world]
    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
