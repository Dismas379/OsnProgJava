import java.util.Arrays;

public class NextPermutation {
    public static int nextPermutation(int num) {
        // преобразуем число в массив цифр
        char digits[] = String.valueOf(num).toCharArray();
        int n = digits.length;

        // находим перестановку
        int i, j;
        for (i = n - 2; i >= 0; i--) {
            if (digits[i] < digits[i + 1]) {
                break;
            }
        }
        if (i < 0) {
            // нет возможных перестановок
            return -1;
        }

        for (j = n - 1; j > i; j--) {
            if (digits[j] > digits[i]) {
                // меняем местами найденную цифру с первой большей цифрой
                char temp = digits[i];
                digits[i] = digits[j];
                digits[j] = temp;
                break;
            }
        }

        // сортируем все цифры справа от текущей позиции
        Arrays.sort(digits, i + 1, n);

        // преобразуем перестановку обратно в число
        int nextNum = 0;
        for (i = 0; i < n; i++) {
            nextNum = nextNum * 10 + (digits[i] - '0');
        }
        return nextNum;
    }

    public static void main(String[] args) {
        int num = 12345;
        int nextNum = nextPermutation(num);
        if (nextNum == -1) {
            System.out.println("Нет следующей перестановки");
        } else {
            System.out.println("Следующая переставленная цифра: " + nextNum);
        }
    }
}