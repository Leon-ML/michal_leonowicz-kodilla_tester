public class LeapYear {
    public static void main(String[] args) {
        int year = 2021;
        if (isLeapYear(year)) {
            System.out.println(year + " to rok przestępny. ");
        } else {
            System.out.println(year + " to rok nieprzestępny. ");
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0){
                    return true;
                } else
                    return false;
            } else
                return true;
        } else
            return false;
    }
}