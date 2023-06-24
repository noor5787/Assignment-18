package in.ineuron.in;

public class LongestIncreasingSubsequence {
  
	    public static int lengthOfLIS(int[] nums) {
	        int n = nums.length;
	        int[] dp = new int[n];
	        int maxLength = 0;

	        for (int i = 0; i < n; i++) {
	            dp[i] = 1;
	            for (int j = 0; j < i; j++) {
	                if (nums[i] > nums[j]) {
	                    dp[i] = Math.max(dp[i], dp[j] + 1);
	                }
	            }
	            maxLength = Math.max(maxLength, dp[i]);
	        }

	        return maxLength;
	    }

	    public static void main(String[] args) {
	        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
	        int length = lengthOfLIS(nums);
	        System.out.println("Length of the longest increasing subsequence: " + length);
	    }
	}

