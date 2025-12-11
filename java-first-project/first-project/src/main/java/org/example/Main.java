public class MaxOfFour {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15, d = 30;
        int max;

        if (a >= b && a >= c && a >= d) {
            max = a;
        } else if (b >= a && b >= c && b >= d) {
            max = b;
        } else if (c >= a && c >= b && c >= d) {
            max = c;
        } else {
            max = d;
        }

        System.out.println("Максимальное число: " + max);
    }
}