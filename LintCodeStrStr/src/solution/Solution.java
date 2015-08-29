package solution;

public class Solution {
	/**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
    public int strStr(String source, String target) {
        //write your code here
    	if(source == null || target == null)
        	return -1;
        int srclen = source.length();
        int tarlen = target.length();
        for(int i=0; i < srclen - tarlen + 1; i++){
        	if(source.substring(i, i + tarlen).equals(target)){
        		return i;
        	}
        }
        return -1;
    }
}
