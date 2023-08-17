import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double r, π = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Daire'nin yari capini giriniz :");
        r = input.nextDouble();
        double alan = π * r * r;
        double  cevre = 2 * π * r;
        System.out.println("Daire'nin alani :" + alan);
        System.out.println("Daire'nin cevresi :" + cevre);
    }
}
