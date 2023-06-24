package in.ineuron.in;

import java.util.Stack;

public class Pattern132 {
  
	    public static boolean find132pattern(int[] nums) {
	        int n = nums.length;
	        int[] min = new int[n];
	        min[0] = nums[0];

	        // Compute the minimum value at each index
	        for (int i = 1; i < n; i++) {
	            min[i] = Math.min(min[i - 1], nums[i]);
	        }

	        Stack<Integer> stack = new Stack<>();

	        // Traverse the array from right to left
	        for (int j = n - 1; j >= 0; j--) {
	            if (nums[j] > min[j]) {
	                // Check if there is a number greater than the minimum
	                // value at j and smaller than the current number on the stack
	                while (!stack.isEmpty() && stack.peek() <= min[j]) {
	                    stack.pop();
	                }
	                if (!stack.isEmpty() && stack.peek() < nums[j]) {
	                    return true;
	                }
	                stack.push(nums[j]);
	            }
	        }

	        return false;
	    }

	    public static void main(String[] args) {
	        int[] nums = {1, 2, 3, 4};
	        boolean has132Pattern = find132pattern(nums);
	        System.out.println(has132Pattern); // Output: false
	    }
	}

