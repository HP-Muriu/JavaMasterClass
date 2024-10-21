public class DaysOfTheWeek{

    public static void main(String[] args) {

        printWeekday(0);
        printWeekday(1);
        printWeekday(2);
        printWeekday(3);
        printWeekday(4);
        printWeekday(5);
        printWeekday(6);
        printWeekday(7);
    }
    public static void printDaysOfWeek(int day) {

        String dayOfWeek = switch (day) {
            case 0 -> { yield "Sunday"; }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
            System.out.println(day + " stands for " + dayOfWeek);
    }

    public static void printWeekday(int day) {

        String dayOfWeek = "Invalid day";
        if (day == 0) {
            dayOfWeek = "Sunday";
        } else if (day == 1) {
            dayOfWeek = "Monday";
        } else if (day == 2) {
            dayOfWeek = "Tuesday";
        } else if (day == 3) {
            dayOfWeek = "Wednesday";
        } else if (day == 4) {
            dayOfWeek = "Thursday";
        } else if (day == 5) {
            dayOfWeek = "Friday";
        } else if (day == 6) {
            dayOfWeek = "Saturday";
        }
        System.out.println(day + " stands for " + dayOfWeek);
    }
}
