
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//methods- lines of code which we want to reuse again and again
		MethodsDemo d=new MethodsDemo(); //create object of class to access methods of class
		//d.getData();
		String name= d.getData1();
		System.out.println(name);
		
		//to access methods of other class in current class
		// to use getUserData method of MethodsDemo2 class , need to create obj of MethodsDemo2 class
		MethodsDemo2 e=new MethodsDemo2();
		e.getUserData();
		
		// to call static method - no need of object, we can directly call method
		demoMethod();
	}
	
	//methods should be created outside main block under the class
	//main block is for execution
	
	 
	/* public means this method can be used by other classes also
	void means returns nothing 
	if return type is int , the method will return integer
	if return type is String , method will return string*/
	public void getData() 
	{
		System.out.println("hello world");
	}

	
	public String getData1() // this method returns string
	{
		return "swati";
	}
	
	// this method can be directly accessed at class level, no need of creating object of class
	public static void demoMethod()
	{
		System.out.println("this is static method");
	}
}
