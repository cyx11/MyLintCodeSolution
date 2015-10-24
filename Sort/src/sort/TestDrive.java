package sort;

public class TestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] list = {4,5,9,2,3,8,7,1,6,0,11,10,5,2,9};	
		Sort sort = new Sort();
		sort.quickSort(list);
		for (int k = 0; k < list.length; k++){
			  System.out.print(list[k]);
		}
		
	}

}
