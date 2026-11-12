public class Assignment01Q03 {
    public static void main(String[] args) {
        int numOdd = 0;
        int x = Integer.parseInt(args[0]);
        int a = 1, b = 1;
        System.out.println("The first " + x + " Fibonacci numbers are:");
        for (int i = 0; i < x; i++){
            System.out.print(a + " ");
            if (a % 2 == 1) {
                numOdd++;
            }
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println();
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
