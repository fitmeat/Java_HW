package dz1;

public class program01 {
    public static void main(String[] args) {
        double[] array = { 0.22, 0.4, 0.92, 1.5, 1.99, 4.5 };
        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[indexOfMax]) {
                indexOfMax = i;
            } else if (array[i] < array[indexOfMin]) {
                indexOfMin = i;
            }
        }
        System.out.println(indexOfMax + " " + indexOfMin);
    }
}
