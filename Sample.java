package test;

import java.util.HashMap;
import java.util.Map;

class Sample {
	
	public static void main(String[] args) {
		int[] result=twoSum(new int[]{1, 3,5,4},4);
		System.out.println(result[0]);
		System.out.println(result[1]);
	}
    public static int[] twoSum(int[] nums, int target) {
        // Initialize an integer array to store the result
        int[] result = new int[2];
       
        // Check if the input array is empty
        if (nums.length < 1)
            return result; // If empty, return an empty result
       
        // Create a HashMap to store numbers and their indices
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through the input array
        for (int i = 0; i <= nums.length - 1; i++) {
            // Calculate the complement for the current number
            int complement = target - nums[i];
           
            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // If complement found, set indices in the result array
                result[0] = map.get(complement); // Index of complement
                result[1] = i; // Current index
                return result; // Return the result
            } else {
                // If complement not found, add the current number and its index to the map
                map.put(nums[i], i);
            }
        }
       
        // If no solution found, return the initialized result
        return result;
    }
}