import java.util.Scanner;

public class APSeriesLoop {
    public static int findNthTerm(int a1, int a2, int n) {
        int d = a2 - a1;
        int term = a1;

        for (int i = 1; i < n; i++) {
            term += d;
        }

        return term;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term (a1): ");
        int a1 = sc.nextInt();

        System.out.print("Enter second term (a2): ");
        int a2 = sc.nextInt();

        System.out.print("Enter term number (n): ");
        int n = sc.nextInt();

        int result = findNthTerm(a1, a2, n);
        System.out.println("The " + n + "th term is: " + result);

        sc.close();
    }
}
