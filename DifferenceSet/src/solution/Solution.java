package solution;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
	
	public int[] difSet(int[] A, int[] B){
		HashMap<Integer, Integer> mapA = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> mapB = new HashMap<Integer, Integer>();
		for (int i = 0; i < A.length; i++) {
			if (mapA.containsKey(A[i])) {
				int times = mapA.get(A[i]);
				times++;
				mapA.put(A[i], times);
			} else {
				mapA.put(A[i], 1);
			}
		}
		for (int i = 0; i < B.length; i++) {
			if (mapB.containsKey(B[i])) {
				int times = mapB.get(B[i]);
				times++;
				mapB.put(B[i], times);
			} else {
				mapB.put(B[i], 1);
			}
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < A.length; i++) {
			if (mapB.containsKey(A[i]) && mapB.get(A[i]) != 0) {
				int times = mapB.get(A[i]);
				times--;
				mapB.put(A[i], times);
			} else {
				list.add(A[i]);
			}
		}
		//return list;
		int[] rst = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			rst[i] = list.get(i);
		}
		return rst; 
	}

}
