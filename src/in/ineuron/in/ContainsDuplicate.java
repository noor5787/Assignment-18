package in.ineuron.in;
import java.util.HashSet;

public class ContainsDuplicate {


	    public static boolean containsDuplicate(int[] nums) {
	        HashSet<Integer> set = new HashSet<>();
	        
	        for (int num : nums) {
	            if (set.contains(num)) {
	                return true;
	            }
	            set.add(num);
	        }
	        
	        return false;
	    }
	    
	    public static void main(String[] args) {
	        int[] nums1 = {1, 2, 3, 1};
	        System.out.println("Input: nums = [1, 2, 3, 1]");
	        System.out.println("Output: " + containsDuplicate(nums1));

	        int[] nums2 = {1, 2, 3, 4};
	        System.out.println("Input: nums = [1, 2, 3, 4]");
	        System.out.println("Output: " + containsDuplicate(nums2));
	    }
	}

