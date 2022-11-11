public class Arrays {

    String[] cars;
    String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
    int[] myNum = {10, 20, 30, 40};

    // access elements
    System.out.println(cars2[0]);

    // change an element in array
    cars[0] = "Opel";

    // array length
    System.out.println(cars2.length);

    // LOOP THROUGH ARRAY
    for (int i = 0; i < cars2.length; i++) {
        System.out.println(cars[i]);
    }

    // USING FOR EACH
    for (String i : cars2) {
        System.out.println(i);
    }

    // MULTIDIMENSIONAL ARRAYS
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    int x = myNumbers[1][2];
    System.out.println(x); // Outputs 7

    // FOR LOOP THROUGH MULTI-D ARRAy
      for (int i = 0; i < myNumbers.length; ++i) {
        for(int j = 0; j < myNumbers[i].length; ++j) {
            System.out.println(myNumbers[i][j]);
        }
    }
}
