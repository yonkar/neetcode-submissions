class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
    return false;
}
        char[] firstArray = s.toCharArray();
        char[] secondArray = t.toCharArray();
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for (int i = 0; i < firstArray.length; i++) {
            characterIntegerMap.put(firstArray[i],
                    characterIntegerMap.getOrDefault(firstArray[i], 0) + 1);
            characterIntegerMap.put(secondArray[i], characterIntegerMap.getOrDefault(secondArray[i], 0) - 1);
        }
       return !characterIntegerMap.values().stream().anyMatch(integer -> integer!=0);
    }
    }

