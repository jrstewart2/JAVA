package Objects;

/*
LocalDate	        Represents a date (year, month, day (yyyy-MM-dd))
LocalTime	        Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
LocalDateTime	    Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
DateTimeFormatter	Formatter for displaying and parsing date-time objects
 */


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; // to format date and time

public class DateTime {
    public static void main(String[] args) {

        // DISPLAY CURRENT DATE
        LocalDate myDateObj = LocalDate.now(); // Create a date object
        System.out.println(myDateObj); // Display the current date

        LocalTime myTimeObj = LocalTime.now();
        System.out.println(myTimeObj);

        LocalDateTime myDateTimeObj = LocalDateTime.now();
        System.out.println(myDateTimeObj);  // outputs 2022-11-11T16:05:18.753494 <- T separates Date and Time

        // to remove the T and nanoseconds:
        LocalDateTime myDateObj2 = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj2);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj2.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
}

/* ofPattern() accepts different values: eg
yyyy-MM-dd	    "1988-09-29"
dd/MM/yyyy	    "29/09/1988"
dd-MMM-yyyy	    "29-Sep-1988"
E, MMM dd yyyy	"Thu, Sep 29 1988"
 */