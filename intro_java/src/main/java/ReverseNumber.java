public class ReverseNumber {
    public static void main(String[] args) {
        int input = 12345;
        int output = 0;

        output = reverseNumber(input, output);

        System.out.println(output);
    }

    private static int reverseNumber(int input, int output) {

        while (input > 0) {
            output *= 10;
            output += input % 10;
            input /= 10;
        }

        return output;
    }
}
