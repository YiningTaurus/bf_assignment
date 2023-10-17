package week1day2;

/*
* Write a Java program to convert minutes into a number of years and days.
*
* Test Data
* Input the number of minutes: 3456789
* Expected Output :
* 3456789 minutes is approximately 6 years and 210 days
* */
public class P2MinToYearsAndDays {
    public static void main(String[] args) {
        int minutes1 = 3456789;
        System.out.println(minToYearsDays(minutes1));
    }

    public static String minToYearsDays(int minutes){
        int year = minutes / 525600;
        int day = (minutes - year * 525600) / 1440;
        return minutes + " minutes is approximately " + year + " years and " + day + " days.";
    }
}
