class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
       List<Integer> missing = new ArrayList<>();
        
        // The range goes from nums[0] (min) to nums[nums.length - 1] (max)
        int minVal = nums[0];
        int maxVal = nums[nums.length - 1];
        
        // Put elements in a HashSet for O(1) lookup, or use a pointer approach since it's sorted
        boolean[] present = new boolean[maxVal + 1];
        for (int num : nums) {
            present[num] = true;
        }
        
        // Check for missing numbers in the range
        for (int i = minVal + 1; i < maxVal; i++) {
            if (!present[i]) {
                missing.add(i);
            }
        }
            return missing;
    }
    }