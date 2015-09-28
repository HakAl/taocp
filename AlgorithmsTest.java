import java.lang.System;

public class AlgorithmsTest
{
    static final int ITERATIONS = 1000000;

    public static void main(String[] args)
    {
        System.out.println("Results for Euclid() == " + Algorithms.euclid(544, 119));
        System.out.println("Results for Euclid() == " + Algorithms.algorithmE(544, 119));
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
            Algorithms.euclid(544, 119);
            i++;
        } while (i < ITERATIONS);
        return System.nanoTime() - start;
    }

    static long benchmarkA()
    {
        long start = System.nanoTime();
        int i = 0;
        do {
            Algorithms.euclidOne(544, 119);
            i++;
        } while (i < ITERATIONS);
        return System.nanoTime() - start;
    }

    static long benchmarkB()
    {
        long start = System.nanoTime();
        int i = 0;
        do {
            Algorithms.euclidTwo(544, 119);
            i++;
        } while (i < ITERATIONS);
        return System.nanoTime() - start;
    }

    static void testEuclid(int m, int n)
    {
        System.out.println(String.format(
                "Euclid result for m = %1$s, n = %2$s is: %3$s.", m, n, Algorithms.euclid(m, n)));
    }

    static void testEuclidOne(int m, int n)
    {
        System.out.println(String.format(
                "EuclidOne result for m = %1$s, n = %2$s is: %3$s.", m, n, Algorithms.euclidOne(m, n)));
    }

    static void testEuclidTwo(int m, int n)
    {
        System.out.println(String.format(
                "EuclidTwo result for m = %1$s, n = %2$s is: %3$s.", m, n, Algorithms.euclidTwo(m, n)));
    }
}