package solution;

import java.util.Set;

public class Solution {
	/**
     * @param s: A string s
     * @param dict: A dictionary of words dict
     */
    public boolean wordBreak(String s, Set<String> dict) {
        // write your code here 
        if (s == null || s.length() == 0) {
            return true;
        }
        int size = s.length();
        int maxlen = 0;
        for (String str : dict) {
            maxlen = Math.max(maxlen, str.length());
        }
        boolean[] canBreak = new boolean[size + 1];
        canBreak[0] = true;
        for (int i = 1; i < size + 1; i++) {
            canBreak[i] = false;
        }
        for (int i = 1; i < size + 1; i++) {
            for (int wordlen = 1; wordlen <= i && wordlen <= maxlen; wordlen++) {
                if (!canBreak[i - wordlen]) {
                    continue;
                }
                if ( dict.contains(s.substring(i - wordlen, i)) ){
                    canBreak[i] = true;
                    break;
                }
            }
        }
        return canBreak[size];
    }
}
