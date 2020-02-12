import java.util.HashMap;
import java.util.Map;

public class DuplicateReplacecharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello";
		char[] strArr=str.toCharArray();
		Map<Character,Integer>countmap=new HashMap();
		for(int i=0;i<strArr.length;i++)
		{
	      if(countmap.containsKey(strArr[i]))
	      {
	    	  countmap.put(strArr[i], countmap.get(strArr[i])+1);
	      }
	      else
	      {
	    	  countmap.put(strArr[i], 1);
	      }
	      
	    		
		}
		System.out.println(countmap);
	}

}
