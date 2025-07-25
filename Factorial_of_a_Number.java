// Class to calculate the factorial of a number using recursion
public class Factorial_of_a_Number {

    // Recursive method to calculate factorial
    static int fact(int num) {
        // Base case: factorial of 0 is 1
        if (num == 0) {
            return 1;
        }

        // Recursive case: num * factorial of (num - 1)
        return num * fact(num - 1);
    }

    public static void main(String[] args) {
        int num = 12;  // The number for which we want the factorial

        // Print the factorial result
        System.out.println(fact(num));
    }
}
