public class Reduce {
    public static int doReduce(int n) {
        int steps = 0;
        while(n > 0){
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n - 1;
            }
            steps++;
        }
        return steps;
    }

    public static void main(String[] args) {
        int n1 = 0;
        System.out.println(doReduce(n1));

    }
}
