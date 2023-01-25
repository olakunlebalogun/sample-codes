package src.brocode;

/**
 * The purpose of this is to be able to convert any number into String formatted time.
 * e.g. Let's say, 234 will be converted to 3m:54s
 * The format is hierarchy would look like this 21y:09M:03w:2d:13h:58m:01s which means
 * 21 years, 9 month, 3 weeks, 2 days, 13 hours, 58 minutes, 1 second.
 */
public class TimeConverterV2 {
    // Converting constants
    private static final int secondsToMinute = 60;
    private static final int minutesToHour = 60;
    private static final int hoursToDay = 24;
    private static final int daysToWeek = 7;
    private static final int weeksToMonth = 4;
    private static final int monthsToYear = 12;


    public static void main(String[] args) {
        System.out.println(converter(524));
        System.out.println(converter(19438));
        System.out.println(converter(566061));
        System.out.println(converter(1461859));
        System.out.println(converter(22797159));
        System.out.println(converter(223925109));
        System.out.println(converter(-3));

    }

    public static String converter(int value) {
        int seconds, minutes;
        int hours = 0;
        int days = 0;
        int weeks = 0;
        int months = 0;
        int years = 0;

        // First break
        if (value > 0) {
            minutes = value / secondsToMinute;
            seconds = value % secondsToMinute;

            // Second break
            if (minutes > minutesToHour) {
                hours = minutes / minutesToHour;
                minutes = minutes % minutesToHour;

                // Third break
                if (hours > hoursToDay) {
                    days = hours / hoursToDay;
                    hours = hours % hoursToDay;

                    //Fourth break
                    if (days > daysToWeek) {
                        weeks = days / daysToWeek;
                        days = days % daysToWeek;

                        // Fifth break
                        if (weeks > weeksToMonth) {
                            months = weeks / weeksToMonth;
                            weeks = weeks % weeksToMonth;

                            // Sixth break
                            if (months > monthsToYear) {
                                years = months / monthsToYear;
                                months = months % monthsToYear;
                            }
                        }
                    }
                }
            }


            return "Years: " + years + ", Months: " + months + ", Weeks: " + weeks + ", Days: " + days + ", Hours: " + hours + ", Minutes: " + minutes + ", Seconds: " + seconds;
        }
        return "Can't process a negative number";


    }

    public static int remainderConverter(int deNum, int value) {
        return 0;
    }

    public static int secondsToMinutesConverter(int secondsValue) {
        int minutes = secondsValue / secondsToMinute;
        int seconds = secondsValue % secondsToMinute;

        return 0;
    }

}
