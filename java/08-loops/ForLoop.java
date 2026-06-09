import java.util.Scanner;

/**
 * ============================================================
 *  TOPIC: for Loop
 * ============================================================
 *
 *  FLOWCHART:
 *
 *        ┌──────────────┐
 *        │    START     │
 *        └──────┬───────┘
 *               │
 *        ┌──────▼───────┐
 *        │ init (i = 0) │   ← runs ONCE at the beginning
 *        └──────┬───────┘
 *               │
 *        ┌──────▼───────┐
 *   ┌───►│  condition?  │
 *   │    └──┬────────┬──┘
 *   │     f │      t │
 *   │       │   ┌────▼────────┐
 *   │       │   │   Process   │
 *   │       │   └────┬────────┘
 *   │       │        │
 *   │       │   ┌────▼────────┐
 *   └───────────│  update     │   ← e.g. i++
 *           │   └─────────────┘
 *        ┌──▼──────┐
 *        │   END   │
 *        └─────────┘
 *
 *  SYNTAX:
 *    for (initialisation; condition; update) {
 *              1              2        3
 *        // statements 4
 *        // process repeats again and again until the condition is true
 *        // then stops
 *    }
 *
 *  USE WHEN:
 *  number of iterations is known in advance
 *  For this many times you know how  you're going to repeat
 *  e.g. making a tea you know how much sugar of teaspoons you want
 * ============================================================
 */
public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers to countdown: ");
        int start = scanner.nextInt();

        for(int i = start; i > 0; i-=1){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("Happy New Year");

        scanner.close();
    }
}
