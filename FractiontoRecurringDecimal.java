import java.util.HashMap;

public class FractiontoRecurringDecimal {

    static String calculateFraction(int a, int b) {

        // If the numerator is zero, answer is "0"
        if (a == 0)
            return "0";

        // If exactly one of the numerator or denominator
        // is negative, then result will be negative
        String res = (a < 0) ^ (b < 0) ? "-" : "";

        a = Math.abs(a);
        b = Math.abs(b);

        // Calculate and Append the part before decimal point
        res += Integer.toString(a / b);

        int rem = a % b;

        // If completely divisible, return res
        if (rem == 0)
            return res;

        res += ".";
        HashMap<Integer, Integer> mp = new HashMap<>();

        while (rem > 0) {

            // If this remainder is already seen,
            // then there exists a repeating fraction.
            if (mp.containsKey(rem)) {
                res = res.substring(0, mp.get(rem)) + "(" + res.substring(mp.get(rem)) + ")";
                break;
            }

            // If the remainder is seen for the first time,
            // store its index
            mp.put(rem, res.length());

            rem = rem * 10;

            // Calculate quotient, append it to result and
            // calculate next remainder
            res += Integer.toString(rem / b);
            rem = rem % b;
        }

        return res;
    }

    public static void main(String[] args) {
        int a = 50, b = 22;
        System.out.println(calculateFraction(a, b));
    }
}

