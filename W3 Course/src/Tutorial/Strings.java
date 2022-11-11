public class Strings {

    String name = "Jonathan Stewart";
    System.out.println("My name is this long:" + name.length());
    System.out.println(name.toUpperCase());
    System.out.println(name.toLowerCase());

    // find a character in a string:
    System.out.println(name.indexOf("S"));

    String firstName = "Jonathan";
    String lastName = "Stewart";
    System.out.println(firstName + lastName);
    // can also CONCAT
    String fullName = firstName.concat(lastName);

    // Using + on a String and a number will result in String concatenation
    String x = "10";
    int y = 20;
    Strng z = x + y;  //will be "1020"

    // SPECIAL CHARACTERS
    String problem = "This will be a "big" problem";    // will not run
    String noProblem = "This will not be a \"big\" problem"; // \ will turn special character into a string

    /*
    ESCAPE SEQUENCES
    \n	New Line
    \r	Carriage Return
    \t	Tab
    \b	Backspace
    \f	Form Feed
     */
}
