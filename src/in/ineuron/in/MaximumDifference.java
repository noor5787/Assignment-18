package in.ineuron.in;
import java.util.Arrays;
public class MaximumDifference {



	    public static int maximumDifference(int[] nums) {
	        int n = nums.length;
	        if (n < 2) {
	            return 0;
	        }

	        // Sorting the array
	        Arrays.sort(nums);

	        int maxDiff = 0;
	        for (int i = 1; i < n; i++) {
	            int diff = nums[i] - nums[i - 1];
	            if (diff > maxDiff) {
	                maxDiff = diff;
	            }
	        }

	        return maxDiff;
	    }

	    public static void main(String[] args) {
	        int[] nums = {3, 6, 9, 1};
	        int maxDifference = maximumDifference(nums);
	        System.out.println("Maximum Difference: " + maxDifference);
	    }
	}

