import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dik üçgenin ilk kenarını girin: ");
        double a = scanner.nextDouble();

        System.out.println("Dik üçgenin ikinci kenarını girin: ");
        double b = scanner.nextDouble();

        // Hipotenüs hesaplama
        double hipotenus = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenüs: " + hipotenus);

        // Üçgenin alanını hesaplama
        double u = (a + b + hipotenus) / 2;
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - hipotenus));
        System.out.println("Üçgenin alanı: " + alan);

    }
}