package solution;

public class Solution {
	
	public void replaceBlank(char[] string) {
		int length = string.length;
		for (int i = 0; i < length; i++) {
			if (string[i] == ' ') {
				string[i] = '%';
				for (int j = length - 2; j >= i + 1; j--) {
					string[j+1] = string[j];
				}
				string[i+1] = '2';
				for (int j = length - 2; j >= i + 2; j--) {
					string[j+1] = string[j];
				}
				string[i+2] = '0';
			}
		}
	}
	
	public boolean isPalindrome(String s) {
        // Write your code here
        if (s == null || s.length() == 0) {
            return true;
        }
        int length = s.length();
        int i = 0, j = length - 1;
        while (i < j) {
            while (!Character.isLetter(s.charAt(i)) && !Character.isDigit(s.charAt(i)) && i < j) {
                i++;
            }
            while (!Character.isLetter(s.charAt(j)) && !Character.isDigit(s.charAt(j)) && i < j) {
                j--;
            }
            if(Character.toUpperCase(s.charAt(i)) != Character.toUpperCase(s.charAt(j))) {
                return false;
            }
            System.out.println(s.charAt(i)+" "+s.charAt(j));
            i++;
            j--;
        }
        return true;
    }

}
