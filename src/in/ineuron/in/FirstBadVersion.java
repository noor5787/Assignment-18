package in.ineuron.in;

public class FirstBadVersion {

	    private static boolean isBadVersion(int version) {
	        // Implementation of the API method
	        // Returns true if the version is bad, false otherwise
	        // You need to implement this method
	        return false; // Placeholder implementation
	    }

	    private static int findFirstBadVersion(int n) {
	        int left = 1;
	        int right = n;

	        while (left < right) {
	            int mid = left + (right - left) / 2;
	            if (isBadVersion(mid)) {
	                right = mid;
	            } else {
	                left = mid + 1;
	            }
	        }

	        return left;
	    }

	    public static void main(String[] args) {
	        int n = 5;
	        int firstBadVersion = findFirstBadVersion(n);
	        System.out.println("First bad version: " + firstBadVersion);
	    }
	}

