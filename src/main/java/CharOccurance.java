
public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "beginnersbook"; 
		countEachChar(str); 
		/*
		 * String str="capegemini"; int count=1; char strch[]=str.toCharArray(); for(int
		 * i=0;i<strch.length;i++) { for(int j=1;j<strch.length;j++) {
		 * if(strch[i]==strch[j]) { count++;
		 * System.out.println("The occurance of"+strch[i]+count); count--; }
		 * 
		 * } }
		 */
		
		/*String str="capegemini";
		int counter[]=new int[256];
		int intvalue=str.charAt(0);
		char chvalue=str.charAt(0);
		
		System.out.println(chvalue);

		System.out.println(intvalue);
		
		for (int i = 0; i < str.length(); i++) {
			counter[str.charAt(i)]++;
		
		System.out.println(counter); }
		
	}
*/
	}
	   static void countEachChar(String str) 
	   { 
		//ASCII values ranges upto 256
		int counter[] = new int[256]; 

		//String length
		int len = str.length(); 

		/* This array holds the occurrence of each char, For example
		 * ASCII value of A is 65 so if A is found twice then 
		 * counter[65] would have the value 2, here 65 is the ASCII value
		 * of A
		 */
		for (int i = 0; i < len; i++) {
			counter[str.charAt(i)]++; 
			System.out.println(counter[str.charAt(i)]);
		}

		// We are creating another array with the size of String
		char array[] = new char[str.length()]; 
	        for (int i = 0; i < len; i++) { 
		   array[i] = str.charAt(i); 
		   int flag = 0; 
		   for (int j = 0; j <= i; j++) { 

			/* If a char is found in String then set the flag 
			 * so that we can print the occurrence
			 */
			if (str.charAt(i) == array[j])  
				flag++;                 
		   } 

		   if (flag == 1)  
		      System.out.println("Occurrence of char " + str.charAt(i)
			 + " in the String is:" + counter[str.charAt(i)]);             
		} 
	   } 
	    
	}


