package loopexamples;

public class Main {
    public static void main(String[] args) {
        int[] arrayInt = {10, 20, 30, 40, 50};
        sumOfArray(arrayInt);
    }

    private static void sumOfArray(int[] arrayInt) {
        int sum = 0;
        for (int item : arrayInt) {
            if (item == 30) {
                continue;
            }
            sum += item;
            if (sum >= 100) {
                break;
            }
        }
        System.out.println(sum);
    }
}
