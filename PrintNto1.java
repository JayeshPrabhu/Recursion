// Class to print numbers from N to 1 using recursion
public class PrintNto1 {

    // Recursive method to print numbers from i to 1
    static void printnum(int i) {
        // Base case: if i is less than 1, stop the recursion
        if (i < 1) return;

        // Print the current value of i
        System.out.println(i);

        // Recursive call with (i - 1)
        printnum(i - 1);
    }

    public static void main(String[] args) {
        int num = 5;  // Set the starting number

        // Start printing from num to 1
        printnum(num);
    }
}
