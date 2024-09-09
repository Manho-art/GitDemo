
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// String is an object that represents sequence of characters  ( don't say String is sequence of characters)
		
		//String can be declared as string literal or using new keyword
		//String literal
		
		//String s="i love india";
		String s1="i love india";
		//both values are same so one obj will be created
		String s2="jai"; 
		//new obj will be created as value is diff
		
		// java will not create another object, it will check if i love india is present in memory for any variable,
		// for s1 , it will point s1 to i love india value
		//only one object will be created in memory if 2 3 objects have same value
		
		
		// String as object- with new keyword
		
		String r=new String("swati");
		String r1=new String("swati");
		// every time it creates new object
		
		// to split the string into 3 parts
		String s="i love india";
		/*
		String[] splitted=s.split(" "); // s.split give array of strings
		System.out.println(splitted[0]);
		System.out.println(splitted[1]);
		System.out.println(splitted[2]);
		 
		
		//or 
		/*
		for(String name:splitted)
		{System.out.println(name);}
		
		*/
		
		
		String t="i love india";
		//String[] test=t.split("love"); // s.split give array of strings
		//System.out.println(test[0]); // this has i+space
		//System.out.println(test[1]); // this has space+india
		
		// to trim the space
		//System.out.println(test[1].trim());
		
		// to print each character in the String array
		/*
		for(int i=0;i<t.length();i++)  // String is basically collection of characters, so it can be considered as array
		{
			System.out.println(t.charAt(i));
		}
		*/
		
		// to print characters in reverse order
		for(int i=t.length()-1;i>=0;i--)   // start from array length-1 , go till 0 and do i--
		{
			System.out.println(t.charAt(i));
		}
		
	}

}
