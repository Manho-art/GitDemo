import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		
		// to print multiples of 2
		/*
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] % 2==0)
					{
				     System.out.println(arr[i]);
					}
			else
			{
				System.out.println(arr[i]+"is not a multiple of 2");
			}
		}
		
		*/
		
		
		// to check if array has multiples of 2
		//in this case when array reaches 2 it has found multiple of 2, so our goal is achieved no need to scan all elements
				/*
		for(int i=0;i<arr.length;i++)
				{
					if(arr[i] % 2==0)
							{
						     System.out.println(arr[i]);
						     break; //loop will end here
							}
					else
					{
						System.out.println(arr[i]+"is not a multiple of 2");
					}
				}
				*/
				
				//Array List  -  can dynamically increase size of array
		 		//in array size of array is fixed can't be increased later
		
				
				ArrayList<String> a= new ArrayList<String>();
				//create object of array list class to access methods of array list class  , object.method
				a.add("swati");
				a.add("sujata");
				a.add("vikrant");
				//System.out.println(a);
				
				//a.remove(0); //remove item at index 0
				//System.out.println(a);
				
				//System.out.println(a.get(2)); // to get value at index 2
				
				for(int i=0;i<a.size();i++)  //  for array- we use length ,for array list - we use size()
				{
					System.out.println(a.get(i));
				}
				
				//or
				
				System.out.println("*********");
				
				for( String s:a)
				{
					System.out.println(s);
				}
				
				System.out.println("*********");
				
				// to check if item is present in arraylist  
				//array does not have any such method to check if item is present or not , but arraylist have
				//System.out.println(a.contains("vikrant"));
				
				
				//  to convert normal array to array list
				String[] name= {"ruchi","ankur","manisha"};
				List<String> nameArrayList=Arrays.asList(name);
				System.out.println(nameArrayList.contains("ruchi"));
				
				
				//conclusion: 
				//array has static size , in array list size can be changed dynamically 
				//we can do lot of operations with arraylist
				}
}
