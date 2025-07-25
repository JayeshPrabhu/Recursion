public class PrintNum5 {
    static int number(int n) {
        if(n < 0) {
            return 0;  // base condition
        }
        System.out.println(n); // print current number
        return number(n - 1);  // recursive call with (n-1)
    }

    public static void main(String[] args) {
        int num = 6;
        number(num); // calling the method
    }
}
