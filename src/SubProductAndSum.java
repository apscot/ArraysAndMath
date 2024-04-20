
public class SubProductAndSum {
	public int subtractProductAndSum(int n) {
        int mult =1;
        int sum =0;

        while(n>0){
            int temp = n%10;
            mult = mult * temp;
            sum = sum +temp;
            n= n/10;
        }
        return mult-sum;
    }

}
