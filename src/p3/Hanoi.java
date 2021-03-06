package p3;

import util.StdIn;
import util.StdOut;

import java.util.InputMismatchException;

/**
 * Recursive solution to the Towers of Hanoi problem.
 *
 * @author Rajit Banerjee
 */

public class Hanoi {

    /**
     * Moves a given number of disks from source to destination.
     *
     * @param n    number of disks to move from source to destination
     * @param src  the source tower
     * @param dest the destination tower
     * @param aux  the auxiliary tower to help move the disk
     */
    public static void towersOfHanoi(int n, String src, String dest, String aux) {
        if (n == 1) {
            StdOut.println("Move disk from " + src + " to " + dest);
        } else {
            towersOfHanoi(n - 1, src, aux, dest);
            StdOut.println("Move disk from " + src + " to " + dest);
            towersOfHanoi(n - 1, aux, dest, src);
        }
    }

    // Ensures that user enters an integer
    private static int readInt() {
        int input = -1;
        while (input == -1) {
            try {
                input = StdIn.readInt();
            } catch (InputMismatchException e) {
                StdOut.println("Invalid choice, please try again!");
                StdOut.println("Enter the number of disks: ");
            }
        }
        return input;
    }

    // Main method to take user input and solve Towers fo Hanoi
    public static void main(String[] args) {
        StdOut.println("~ Towers of Hanoi ~");
        StdOut.println("Enter the number of disks: ");
        int n = readInt();
        towersOfHanoi(n, "SOURCE", "DESTINATION", "AUXILIARY");
        StdOut.println("Number of moves: " + (int) (Math.pow(2, n) - 1));
    }

}