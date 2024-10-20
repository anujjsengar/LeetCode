import java.util.*;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return result;
        }
        
        int wordLength = words[0].length();
        int wordCount = words.length;
        int totalLength = wordLength * wordCount;
        
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }
        
        for (int i = 0; i < wordLength; i++) {
            int start = i;
            int end = i;
            Map<String, Integer> currentMap = new HashMap<>();
            
            while (end + wordLength <= s.length()) {
                String word = s.substring(end, end + wordLength);
                end += wordLength;
                
                if (wordMap.containsKey(word)) {
                    currentMap.put(word, currentMap.getOrDefault(word, 0) + 1);
                    
                    while (currentMap.get(word) > wordMap.get(word)) {
                        String firstWord = s.substring(start, start + wordLength);
                        currentMap.put(firstWord, currentMap.get(firstWord) - 1);
                        start += wordLength;
                    }
                    
                    if (end - start == totalLength) {
                        result.add(start);
                    }
                } else {
                    currentMap.clear();
                    start = end;
                }
            }
        }
        
        return result;
    }
}
