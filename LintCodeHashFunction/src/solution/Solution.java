package solution;

class Solution {
    /**
     * @param key: A String you should hash
     * @param HASH_SIZE: An integer
     * @return an integer
     */
    public int hashCode(char[] key,int HASH_SIZE) {
        // write your code here
        long sum = 0;
        for (int i = 0; i < key.length; i++) {
            sum = sum * 33 + (long)key[i];
            System.out.println(sum);
        }
        return (int)sum % HASH_SIZE;
    }
    
};