public class Erasthones {
    
	public static final void main (String[] args) {

		int num = Integer.parseInt(args[0]);
		int prime = 2;
		
		boolean numBank[] = new boolean[num+1];
		
		for(int i = 0; i<= num;i++)
			numBank[i] = true;
		
		do{
		
			for(int i = 2;i<= num;i++){
		
				if( i%prime == 0 && i!=prime)
					numBank[i] = false;
			
				//System.out.print (i+":"+numBank[i]+",");
			}
		
			for(int i = 2;i<= num;i++){
		
				if( i%prime != 0 && i > prime && numBank[i]!=false){
			
					prime = i;
					break;
				}
			} 
			
		}while(prime*prime <= num);
	
		for(int i = 2 ; i<= num ; i++){
		
			if(numBank[i] == true)
				System.out.println (i);
		}
		
	}
}