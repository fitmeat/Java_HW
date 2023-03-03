package dz1;

public class program02 {
    public static void main(String[] args) {
        System.out.println(checkLeapYear(1223));
    }


public static boolean checkLeapYear (int year){
    if (year % 400 == 0){
        return true;
    } else if (year % 100 == 0) {
        return false;
    } else {
        return year % 4 == 0;
    }

}
}
