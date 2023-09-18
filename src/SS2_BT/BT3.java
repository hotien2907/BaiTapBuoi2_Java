package SS2_BT;

public class BT3 {
    public static void main(String[] args) {
        int count = 0;

        while (count < 100) {
            if (CheckNumber(count)) {
                System.out.println(count);

            }
            count++;
        }
    }

    public static boolean CheckNumber(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
