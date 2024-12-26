public class Main {
    public static void main(String[] args) {
        int a = 5, b = 3, c = 9, d = 7;
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }

        System.out.println("Максимум: " + max);
    }
}