/**
 * ============================================================
 *  STUDENT CHALLENGE: Display Number in Words
 * ============================================================
 *  PROBLEM:
 *    Given an integer, print each digit as an English word.
 *
 *  EXAMPLES:
 *    1234  → "One Two Three Four"
 *    509   → "Five Zero Nine"
 *    70    → "Seven Zero"
 *
 *  ALGORITHM:
 *    1. Extract digits by repeatedly taking n % 10
 *    2. Store digits in a stack/array (last digit first)
 *    3. Print words in correct order
 *
 *  FLOWCHART:
 *
 *    ┌──────────┐
 *    │  Read n  │
 *    └────┬─────┘
 *         │  store digits in array
 *    ┌────▼──────────┐
 *    │   n != 0?     │◄──────────────────┐
 *    └──┬─────────┬──┘                   │
 *     f │       t │                      │
 *       │   ┌────▼──────────────────┐    │
 *       │   │ push (n % 10)         │────┘
 *       │   │ n /= 10               │
 *       │   └───────────────────────┘
 *    ┌──▼────────────────────────────┐
 *    │ pop digits and print as words │
 *    └───────────────────────────────┘
 * ============================================================
 */
import java.util.Stack;

public class DisplayNumberInWords {

    static final String[] WORDS = {
        "Zero","One","Two","Three","Four",
        "Five","Six","Seven","Eight","Nine"
    };

    public static void main(String[] args) {

        int[] testValues = {1234, 509, 70, 0, 9876543};

        for (int n : testValues) {
            System.out.println(n + " → " + toWords(n));
        }
    }

    static String toWords(int n) {
        if (n == 0) return WORDS[0];

        Stack<Integer> digits = new Stack<>();
        int temp = Math.abs(n);
        while (temp != 0) {
            digits.push(temp % 10);
            temp /= 10;
        }

        StringBuilder sb = new StringBuilder();
        if (n < 0) sb.append("Negative ");
        while (!digits.isEmpty()) {
            sb.append(WORDS[digits.pop()]);
            if (!digits.isEmpty()) sb.append(" ");
        }
        return sb.toString();
    }
}
