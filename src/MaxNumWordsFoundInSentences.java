
public class MaxNumWordsFoundInSentences {

	 public int mostWordsFound(String[] sentences) {
	        int big = 0;
	        for(String s:sentences){
	            String[] p = s.split(" ");
	            big = Math.max(big,p.length);
	        }
	        return big;
	    }
}
