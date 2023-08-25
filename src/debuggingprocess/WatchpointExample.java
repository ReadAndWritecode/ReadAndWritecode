package debuggingprocess;

public class WatchpointExample {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int sum = x + y; // Установите точку останова на этой строке

        x = 7; // Измените значение x
        sum = x + y;

        System.out.println(sum);
    }
}