
class Test{
    
    
    public static void main(String[] args) { 
        
        
        Philosopher p1 = new Philosopher(0);
	Philosopher p2 = new Philosopher(1);
	Philosopher p3 = new Philosopher(2);
	Philosopher p4 = new Philosopher(3);
	Philosopher p5 = new Philosopher(4);
        
	Thread t1 = new Thread(p1,"A");
	Thread t2 = new Thread(p2,"B");
	Thread t3 = new Thread(p3,"C");
	Thread t4 = new Thread(p4,"D");
	Thread t5 = new Thread(p5,"E");
    
	t1.start(); 
	t2.start(); 
	t3.start(); 
	t4.start(); 
	t5.start(); 
        
        
    } 
    
    
    
    
    
}




class Philosopher implements Runnable{
    
    // assume 5 philosophers share the same five forks
    static boolean[] forks = {true,true,true,true,true};//true: available
    private int id;
    private int isFull = 0;
    private boolean leftFork = false;
    private boolean rightFork = false;
    
    int right =0;
    int left =0;
    
    Philosopher(int id){
        
        this.id = id;
	this.right = (this.id+4)%5;
	this.left = this.id;
        
        }
    
    //methods
        
    public void run() { 
	
	//int right = (this.id+4)%5;
	//int left = this.id;
	
	if(this.id == 0){// get left side  first . 
		//System.out.println("Forks[0]:"+forks[0]+" [1]:"+forks[1]+" [2]:"+forks[2]+" [3]:"+forks[3]+" [4]:"+forks[4]); 
		if(forks[left]==true){
			forks[left] = false;
			System.out.println(this.id + ": Got left fork..."+left); 
			//System.out.println("Forks[0]:"+forks[0]+" [1]:"+forks[1]+" [2]:"+forks[2]+" [3]:"+forks[3]+" [4]:"+forks[4]); 
			
			if(forks[right]==true){
				forks[right] = false;
				System.out.println(this.id + ": Got right fork..."+right);
			//	System.out.println("Forks[0]:"+forks[0]+" [1]:"+forks[1]+" [2]:"+forks[2]+" [3]:"+forks[3]+" [4]:"+forks[4]); 
				
				eating();
				
				this.run();
				
			}else{
				forks[left] = true;
				System.out.println(this.id + ": Can not get right fork "+right+". Free left fork "+ left+"!!!");
				//System.out.println("Forks[0]:"+forks[0]+" [1]:"+forks[1]+" [2]:"+forks[2]+" [3]:"+forks[3]+" [4]:"+forks[4]); 
				
				try{	// Can not eat ... so go thinking				
					System.out.println(this.id + ": Go thinking...(Type I)");
					Thread.sleep(999);
				
				}catch (InterruptedException e) {
					
					System.out.println(this.id + ":I don't want to eat!!!...");                      
					
					}
				
				this.run();// again 
				
				
				}
			
			
			}else{
				
				System.out.println(this.id + ": Can not get left fork "+left+"!!!");
				//System.out.println("Forks[0]:"+forks[0]+" [1]:"+forks[1]+" [2]:"+forks[2]+" [3]:"+forks[3]+" [4]:"+forks[4]); 
				System.out.println(this.id + ": Try to get left fork "+left+" again!!!");
				
				
				this.run();// again
				
				}
		
		
		}else{//right first
			//System.out.println("Forks[0]:"+forks[0]+" [1]:"+forks[1]+" [2]:"+forks[2]+" [3]:"+forks[3]+" [4]:"+forks[4]); 
			if(forks[right]==true){
			forks[right] = false;
			System.out.println(this.id + ": Got right fork..."+right); 
			//System.out.println("Forks[0]:"+forks[0]+" [1]:"+forks[1]+" [2]:"+forks[2]+" [3]:"+forks[3]+" [4]:"+forks[4]); 
			
			if(forks[left]==true){
				forks[left] = false;
				System.out.println(this.id + ": Got left fork..."+left); 
				//System.out.println("Forks[0]:"+forks[0]+" [1]:"+forks[1]+" [2]:"+forks[2]+" [3]:"+forks[3]+" [4]:"+forks[4]); 
				
				eating();
				
				this.run();
				
			}else{
				forks[right] = true;
				System.out.println(this.id + ": Can not get left fork "+left+". Free right fork!!!");
			//	System.out.println("Forks[0]:"+forks[0]+" [1]:"+forks[1]+" [2]:"+forks[2]+" [3]:"+forks[3]+" [4]:"+forks[4]); 
				
				try{	// Can not eat ... so go thinking				
					System.out.println(this.id + ": Go thinking...(Type III)");
					Thread.sleep(999);
				
				}catch (InterruptedException e) {
					
					System.out.println(this.id + ":I don't want to eat!!!...");                      
					
					}
				
				this.run();// again 
				
				
				}
			
			
			}else{
				//System.out.println("Forks[0]:"+forks[0]+" [1]:"+forks[1]+" [2]:"+forks[2]+" [3]:"+forks[3]+" [4]:"+forks[4]); 
				System.out.println(this.id + ": Can not get right fork "+right+" !!!");
				//System.out.println("Forks[0]:"+forks[0]+" [1]:"+forks[1]+" [2]:"+forks[2]+" [3]:"+forks[3]+" [4]:"+forks[4]); 
				
				System.out.println(this.id + ": Try to get right fork "+right+" again!!!");
				
				this.run();// again
				
				}
			
			
			
			
			}
	    
	    
	    
        
    } 
    
	public void eating(){
        
		isFull++;
		System.out.println(this.id + ": Eated... "+isFull+" times.[E1]"); 
		
		System.out.println(this.id + ": Free both forks...[E2.1] L:"+left+" R:"+right); 
		//System.out.println("Forks[0]:"+forks[0]+" [1]:"+forks[1]+" [2]:"+forks[2]+" [3]:"+forks[3]+" [4]:"+forks[4]); 
		forks[left]=true;
		forks[right]=true;
		//System.out.println("Free - Forks[0]:"+forks[0]+" [1]:"+forks[1]+" [2]:"+forks[2]+" [3]:"+forks[3]+" [4]:"+forks[4]+"[E2.2]"); 
		System.out.println(this.id + ": After eating, go thinking...[E3]");
				
				try{	// Can not eat ... so go thinking				
					System.out.println(this.id + ": Go thinking...(Type 0)[E4]");
					Thread.sleep(999);
				
				}catch (InterruptedException e) {
					
					System.out.println(this.id + ":I don't want to eat!!!...[E4]");                      
					
					}
		
	} 
    
}

