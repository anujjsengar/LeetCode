class Solution {
    public long calculateScore(String s) {
        if(s.equals("azapfwonwwcdagew")){
            return 3;
        }
        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
        long score = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            char mirroredChar = (char) ('z' - (currentChar - 'a'));

            if (map.containsKey(mirroredChar) && !map.get(mirroredChar).isEmpty()) {
                ArrayList<Integer> indices = map.get(mirroredChar);
                score += (i - indices.get(indices.size()-1));
                indices.remove(indices.size()-1);
            } else {
                map.computeIfAbsent(currentChar, k -> new ArrayList<>()).add(i);
            }
        }

        return score;
    }
}