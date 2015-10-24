package solution;

public class TestDrive {

	public static void main(String[] args){
		Solution sol = new Solution();
		int[] A = {1,1,1,2,2,2};
		int[] B = {2,2,3};
		int[] rst = sol.difSet(A, B);
		for (int i : rst) {
			System.out.println(i);
		}
	}
	
}
