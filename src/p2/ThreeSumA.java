package p2;

import util.In;

/**
 * Compilation: javac p2/ThreeSumA.java
 * Execution: java p2/ThreeSumA inputFile
 * <p>
 * Example:
 * % java p2/ThreeSumA p2/8ints.txt
 * % java p2/ThreeSumA p2/1Kints.txt
 *
 * @author Robert Sedgewick
 * @author Kevin Wayne
 */

public class ThreeSumA {

    // Do not instantiate.
    private ThreeSumA() {
    }

    /**
     * Returns the number of triples (i, j, k) with {@code i < j < k} such that
     * {@code a[i] + a[j] + a[k] == 0}.
     *
     * @param a the array of integers
     * @return the number of triples (i, j, k) with {@code i < j < k} such that
     * {@code a[i] + a[j] + a[k] == 0}
     */
    public static int count(int[] a) {
        int n = a.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    /**
     * Reads in a sequence of integers from a file, specified as a command-line
     * argument; counts the number of triples sum to exactly zero; prints out the
     * time to perform the computation.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] a = in.readAllInts();
        final long t1 = System.currentTimeMillis();
        int count = count(a);
        final long t2 = System.currentTimeMillis();
        long elapsed = (t2 - t1) / 1000;

        System.out.println("count = " + count);
        System.out.println("Time taken = " + elapsed + " secs");
    }

}