public class Variables {
    String name = "Jon";
    char initial = 'J';
    int age = 37;

    // final means unchangeable:
    final String lastName = "Stewart";
    boolean example = true;

    // declare multiple variables:
    int x = 10, y = 4, z = 2;

    float myFloatNum = 5.99f;
    double doubleNum = 6.23235d;
    long bigNum = 9223372036854775807L;
    // e to indicate to the power of 10
    float scientificNum = 35e3f;

    /*
    PRIMITIVE DATA TYPES
    byte    - 1 byte:   -128            to  127
    short   - 2 bytes:  -32768          to  32767
    int     - 4 bytes:  -2,147,483,648  to  2,147,483,647
    float   - 4 bytes:  6-7 decimal places
    double  - 8 bytes:  15 decimal digits
    boolean - 1 bit:    true/false
    char    - 2 bytes:  single character or ASCII value
     */
    // WIDENING CASTING occurs automatically:
    int myInt = 9;
    double myDouble = myInt;
    // NARROWING CASTING must be done manually:
    double double2 = 9.78d;
    int int2 = (int) double2;
}
