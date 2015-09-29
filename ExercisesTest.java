public class ExercisesTest
{
    public static void main(String[] args)
    {
        char[] x = {'a', 'b', 'c', 'd'};
        char[] y = {'b', 'c', 'd', 'a'};
        char[] a = {'a', 'd', 'b', 'c'};
        char[] b = {'c', 'd', 'b', 'a'};
        char[] result = Exercises.arrayReplace(a, b);
        try {
            Thread.sleep(5000);
            System.out.print("CRASH");
            System.exit(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        char[] result = Exercises.arraySwap(x, y);
        System.out.println("Result array: " + result[0]+", "+result[1]+", "+result[2]+", "+result[3]);
    }
}
