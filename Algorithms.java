/**
 * Excerpts From: Donald E. Knuth.
 * “The Art of Computer Programming: Volume 1 / Fundamental Algorithms, Third Edition.”
 */
public class Algorithms
{
    /**
     * Euclid's Algorithm (Algorithm E)
     * Given two positive integers m and n, find their greatest  common divisor,
     * that is, the largest positive integer that evenly divides both m and n.
     *
     * E1. [Find remainder.] Divide m by n and let r be the remainder. (We will have 0 ≤ r < n.)
     * E2. [Is it zero?] If r = 0, the algorithm terminates; n is the answer.
     * E3. [Reduce.] Set m ← n, n ← r, and go back to step E1. ”
     *
     *
     *
     * Results for 1 million loops of each algorithm.
     * Resulting time (nanoseconds) is the average time over 10,000 runs of a million:
     *
     * results for 10,000 iterations on euclid(): 7,552,521 nanos
     * results for 10,000 iterations on euclidOne(): 5,216,881 nanos
     * results for 10,000 iterations on euclidTwo(): 5,282,300 nanos
     */
    public static int euclid(@PositiveInteger int m, @PositiveInteger int n)
    {
        return (m % n) == 0 ? n : euclid(n, (m % n));
    }

    public static int euclidOne(@PositiveInteger int m, @PositiveInteger int n)
    {
        int r = m % n;
        return r == 0 ? n : euclid(n, r);
    }

    public static int euclidTwo(@PositiveInteger int m, @PositiveInteger int n)
    {
        int r = m % n;
        if (r != 0) {
            return euclid(n, r);
        }
        return n;
    }

    /**
     * Avoid all trivial replacements m <- n
     */
    public static int algorithmE(@PositiveInteger int m, @PositiveInteger int n)
    {
        int r;
        if (m > n) {
            r = n % m;
            return euclid(n, r);
        } else {
            r = m % n;
            if (r == 0) {
                return n;
            } else {
                return euclid(n, r);
            }
        }
    }
}