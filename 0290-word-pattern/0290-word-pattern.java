class Solution {
        public boolean wordPattern(String pattern, String s) {
                HashMap<Character, String> map = new HashMap<>();
                        HashMap<String, Character> reverseMap = new HashMap<>(); // for 1-to-1 mapping check

                                String[] sArray = s.split(" ");
                                        if (pattern.length() != sArray.length) return false;

                                                for (int i = 0; i < pattern.length(); i++) {
                                                            char pChar = pattern.charAt(i);
                                                                        String word = sArray[i];

                                                                                    if (map.containsKey(pChar)) {
                                                                                                    if (!map.get(pChar).equals(word)) {
                                                                                                                        return false;
                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                                    if (reverseMap.containsKey(word)) {
                                                                                                                                                                                        return false; // word already mapped to some other character
                                                                                                                                                                                                        }
                                                                                                                                                                                                                        map.put(pChar, word);
                                                                                                                                                                                                                                        reverseMap.put(word, pChar);
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                                    return true;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        }
