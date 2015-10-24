package solution;

public class TestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Mr John Smith    ";
		char[] c = s.toCharArray();
		Solution sol = new Solution();
		sol.replaceBlank(c);
		System.out.println(c);
		System.out.println(sol.isPalindrome("ab2a"));
		
	}

}
