public class Loops {

    // WHILE
    int i = 0;
    while (i < 5) {
        System.out.println(i);
        i++;
    }

    // DO WHILE
    do {
        System.out.println(i);
        i++;
    } while (i < 5);

    // FOR
    for (int i = 0; i < 5; i++) {
        System.out.println(i);
    }

    // FOR EACH
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (String i : cars) {
        System.out.println(i);
    }

    // BREAK
    for (int i = 0; i < 10; i++) {
        if (i == 4) {
            break;
        }
        System.out.println(i);
    }

    int i = 0;
    while (i < 10) {
        System.out.println(i);
        i++;
        if (i == 4) {
            break;
        }
    }

    // CONTINUE
    for (int i = 0; i < 10; i++) {
        if (i == 4) {
            continue;
        }
        System.out.println(i);
    }

    int i = 0;
    while (i < 10) {
        if (i == 4) {
            i++;
            continue;
        }
        System.out.println(i);
        i++;
    }

}
