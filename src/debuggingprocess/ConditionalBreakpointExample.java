package debuggingprocess;

public class ConditionalBreakpointExample {
    public static void main(String[] args) {
        int x = 0;

        for (int i = 0; i < 10; i++) {
            x += i;
        }

        System.out.println("Final value of x: " + x);
    }
}
