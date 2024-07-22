class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap<>();
        for(int i = 0;i<names.length;i++){
        map.put(heights[i],names[i]);
       }
Arrays.sort(heights);
for (int i = 0; i < heights.length; i++) {
    names[heights.length-1-i] = map.getOrDefault(heights[i], Integer.toString(heights[i])); // Use getOrDefault for potential missing values
}

        return names;
    }
}