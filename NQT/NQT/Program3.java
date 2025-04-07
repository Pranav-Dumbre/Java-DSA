package NQT;

/*
Jack is always excited about sunday. It is favourite day, when he gets to play all day. And goes to cycling with his friends. 
So every time when the months starts he counts the number of sundays he will get to enjoy. Considering the month can start with any day, be it Sunday, Monday…. Or so on.
Count the number of Sunday jack will get within n number of days.
 Example 1:

Input 
mon -> input String denoting the start of the month.
13  -> input integer denoting the number of days from the start of the month.

Output :
2    -> number of days within 13 days.
*/
public class Program3 {
    public static void main(String[] args) {

        System.out.println(countSundays("Monday", 13));
    }

    public static int countSundays(String startDay, int dayCount) {
        int sundayCount = 0;

        switch (startDay) {
            case "Monday":
                sundayCount = dayCount / 7;
                dayCount = dayCount % 7;
                if (dayCount == 6) {
                    sundayCount += 1;
                }
                break;
            case "Tuesday":
                sundayCount = dayCount / 7;
                dayCount = dayCount % 7;
                if (dayCount == 5) {
                    sundayCount += 1;
                }
                break;
            case "Wednesday":
                sundayCount = dayCount / 7;
                dayCount = dayCount % 7;
                if (dayCount == 4) {
                    sundayCount += 1;
                }
                break;
            case "Thursday":
                sundayCount = dayCount / 7;
                dayCount = dayCount % 7;
                if (dayCount == 3) {
                    sundayCount += 1;
                }
                break;
            case "Friday":
                sundayCount = dayCount / 7;
                dayCount = dayCount % 7;
                if (dayCount == 2) {
                    sundayCount += 1;
                }
                break;
            case "Saturday":
                sundayCount = dayCount / 7;
                dayCount = dayCount % 7;
                if (dayCount == 1) {
                    sundayCount += 1;
                }
                break;
            case "Sunday":
                sundayCount = dayCount / 7;
                break;
        }
        return sundayCount;
    }

}
