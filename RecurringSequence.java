import java.util.HashMap;
import java.util.Map;

public class RecurringSequence {
    public static void findRecurring(int numerator, int denominator) {
        // Store the result
        StringBuilder result = new StringBuilder();

        // Append integer part
        int quotient = numerator / denominator;
        int remainder = numerator % denominator;
        result.append(quotient);

        // If no remainder → no recurring sequence
        if (remainder == 0) {
            System.out.println("No recurring sequence");
            return;
        }

        result.append(".");

        // Map to store remainder and its position in result
        Map<Integer, Integer> remainderMap = new HashMap<>();

        while (remainder != 0) {
            // If remainder already seen → recurring starts
            if (remainderMap.containsKey(remainder)) {
                int start = remainderMap.get(remainder);
                result.insert(start, "(");
                result.append(")");
                System.out.println("Recurring sequence is " + result.substring(start + 1, result.length() - 1));
                return;
            }

            // Store remainder with current length of result
            remainderMap.put(remainder, result.length());

            remainder *= 10;
            quotient = remainder / denominator;
            result.append(quotient);

            remainder = remainder % denominator;
        }

        // If loop ends → no recurring sequence
        System.out.println("No recurring sequence");
    }
    public static void main(String[] args) {
        findRecurring(8, 3);   // Example 8/3
        findRecurring(50, 22); // Example 50/22
        findRecurring(7, 2);
    }
}
