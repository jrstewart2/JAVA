import java.util.ArrayList;

public class Luhn {

    private static ArrayList<Integer> generateIntegerList(String number) {
        ArrayList<Integer> generatedList = new ArrayList<>();

        for (int i = 0; i < number.length(); i++) {
            // INITIAL ATTEMPT
//            Integer singleNum = Integer.parseInt(String.valueOf(number.charAt(i)));
//            generatedList.add(singleNum);
            // REFACTORED WAY
            generatedList.add(number.charAt(i) - '0');

        }
        return generatedList;
    }

    private static int getResult(ArrayList nums){
        int sumOfNums = 0;

        for(int i = 0; i < nums.size(); i++){
            sumOfNums += (int) nums.get(i);
        }

        return sumOfNums % 10;
    }

    public static Boolean validate(String numbers) {

        ArrayList<Integer> numList = generateIntegerList(numbers);
        ArrayList<Integer> numList2 = new ArrayList<>();

        for(int i = 0; i < numList.size(); i++){
            if (i == 0) {
                numList2.add(numList.get(i));
            } else if (i%2 != 0){
                int num = numList.get(i) * 2;
                if (num > 10){
                    int num1 = (int) num/10;
                    int num2 = num%10;
                    int num3 = num1 + num2;
                    numList2.add(num3);
                } else {
                    numList2.add(num);
                }
            } else {
                numList2.add(numList.get(i));
            }
        }

        if (getResult(numList2) == 0){
            return true;
        }
        return false;
    }

}

