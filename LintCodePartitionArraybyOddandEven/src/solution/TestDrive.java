package solution;

public class TestDrive {
	
	public static void main(String[] args){
		int[] test = {2147483644,2147483645,2147483646,2147483647};
		Solution sol = new Solution();
		sol.partitionArray(test);
		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
			System.out.println(2147483644 % 2);
		}
	}
	
}
