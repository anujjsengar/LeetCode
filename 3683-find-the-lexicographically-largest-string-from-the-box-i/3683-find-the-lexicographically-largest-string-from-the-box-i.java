class Solution {
    public String answerString(String word, int numFriends) {
        int length = word.length();
        if (numFriends == 1) {
            return word;
        }

        char supremeEntity = ' ';
        String celestialPath = "";

        for (int i = 0; i < length; i++) {
            if (word.charAt(i) > supremeEntity) {
                supremeEntity = word.charAt(i);
            }
        }

        for (int i = 0; i < length; i++) {
            if (word.charAt(i) == supremeEntity) {
                int pathLimit = Math.min(length - i, length - numFriends + 1);
                if (pathLimit <= 0) {
                    continue;
                }
                String mysticTrail = word.substring(i, i + pathLimit);
                if (mysticTrail.compareTo(celestialPath) > 0) {
                    celestialPath = mysticTrail;
                }
            }
        }

        return celestialPath;
    
    }
}