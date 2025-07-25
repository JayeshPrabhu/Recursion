// Class to print numbers from 1 to N using recursion
public class print1toN {

    // Recursive method to print numbers from 1 to n
    static void printnum(int i, int n) {
        // Base case: if i is less than 1, stop recursion
        if (i < 1) return;

        // Recursive call with (i - 1) to reach 1
        printnum(i - 1, n);

        // Print the current number after returning from recursion
        System.out.println(i);
    }

    public static void main(String[] args) {
        int n = 25;  // Define the value of n

        // Start the recursive printing from n down to 1
        printnum(n, n);  // Only i is actually used, n is not needed here
    }
}
