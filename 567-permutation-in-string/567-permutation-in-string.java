class Solution {
    public boolean checkInclusion(String pattern, String str) {
        Map<Character, Integer> characterCount = new HashMap<>();
        for(char ch: pattern.toCharArray()){
            characterCount.put(ch, (characterCount.getOrDefault(ch, 0) + 1));
        }
        int windowStart = 0;
        int matched = 0;
        for(int windowEnd = 0; windowEnd < str.length(); windowEnd ++) {
            char end = str.charAt(windowEnd);
            if (characterCount.containsKey(end)) {
                characterCount.put(end, characterCount.get(end) - 1);
                if (characterCount.get(end)  == 0){
                    matched++;
                }
            }
            if (matched == characterCount.size()) {
                return true;
            }
            if (windowEnd >= pattern.length() - 1){
                char start = str.charAt(windowStart++);
                if(characterCount.containsKey(start)) {
                    if(characterCount.get(start) == 0) {
                        matched--;
                    }
                    characterCount.put(start, characterCount.get(start) + 1);
                    System.out.println(characterCount.get(end));
                }
            }
        }
        return false;
            }
}