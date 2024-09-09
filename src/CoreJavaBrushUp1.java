
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=5;
        String website="udemy.com";
        char letter='a';
        double dec=5.99;
        boolean card=true;
        
        /*System.out.println(num);
        System.out.println(num + "is the value of num");
        System.out.println(website);
        System.out.println(letter);
        System.out.println(dec);
        System.out.println(card);*/
        
        
        //Arrays - can store multiple values in one single variable
        //declaring an array
        int[] arr=new int[5]; //array will have 5 integers , new creates memory for array
        // if values are not known initially, values come from web browser in middle of scripting
        //values will store from 0 index
        arr[0]=6;
        arr[1]=7;
        arr[2]=8;
        arr[3]=9;
        arr[4]=10;
        
        //or
        
        int[] arr1= {6,7,8,9,10}; // if you know values before use this syntax
       // System.out.println(arr1[2]);
        
        //FOR Loop ; before every iteration it will check the condition i<arr.length
        for(int i=0;i<arr.length;i++)
        {
        	System.out.println(arr[i]);
        }
        
        
        String[] name= {"swati","vikrant","sujata"};
       /* for(int i=0;i<name.length;i++)
        {
        	System.out.println(name[i]);
        }
        */
        
        // or
        
        for(String s:name)
        {
        	System.out.println(s);
        }
        
        	}

}
