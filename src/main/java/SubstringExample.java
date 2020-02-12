
public class SubstringExample {
	public static String removeDupsInPlace(String word) {
	    final StringBuilder output = new StringBuilder();
	 
	    for (int i = 0; i < word.length(); i++) {
	      //String character = word.substring(i, i + 1);
	    	Character character=word.charAt(i);
	    String	character1=character.toString();
	      if (output.indexOf(character1) < 0) // if not contained
	        output.append(character1);
	    }
	    return output.toString();
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="karthik";
		String str2=str.substring(0, 1);
		String str3=str.substring(0);
		StringBuilder output=new StringBuilder();
		System.out.println(str2);
		System.out.println(str3);
		String character="k";
		System.out.println(output.indexOf(character));
		String result=removeDupsInPlace("capegemini");
		System.out.println(result);
		

	}

}
