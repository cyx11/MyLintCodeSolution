package solution;

public class TestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] key = new String("ubuntu").toCharArray();
		Solution sol = new Solution();
		System.out.println(sol.hashCode(key, 1007));
		long sum = 117*33*33*33*33*33;
		sum += 98*33*33*33*33;
		sum += 117*33*33*33;
		sum += 110*33*33;
		sum += 116*33;
		sum += 117;
		System.out.println(sum % 1007 + " " + Integer.MAX_VALUE);
	}

}
