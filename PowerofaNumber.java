public class PowerofaNumber {
    public static void main(String[] args) {

        double base = 1.5;
        double expo1 = 2.5;
        double expo2 = -2.5;
        double res1, res2;

        // calculates the power
        res1 = Math.pow(base, expo1);
        res2 = Math.pow(base, expo2);
        System.out.println(base + " ^ " + expo1 + " = " + res1 );
        System.out.println(base + " ^ " + expo2 + " = " + res2 );
    }
}
