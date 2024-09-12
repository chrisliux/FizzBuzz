
public class Multiples {
    public static void main(String[] args) {
        int c=2;
        int b=2;
        int a=2;
        doMultiples(a,b,c);
    }
    public static void doMultiples(int a, int b, int c) {
        int count = 0;
        for (int i = 1; i < a; i++) {
            if (i % b == 0 || i % c == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}