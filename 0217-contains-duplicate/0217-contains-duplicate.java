class Solution {
    public boolean containsDuplicate(int[] arr) {
         HashMap<Integer, Integer> frequencyMap = countFrequency(arr);
         for (Integer key : frequencyMap.keySet()) {
            if(frequencyMap.get(key)>1){
                return true;
            }
        }
        return false;
    }
    public static HashMap<Integer, Integer> countFrequency(int[] arr) {
        // Create a new HashMap to store integer frequencies
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Iterate over each integer in the array
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            // Check if the integer is already in the map
            if (frequencyMap.containsKey(num)) {
                // If the integer is already in the map, increment its count
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                // If the integer is not in the map, add it with a count of 1
                frequencyMap.put(num, 1);
            }
        }

        return frequencyMap;
    }
}