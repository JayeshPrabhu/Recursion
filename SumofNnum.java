public class SumofNnum {

    static int SumofNum(int num){
        if(num < 1) {
            return 0; // Base case
        }
        return num + SumofNum(num - 1);
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(SumofNum(num)); // Output will be 15
    }
}
