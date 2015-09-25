public class AlgorithmsTest
{

    public static void main(String[] args)
    {
        exerciseEuclid();
    }

    static void exerciseEuclid()
    {
        testEuclid(55, 12222);
        testEuclid(39485784, 324340);
        testEuclid(551, 119);
        testEuclid(200, 400);
        testEuclid(544, 119);
        testEuclid(119, 544);
    }

    static void testEuclid(int m, int n)
    {
        System.out.println(String.format(
                "Euclids result for m = %1$s, n = %2$s is: %3$s.", m, n, Algorithms.euclid(m, n)));
    }
}