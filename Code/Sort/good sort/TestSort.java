public class TestSort{

	public static void main(String[] args){
	
	String[] string4sort = {"c","d","f","e","a","b","h","A","o","C","n","D","B","F","p","q","r","x","E","1","2","3","4","y","G","H","I","m","Z","0","5","z","Y","8","9","7","J","K","X","R","j","k","N","M","O","l","P","Q","i"};	
	int[] int4sort2 = {1,2,3,4,5,6,7,7,8,3,2,1,0,3,4,2,3,2,1,6,9,5};
		
	Sort5 test = new Sort5(string4sort,true);
	
	
	
	
	System.out.println("Quick Sort!");
	
	
	int[] result = Sort5.qSort(int4sort2,0,int4sort2.length-1,true);
	for(int i : result)
		System.out.println(i);
		
		
	}



}

class Sort5{

	private String[] sorted,origin;
	private boolean order;
	
	Sort5(String[] origin, boolean order){
	
		//deep copy origin
		this.origin = origin.clone();
		this.order = order;
		this.sorted = origin.clone();
	}
	
	
	
	
	public static int[] qSort(int[] num, int left, int right, boolean order) { 
		
		if (left < right) { 
			
			int pivot = Partition(num, left, right, order); 
			if (pivot > 1) { qSort(num, left, pivot - 1, order); 
				
			} 
			
		if (pivot <= right) { 
			
			qSort(num, pivot + 1, right, order); 
			
			} 
		} 
		
		return num; 
		
		}

	private static int Partition(int[] num, int left, int right, boolean order) { 
		
		int pivot = num[left]; 
		while (true) { 
			while (order == true ? (num[left] < pivot) : (num[left] > pivot)) { 
				left++; 
				} 
			
			while (order == true ? (num[right] > pivot) : (num[right] < pivot)) {
				right--; 
				} 
				
			if (left < right) { 
				
				 int temp = num[right]; 
				 num[right] = num[left]; 
				 num[left] = temp;
				
			if (num[left] == num[right]) { 
				
				left++; 
				
				} 
			} else { 
				
				return right; 
				} 
			} 
		}

	
}