public class AlgorithmsTest
{

    public static void main(String[] args)
    {
        testEuclid();
    }


    static void testEuclid()
    {
        System.out.println("Euclids result: " + Algorithms.euclid(100, 24));
        System.out.println("Euclids result: " + Algorithms.euclid(100, 0));
    }

}
