import java.lang.System;

public class MergeSort
{
    public static void main(String[] args)
    {
        int[] arr = new int[9];
        arr[0] = 9;
        arr[1] = 8;
        arr[2] = 7;
        arr[3] = 6;
        arr[4] = 5;
        arr[5] = 4;
        arr[6] = 3;
        arr[7] = 2;
        arr[8] = 1;
        mergeSort(arr);
    }

    /**
     * Merge(A, p, q, r) -- O(n) linear time sort
     * Where A is an array.
     * p, q, r are indicies in the array such that p <= q < r
     * Assume subarrays A[p ... q] and A[q+1 ... r] are sorted
     */
    public static int[] mergeSort(int[] a)
    {
        int length = a.length;
        if (length <= 1) return a;

        int pivot = length / 2;
        int[] left = new int[pivot];
        int[] right = new int[length - pivot];

        System.out.println("Loading left array...");
        for (int i = 0; i < left.length; i++) {
            System.out.println("i = "+i+", value at index = "+a[i]);
            left[i] = a[i];
        }
        System.out.println("Loading right array...");
        for (int i = 0; i < right.length; i++) {
            System.out.println("i = "+i+", value at index = "+a[pivot + i]);
            right[i] = a[pivot + i];
        }

        return a;
    }
}