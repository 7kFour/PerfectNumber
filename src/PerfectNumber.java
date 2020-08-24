public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {

        int perSum = 0;

        if (number > 1) {
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                    perSum += i;
                }
            }
            if (perSum != number) {
                return false;
            }
            System.out.println(perSum);
            return true;
        }
        return false;
    }
}
