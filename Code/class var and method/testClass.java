class testClass{
	
	public static void main(String[] args){
		//call class var
		System.out.println(just4Grading.why);
		just4Grading.why ="I want to change!";
		System.out.println(just4Grading.why);
		// call class method
		just4Grading.showClassNum();
		
		System.out.println(" ");
		
		just4Grading test1 = new just4Grading();
		just4Grading.showClassNum();
		//call object method
		test1.showInfo();
		
		System.out.println(" ");
		
		just4Grading test2 = new just4Grading("Ken");
		just4Grading.showClassNum();
		//call object method
		test2.showInfo();
		
		
		System.out.println(" ");
		
		just4Grading test3 = new just4Grading("Jason","Dog");
		just4Grading.showClassNum();
		//call object method
		test3.showInfo();
		
		System.out.println(" ");
		
		just4Grading test4 = new just4Grading("Yen","Cat","Black");
		just4Grading.showClassNum();
		//call object method
		test4.showInfo();
		
		
		}
	
	
	
	
	
	
	}

class just4Grading{
	
	
	private String name;
	private String pet;
	private String color;
	private int id;
	
	// class var
	private static int class_num = 0;
	public static String why ="Just for Grading";
	
	public just4Grading(){
		
		this.id = just4Grading.class_num; // this refers to the object instance so not use it at class_num
		this.name = "name no-defined";
		this.pet = "pet no-defined";
		this.color = "color no-defined";
		//just4Grading.class_num++; // able to not use it
		class_num++;
		
		}
	
	public just4Grading(String name){
		
		this(name,"pet no-defined");
		
		}
		
	public just4Grading(String name,String pet){
		
		this();
		//change 
		this.name = name;
		this.pet = pet;
		
		}
		
	public just4Grading(String name,String pet,String color){
		
		this(name,pet);
		
		this.color = color;
		
		
		}
		
	//class method
		
	public static void showClassNum(){
		
		System.out.println("There are "+getClassNum()+" class objects!");
		
		
		}
	private static int getClassNum(){
		
		return class_num;
		
		}
	
	public int getID(){
		
		return this.id;
		
		}	
		
	public String getName(){
		
		return this.name;
		
		}
	
	public String getPet(){
		
		return this.pet;
		
		}
	
	public String getColor(){
		
		return this.color;
		
		}
		
	public void showInfo(){
		
		System.out.println("id: "+getID());
		System.out.println("name: "+getName());
		System.out.println("pet: "+getPet());
		System.out.println("Color: "+getColor());
		
		}
	
	
	}