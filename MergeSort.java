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
        arr = merge(arr);



        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index "+i+" = "+arr[i]);
        }
    }

    /**
     * Merge(A, p, q, r) -- O(n) linear time sort
     * Where A is an array.
     * p, q, r are indicies in the array such that p <= q < r
     * Assume subarrays A[p ... q] and A[q+1 ... r] are sorted
     */
    public static int[] merge(int[] a)
    {
        int length = a.length;
        if (length <= 1) return a;

        int pivot = length / 2;
        int[] left = new int[pivot+1];
        int[] right = new int[length - pivot + 1];

        for (int i = 0; i < (left.length - 1); i++) {
            left[i] = a[i];
        }
        for (int i = 0; i < (right.length - 1); i++) {
            right[i] = a[pivot + i];
        }
        left[left.length-1] = Integer.MAX_VALUE;
        right[right.length-1] = Integer.MAX_VALUE;

        int l = 0;
        int r = 0;

        for (int i = 0; i < length; i++) {
            if (left[l] <= right[r]) {
                a[i] = left[l];
                l++;
            } else {
                a[i] = right[r];
                r++;
            }
        }

        return a;
    }
}