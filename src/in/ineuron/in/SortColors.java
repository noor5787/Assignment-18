package in.ineuron.in;

public class SortColors {

	
	    public static void sortColors(int[] nums) {
	        int n = nums.length;
	        int left = 0;
	        int right = n - 1;
	        int current = 0;

	        while (current <= right) {
	            if (nums[current] == 0) {
	                swap(nums, current, left);
	                left++;
	                current++;
	            } else if (nums[current] == 2) {
	                swap(nums, current, right);
	                right--;
	            } else {
	                current++;
	            }
	        }
	    }

	    private static void swap(int[] nums, int i, int j) {
	        int temp = nums[i];
	        nums[i] = nums[j];
	        nums[j] = temp;
	    }

	    public static void main(String[] args) {
	        int[] nums = {2, 0, 2, 1, 1, 0};
	        sortColors(nums);
	        System.out.print("Sorted colors: ");
	        for (int num : nums) {
	            System.out.print(num + " ");
	        }
	    }
	}

