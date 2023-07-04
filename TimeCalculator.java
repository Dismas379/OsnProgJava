import java.util.Scanner;

public class TimeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество секунд: ");
        int inputSeconds = scanner.nextInt();
        scanner.close();

        int hours = inputSeconds / 3600;
        int minutes = (inputSeconds % 3600) / 60;
        int seconds = inputSeconds % 60;

        String result = "";
        if (hours > 0) {
            result = hours + " час ";
        }
        if (minutes > 0) {
            result = result + minutes + " минута ";
        }
        if (seconds > 0) {
            result = result + seconds + " секунда ";
        }

        System.out.println("Результат: " + result.trim());
    }
}