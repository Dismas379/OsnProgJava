import java.util.ArrayList;
import java.util.List;

public class RangeFormation {
    public static void main(String[] args) {
        int[] nums = {-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20};
        System.out.println(getRange(nums));
    }

    public static String getRange(int[] nums) {
        if (nums.length == 0) {
            return "";
        }

        List<String> ranges = new ArrayList<>();
        int start = nums[0];
        int prev = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == prev + 1) {
                prev = nums[i];
            } else {
                ranges.add(getFormattedRange(start, prev));
                start = nums[i];
                prev = nums[i];
            }
        }
        ranges.add(getFormattedRange(start, prev));

        return String.join(",", ranges);
    }

    private static String getFormattedRange(int start, int end) {
        if (start == end) {
            return Integer.toString(start);
        } else {
            return start + "-" + end;
        }
    }
}