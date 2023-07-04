import java.util.Scanner;

public class RomanNumeralsConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество лет: ");
        int years = scanner.nextInt();

        if (years < 1 || years > 9999) {
            System.out.println("Недопустимое количество лет!");
            return;
        }

        String roman = "";

        while (years >= 1000) {
            roman += "M";
            years -= 1000;
        }
        while (years >= 900) {
            roman += "CM";
            years -= 900;
        }
        while (years >= 500) {
            roman += "D";
            years -= 500;
        }
        while (years >= 400) {
            roman += "CD";
            years -= 400;
        }
        while (years >= 100) {
            roman += "C";
            years -= 100;
        }
        while (years >= 90) {
            roman += "XC";
            years -= 90;
        }
        while (years >= 50) {
            roman += "L";
            years -= 50;
        }
        while (years >= 40) {
            roman += "XL";
            years -= 40;
        }
        while (years >= 10) {
            roman += "X";
            years -= 10;
        }
        while (years >= 9) {
            roman += "IX";
            years -= 9;
        }
        while (years >= 5) {
            roman += "V";
            years -= 5;
        }
        while (years >= 4) {
            roman += "IV";
            years -= 4;
        }
        while (years >= 1) {
            roman += "I";
            years -= 1;
        }

        System.out.println("Римское представление количества лет: " + roman);
    }

}