public class TestSort{

	public static void main(String[] args){
	
	String[] string4sort = {"c","d","f","e","a","b","h","A","o","C","n","D","B","F","p","q","r","x","E","1","2","3","4","y","G","H","I","m","Z","0","5","z","Y","8","9","7","J","K","X","R","j","k","N","M","O","l","P","Q","i"};	
		
	Sort5 test = new Sort5(string4sort,true);
	
	
	//test.bubbleSort();
	//test.insertionSort();
	//test.selectionSort();
	
	System.out.println("MergeSort Sort!");
	
	//Class method!!!!!	
	String[] result = Sort5.mergeSort(string4sort,false);
	for(String i : result)
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
	
	
	public void bubbleSort(){
		
		System.out.println("Bubble Sort!");
		String temp = new String("");
		
		for (int i = sorted.length - 1; i > 0; --i) {
			for (int j = 0; j < i; ++j) {
				if (sorted[j + 1].compareTo(sorted[j]) < 0) {
					temp = sorted[j];
					sorted[j] = sorted[j + 1];
					sorted[j + 1] = temp;
					
				}
			}
		}
			
		if(order == true){
			for(String i : sorted)
				System.out.println(i);
		}
		else{
			for(int i = (sorted.length -1);i>=0;i--)
				System.out.println(sorted[i]);
		}
		
	}
	
	
	public void insertionSort(){
		
		System.out.println("Insertion Sort!");
		
		
		for(int i = 1;i<sorted.length;i++){
			
			
			String temp = sorted[i];
			int j = i;
			
			while((j>0) && (sorted[j-1].compareTo(temp) > 0)){
				sorted[j] = sorted[j-1]; 
				j--;
			
			}
				
			sorted[j] = temp;			
	
		}
	
		if(order == true){
			for(String i : sorted)
				System.out.println(i);
		}
		else{
			for(int i = (sorted.length -1);i>=0;i--)
				System.out.println(sorted[i]);
		}
	
	}
		
	public void selectionSort(){
	
		System.out.println("Selection Sort!");
		String temp = "";
		
		int min;
		
		for(int i = 0;i<sorted.length-1; i++){
			min = i;
			for(int j = i+1;j<sorted.length;j++){
				if(sorted[j].compareTo(sorted[min])<0){
					min = j;
				
				}	
			}
			
			temp = sorted[i];
			sorted[i] = sorted[min];
			sorted[min] = temp;
		
		}
	
		if(order == true){
			for(String i : sorted)
				System.out.println(i);
		}
		else{
			for(int i = (sorted.length -1);i>=0;i--)
				System.out.println(sorted[i]);
		}
	
	}
	
	//class method!!!!
		
	public static String[] mergeSort(String[] arr, boolean order){
		
	if(arr.length==1){
		return arr;
	}
	int half = arr.length/2;
	String[] arr1 = new String[half];
	String[] arr2 = new String[arr.length-half];
	System.arraycopy(arr, 0, arr1, 0, arr1.length);
	System.arraycopy(arr, half, arr2, 0, arr2.length);
	arr1 = mergeSort(arr1,order);
	arr2 = mergeSort(arr2,order);
	return mergeSortSub(arr1,arr2,order);
	}
	
	private static String[] mergeSortSub(String[] arr1,String[] arr2,boolean order){
	String[] result = new String[arr1.length+arr2.length];
	int i = 0;
	int j = 0;
	int k = 0;
	while(true){
		
		if(order == true){
			
			if(arr1[i].compareTo(arr2[j])<0){
				result[k] = arr1[i];
				if(++i>arr1.length-1){
				break;
			}
			}else{
				result[k] = arr2[j];
				if(++j>arr2.length-1){
				break;
				}
			}
			
			}
		else{
			
			if(arr1[i].compareTo(arr2[j])>0){
				result[k] = arr1[i];
				if(++i>arr1.length-1){
				break;
			}
			}else{
				result[k] = arr2[j];
				if(++j>arr2.length-1){
				break;
				}
			}
			
			
			
			
			
			}
		
		
		k++;
	}
	for(;i<arr1.length;i++){
		result[++k] = arr1[i];
	}
	for(;j<arr2.length;j++){
		result[++k] = arr2[j];
	}
	return result;
	}
	
	//public void quickSort(){}

}