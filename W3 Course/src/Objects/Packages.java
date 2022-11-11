package Objects;
// to import all classes within a package:
//import package.name.*;

// to import only a single class within a package
//import package.name.Class;

import java.util.Scanner;

public class Packages {

    Scanner scanObj = new Scanner(System.in);
    System.out.println("Enter username");

    String userName = scanObj.nextLine();
    System.out.println("Username is " + userName);

}
