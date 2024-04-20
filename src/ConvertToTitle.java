
public class ConvertToTitle {
	
	 public String convertToTitle(int columnNumber) { 
	        StringBuilder sb = new StringBuilder();
	        while(columnNumber != 0){
	            columnNumber--;
	            int remain = columnNumber % 26;
	            sb.insert(0, (char)(remain + 'A'));
	            columnNumber /= 26;
	        }
	        return sb.toString();
	    }

}
