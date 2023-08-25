package debuggingprocess;

public class ExpressionAndNavigationExample {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int sum = calculateSum(x, y); // Установите точку останова на этой строке

        System.out.println(sum);
    }

    public static int calculateSum(int a, int b) {
        int result = a + b;
        return result;
    }
}