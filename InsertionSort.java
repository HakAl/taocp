public class InsertionSort
{
    public static void main(String[] args)
    {
        int[] test = {3, 123, 32, 45, 77, 3344, 499, 999, 23};
        System.out.println("Unsorted");
        for (int i = 0; i < test.length; i++) {
            System.out.print(" "+test[i]);
            if (i == test.length - 1) System.out.println();
        }
        test = sortAscending(test);
        System.out.println("SORTED");
        for (int i = 0; i < test.length; i++) {
            System.out.print(" "+test[i]);
            if (i == test.length - 1) System.out.println();
        }
    }

    public static int[] sortAscending(int[] toSort)
    {
        int j, key;
        for (int i = 1; i < toSort.length; i++) {
            key = toSort[i];
            j = i - 1;
            while (j >= 0 && toSort[j] > key) {
                toSort[j + 1] = toSort[j];
                j = j - 1;
            }
            toSort[j + 1] = key;
        }

        return toSort;
    }
}
