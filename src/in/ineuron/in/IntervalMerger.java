package in.ineuron.in;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "[" + start + "," + end + "]";
    }
}

public class IntervalMerger {
 
	


	    public static Interval[] mergeIntervals(Interval[] intervals) {
	        if (intervals == null || intervals.length == 0) {
	            return new Interval[0];
	        }

	        // Sort intervals based on the start time
	        Arrays.sort(intervals, Comparator.comparingInt(i -> i.start));

	        List<Interval> mergedIntervals = new ArrayList<>();
	        Interval currentInterval = intervals[0];

	        for (int i = 1; i < intervals.length; i++) {
	            Interval interval = intervals[i];

	            if (interval.start <= currentInterval.end) {
	                // Overlapping intervals, update the end time
	                currentInterval.end = Math.max(currentInterval.end, interval.end);
	            } else {
	                // Non-overlapping interval, add the current interval to the result
	                mergedIntervals.add(currentInterval);
	                currentInterval = interval;
	            }
	        }

	        // Add the last interval to the result
	        mergedIntervals.add(currentInterval);

	        return mergedIntervals.toArray(new Interval[0]);
	    }

	    public static void main(String[] args) {
	        Interval[] intervals = {new Interval(1, 3), new Interval(2, 6), new Interval(8, 10), new Interval(15, 18)};

	        Interval[] mergedIntervals = mergeIntervals(intervals);

	        System.out.println("Merged Intervals:");
	        for (Interval interval : mergedIntervals) {
	            System.out.println(interval);
	        }
	    }
	}

