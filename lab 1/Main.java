public class Main {
    public static void main(String[] args) {
        int lim = 100;
        System.out.println("простые числа меньше " + lim + ":");
        for (int i = 2; i<lim; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }

        for (int i = 2; i < n; i ++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}