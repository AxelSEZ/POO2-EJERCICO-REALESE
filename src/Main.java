import java.nio.charset.StandardCharsets;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) throws Exception {
        // Forzar a que System.out use UTF-8
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

    }
}
