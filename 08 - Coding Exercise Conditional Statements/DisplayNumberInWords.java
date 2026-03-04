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

    public static void main(String[] args) {
    }
}
