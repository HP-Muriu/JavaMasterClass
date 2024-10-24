public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(-3945)); // This is the first test
        System.out.println(getDurationString(-65, 45)); // This is the second test
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int seconds) {

        return getDurationString(seconds / 60,seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0) {
            return "invalid data for minutes(" + minutes
                    + "), must be a positive integer value";
        }

        if (seconds <= 0 || seconds >= 59) {
            return "invalid data for seconds(" + seconds
                    + "), must be between 0 and 59";
        }
        int hours = minutes /   60;

        int remainingMinutes = minutes % 60;


        return hours + "h " + minutes + "m " + seconds + "s";
    }
}