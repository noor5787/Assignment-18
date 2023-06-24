package in.ineuron.in;
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0) {
            return 0;
        }

        // Sort the balloons based on their end points
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));

        int arrows = 1;
        int end = points[0][1];

        // Iterate through the balloons
        for (int i = 1; i < points.length; i++) {
            // If the current balloon starts after the previous balloon's end point,
            // it requires a new arrow since the previous arrow won't be able to reach it
            if (points[i][0] > end) {
                arrows++;
                end = points[i][1];
            }
        }

        return arrows;
    }
}

public class Main {

	    public static void main(String[] args) {
	        int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
	        Solution solution = new Solution();
	        int minArrows = solution.findMinArrowShots(points);
	        System.out.println("Minimum number of arrows required: " + minArrows);
	    }
	}
	

