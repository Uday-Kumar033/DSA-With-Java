import java.util.HashMap;

public class Q3_MajorityElement {
    public static int findMajorityElement(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int n = nums.length;
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) > n / 2) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 3, 2};  // Example input
        int result = findMajorityElement(nums);
        if (result != -1) {
            System.out.println("Majority Element: " + result);
        } else {
            System.out.println("No Majority Element found.");
        }
    }
}
