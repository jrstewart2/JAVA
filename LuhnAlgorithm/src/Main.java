public class Main {

    public static void main(String[] args) {



        Boolean validation = Luhn.validate("79927398713");

        if (validation) {
            System.out.println("Card number validated");
        } else {
            System.out.println("Card number invalid");
        }
    }
}