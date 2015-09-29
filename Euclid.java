/**
 * Excerpts From: Donald E. Knuth.
 * “The Art of Computer Programming: Volume 1 / Fundamental Algorithms, Third Edition.”
 */
public class Euclid
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
    static final int ITERATIONS = 1000000;

    public static void main(String[] args)
    {
        System.out.println("Results for Euclid() == " + euclid(544, 119));
        System.out.println("Results for Euclid() == " + algorithmE(544, 119));
    }

    /**
     * @param iterations
     * @return average time
     */
    private static long runBenchmark(int iterations)
    {
        long[] times = new long[iterations];
        for (int i = 0; i < iterations; i++) {
            times[i] = benchmark();
        }
        long sum = 0;
        for (long time :
                times) {
            sum += time;
        }
        return sum / iterations;
    }

    private static long runBenchmarkA(int iterations)
    {
        long[] times = new long[iterations];
        for (int i = 0; i < iterations; i++) {
            times[i] = benchmarkA();
        }
        long sum = 0;
        for (long time :
                times) {
            sum += time;
        }
        return sum / iterations;
    }

    private static long runBenchmarkB(int iterations)
    {
        long[] times = new long[iterations];
        for (int i = 0; i < iterations; i++) {
            times[i] = benchmarkB();
        }
        long sum = 0;
        for (long time :
                times) {
            sum += time;
        }
        return sum / iterations;
    }


    static long benchmark()
    {
        long start = System.nanoTime();
        int i = 0;
        do {
            euclid(544, 119);
            i++;
        } while (i < ITERATIONS);
        return System.nanoTime() - start;
    }

    static long benchmarkA()
    {
        long start = System.nanoTime();
        int i = 0;
        do {
            euclidOne(544, 119);
            i++;
        } while (i < ITERATIONS);
        return System.nanoTime() - start;
    }

    static long benchmarkB()
    {
        long start = System.nanoTime();
        int i = 0;
        do {
            euclidTwo(544, 119);
            i++;
        } while (i < ITERATIONS);
        return System.nanoTime() - start;
    }

    static void testEuclid(int m, int n)
    {
        System.out.println(String.format(
                "Euclid result for m = %1$s, n = %2$s is: %3$s.", m, n, euclid(m, n)));
    }

    static void testEuclidOne(int m, int n)
    {
        System.out.println(String.format(
                "EuclidOne result for m = %1$s, n = %2$s is: %3$s.", m, n, euclidOne(m, n)));
    }

    static void testEuclidTwo(int m, int n)
    {
        System.out.println(String.format(
                "EuclidTwo result for m = %1$s, n = %2$s is: %3$s.", m, n, euclidTwo(m, n)));
    }
}