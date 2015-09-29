import java.util.HashMap;

/**
 * Excerpts From: Donald E. Knuth. “The Art of Computer Programming: Volume 1 / Fundamental
 * Algorithms, Third Edition.”
 */
public class Exercises
{
    /**
     * 1. [10] The text showed how to interchange the values of variables m and n, using the
     * replacement notation, by setting t ← m, m ← n, n ← t. Show how the values of four variables
     * (a, b, c, d) can be rearranged to (b, c, d, a) by a sequence of replacements. In other words,
     * the new value of a is to be the original value of b, etc.
     * <p/>
     * Try to use the minimum number of replacements.
     */

    // get (a,b,c,d) to (b,c,d,a)
    public static char[] arraySwap(@CharArrayLengthFour char[] original,
                                   @CharArrayLengthFour char[] desired)
    {
        for (int i = 0; i < 4; i++) {
            if (desired[i] != original[i]) {
                original[i] = desired[i];
            }
        }

        return original;
    }

//    // get (a,d,c,b) to (c,d,b,a) using a series of replacements
    /**
     *   _________
     *   |c|d|b|a|
     * a |_|_|_|*|
     * d |_|*|_|_|
     * c |*|_|_|_|
     * b |_|_|*|_|
     *   _________
     *   |c|d|b|a|
     * a |_|_|_|_|
     * d |_|_|_|_|
     * c |_|_|_|_|
     * b |_|_|_|_|
     *
     *  a <-> b == t <- a, a <- b, b <- t
     *
     *  char[] arrOne = {'a', 'd', 'c', 'b'}
     *  char[] arrTwo = {'c', 'd', 'b', 'a'}
     *
     *  int length = arrOne.length;
     *
     *  if ((i == 0) && (indexOf(arrTwo, arrOne[i]) == length-1)) {
     *      swap(0, length - 1, original);
     *  } else if (i == (length - 1) && (indexOf(arrTwo, arrOne[i]) == 0)) {
     *      swap(0, length - 1, original);
     *  } else if ((indexOf(arrTwo, arrOne[i] == (i + 1)) {
     *      swap(i, i + 1, arrOne);
     *  } else if ((indexOf(arrTwo, arrOne[i] == (i - 1)) {
     *      swap(i, i - 1, arrOne);
     *  }
     *
     */

    static int indexOf(char[] arr, char a)
    {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) return i;
        }
        return -1;
    }

    static char[] swap(int a, int b, char[] arr)
    {
        char t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
        return arr;
    }




    public static char[] arrayReplace(@CharArrayLengthFour char[] original,
                                      @CharArrayLengthFour char[] desired)
    {
        int length = original.length;



        return original;
    }

    static int equals(char a, char b)
    {
        if (a < b) {
            return -1;
        } else if ( a > b) {
            return 1;
        }
        return 0;
    }

    static boolean isIndexEmpty(int index, char[] arr)
    {
        return arr[index] == 0;
    }

    static boolean notEqual(char[] a, char[] b)
    {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return true;
            }
        }
        return false;
    }

    static char[] positiveSwap(int index, char[] arr)
    {
        char temp = arr[index];
        arr[index] = arr[index+1];
        arr[index+1] = temp;
        return arr;
    }

    static char[] negativeSwap(int index, char[] arr)
    {
        char temp = arr[index];
        arr[index] = arr[index-1];
        arr[index-1] = temp;
        return arr;
    }

    static char[] endSwap(int length, char[] arr)
    {
        char temp = arr[length-1];
        arr[length-1] = arr[0];
        arr[0] = temp;
        return arr;
    }

}
