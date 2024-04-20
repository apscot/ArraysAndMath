import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
	public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> list = new ArrayList<>();
        boolean check = false;
        for(int i=left;i<=right;i++){
            int val =i;
             check = true;
                while(val!=0){ 
                    if(val%10==0 || i%(val%10)!=0){
                        check=false;
                        break;
                    }
                    val=val/10;
                }
                if(check)
                    list.add(i);
        }
        return list;
    }

}
