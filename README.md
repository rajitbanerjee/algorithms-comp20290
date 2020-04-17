# COMP20280 Algorithms 
#### Spring Trimester, 2020
Java programs from weekly practical sessions and assignments for the module COMP20290.  
The portfolio contains separate packages for every practical session, each with:
* a PDF file with answers to short questions,
* .java source files for the code,
* any other required files (e.g. text files).
Developed using IntelliJ IDEA and Microsoft Office.

## Getting Started
Clone the repository into your IDE and build the project.  
Run [Main.java](./src/Main.java) to view the features of the repository, as summarised below.

| # | Title | File | Description |  
|---| ----- | -------- | ---------- |
| 1 | [Algorithm Analysis](./src/p1) | [RussianPeasant](./src/p1/RussianPeasant.java) | Multiplies two numbers using the Russian Peasant's algorithm 
| 2 | [Complexity Analysis](./src/p2) |  | This practical uses the command line. <br> Refer to graphs and documentation PDF [here](./src/p2/Practical%202%20-%20Complexity%20Analysis.pdf).
| | | [ThreeSumA](./src/p2/ThreeSumA.java) | Uses brute force to count the number of triples in a file, summing to 0. <br> Complexity = O(n<sup>3</sup>)
| | | [ThreeSumB](./src/p2/ThreeSumB.java) | Uses the binary search algorithm to efficiently count the number of triples in a file, summing to 0. <br> Complexity = O(n<sup>2</sup> log n)
| 3 | [Recursion](./src/p3) | [Fibonacci](./src/p3/Fibonacci.java) | Computes the Nth Fibonacci number, taking N as user input.
| | | [Hanoi](./src/p3/Hanoi.java) | Solves the [Towers of Hanoi](https://en.wikipedia.org/wiki/Tower_of_Hanoi) problem, for a user specified number of disks.
| 4 | [Elementary Sorting](./src/p4) | [Sort](./src/p4/Sort.java) | Contains implementations of multiple sorting algorithms: selection, bogo, insertion, merge, enhanced merge, quick, and enhanced quick. <br> It implements the [Callable](https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/Callable.html) interface, so the call() method invokes any of the required sort methods on any specified array.
| | | [Timing](./src/p4/Timing.java) | Utility used in sort [TestRunner](./src/p4/TestRunner.java) to compute the nano time performance of a [Callable](https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/Callable.html) class object. 
| | | [TestRunner](./src/p4/TestRunner.java) | Test framework to compare performance of various types of sorts defined in the [Sort](./src/p4/Sort.java) class. Depending on the user's choice, <br> 1. It can run a timing analysis for sorting randomly generated arrays of different sizes, <br> 2. It can visualise the sorts for small sized arrays.
| | | [ElementarySortTest](./src/p4/ElementarySortTest.java) | Compares the performance of selection sort, insertion sort, and bogo sort. <br> Refer to graphs and documentation PDF [here](./src/p4/Practical%204%20-%20Elementary%20Sorting%20Algorithms.pdf).
| 5 | [Advanced Sorting I](./src/p5) | [MergeSortTest](./src/p5/MergeSortTest.java) | Compares the performance of insertion sort, merge sort, and enhanced merge sort. <br> Refer to graphs and documentation PDF [here](./src/p5/Practical%205%20-%20Advanced%20Sorting%20Algorithms.pdf).
| 6 | [Advanced Sorting II](./src/p6) | [QuickSortTest](./src/p6/QuickSortTest.java) | Compares the performance of merge sort, quick sort, and enhanced quick sort. <br> Refer to graphs and documentation PDF [here](./src/p6/Practical%206%20-%20Advanced%20Sorting%20Algorithms%20II.pdf).
| 7 | [Substring Search](./src/p7) | [BruteForce](./src/p7/BruteForce.java) | Brute force search for a pattern in text.
| | | [KMPSearch](./src/p7/KMPSearch.java) | Knuth-Morris-Pratt algorithm to search for a pattern in text.
| | | [SearchTest](./src/p7/SearchTest.java) | Compares the performance of brute force and KMP substring search algorithms, using data from the [input file](./src/p7/input.txt). <br> Refer to graphs and documentation PDF [here](./src/p7/Practical%207%20-%20Substring%20Search.pdf).
| 8 | [Tries](./src/p8) | [Trie](./src/p8/Trie.java) | Builds a Trie data structure to help store and search for String keys.
| 9 | [Run Length Compression](./src/p9) | [RunLengthStrings](./src/p9/RunLengthStrings.java) | Compresses a String provided as a command line argument. <br> See class description for usage details.
| | | [CustomInput](./src/p9/CustomInput.java) | Generates a custom input file filled with ASCII null characters, suitable for binary run length encoding.
| | | 4runs.bin, 4runsrle.bin, <br> abra.txt, custom_input.txt, <br> custom_input_rle.txt, <br> q32x48.bin, q32x48rle.bin, <br> q64x96.bin, q64x96rle.bin | Data files for multiple experiments with run length compression. <br> Refer to the documentation PDF [here](./src/p9/Practical%209%20-%20Run%20Length%20Compression.pdf)
| 10| Practical 10
| 11| [Assignment: Huffman Compression](./src/assignment) | -|- |
| 12| [Utilities](./src/util) | - | Multiple utility programs written by Robert Sedgewick and Kevin Wayne, used throughout the repository, especially for [Run Length Compression](./src/p9) and the [Huffman Compression](./src/assignment) assignment.

## Authors:
* [Rajit Banerjee](https://github.com/rajitbanerjee), 18202817
* Dr. Mark Matthews, lecturer
* Reference: Algorithms by Sedgewick and Wayne
