public class TestSort{

	public static void main(String[] args){
	
	Sort5 test = new Sort5(args,true);
	
	
	//test.bubbleSort();
	//test.insertionSort();
	test.selectionSort();
	
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
	//public void mergeSort(){}
	//public void quickSort(){}

}