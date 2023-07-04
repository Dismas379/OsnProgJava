import java.util.HashMap;

public class RomanToNumber {
    public static int convert(String romanNumeral) {
        HashMap<Character, Integer> romanToNumber = new HashMap<>();
        romanToNumber.put('I', 1);
        romanToNumber.put('V', 5);
        romanToNumber.put('X', 10);
        romanToNumber.put('L', 50);
        romanToNumber.put('C', 100);
        romanToNumber.put('D', 500);
        romanToNumber.put('M', 1000);

        int result = 0;
        int prev = 0;

        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            int current = romanToNumber.get(romanNumeral.charAt(i));
            if (current >= prev) {
                result += current;
            } else {
                result -= current;
            }
            prev = current;
        }

        return result;
    }

    public static void main(String[] args) {
        String romanNumeral = "MCMLXXXIV";
        int arabicNumber = convert(romanNumeral);
        System.out.println(arabicNumber); // 1984
    }
}