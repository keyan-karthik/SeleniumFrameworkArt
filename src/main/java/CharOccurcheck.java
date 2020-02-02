import java.util.HashMap;
import java.util.Map;

public class CharOccurcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="capegemini";
		int count=0;
		char strarray[]=str.toCharArray();
		/*
		 * for(int i=0;i<strarray.length-1;i++) { System.out.println(strarray[i]); }
		 */
		
		Map<Character,Integer>countmap=new HashMap();
		
		for(int i=0;i<strarray.length-1;i++)
		{
			if(countmap.containsKey(strarray[i]))
			{
				countmap.put(strarray[i], countmap.get(strarray[i])+1);
			}
			else {
				countmap.put(strarray[i], 1);
			}
		}
		
		System.out.println(countmap);		

	}

}
